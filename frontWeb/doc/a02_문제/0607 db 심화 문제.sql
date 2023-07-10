--예제0607
--1. Group 함수 연습 예제:
--   1.1 직업별로 평균 급여를 계산하시오.

SELECT job, trunc(avg(sal),0) 평균급여 FROM emp GROUP BY job ORDER BY job;

--   1.2 각 부서별로 가장 높은 급여를 받는 사람을 찾으시오.
SELECT deptno, max(sal) FROM emp GROUP BY deptno ORDER BY deptno;

SELECT * 
FROM emp e, (
	SELECT deptno, max(sal) SAL
	FROM emp
	GROUP BY deptno
) me
WHERE e.deptno = me.deptno
AND e.sal = me.sal;

--2. Subquery 연습 예제:
SELECT sal 
--   2.1 급여가 평균 급여보다 많이 받는 사원들의 이름과 급여를 찾으시오.
SELECT e.ename, e.sal FROM emp e WHERE e.sal>(SELECT avg(sal) FROM emp);
--   2.2 Smith의 급여보다 많은 급여를 받는 사원들의 이름과 급여를 찾으시오.
SELECT sal FROM emp WHERE ename='SMITH';
SELECT e.ename, e.sal FROM emp e WHERE e.sal>(SELECT sal FROM emp WHERE ename='SMITH');

--   3.1 사원들의 이름과 부서 이름을 가져오시오. (부서에 할당되지 않은 사원도 포함)
-- 		outer join null이 나올 수 있는 테이블과 컬럼에 (+) 넣어 처리

SELECT e.ename, d.dname FROM emp e, dept d WHERE e.deptno(+)=d.deptno;
--   3.2 각 부서별로 최대 급여를 받는 사원의 이름을 가져오시오. 
--	 (부서에 할당되지 않은 사원도 포함)
--	  사원 1000 홍길동 NULL/50
--	  부서 10,20,30,40
SELECT deptno, max(sal) FROM emp GROUP BY deptno;

SELECT e.ename, d.dname
FROM emp e, dept d
WHERE e.deptno(+) = d.deptno
AND sal = (SELECT max(sal)
			FROM emp WHERE deptno = e.deptno);


--4. Group 함수와 Subquery를 조합한 연습 예제:
--   4.1 각 직업별로 최대 급여를 받는 사원의 이름을 가져오시오.
SELECT job, max(sal) FROM emp GROUP BY job ORDER BY job;

SELECT e.ename, e.job FROM emp e, (SELECT job, max(sal) sal FROM emp GROUP BY job) me
WHERE e.sal=me.sal AND e.job=me.job;

SELECT e.ename, e.job
FROM emp e
WHERE sal = (SELECT max(sal)
			 FROM emp
			 WHERE job = e.job
);

--   4.2 각 부서별로 최소 급여를 받는 사원의 이름을 가져오시오.
SELECT deptno, min(sal) FROM emp GROUP BY deptno ORDER BY deptno;

SELECT me.ename, me.dname, me.sal 
FROM 
	(
	SELECT ename, dname, e.deptno, SAL 
	FROM emp e, dept d
	WHERE e.deptno = d.deptno) me, 
	(
	SELECT deptno, min(sal) sal 
	FROM emp e 
	GROUP BY e.deptno) d
WHERE me.deptno = d.deptno
AND me.sal = d.sal;

SELECT e.ename, d.dname
FROM emp e, dept d
WHERE e.deptno = d.deptno
AND sal = (SELECT min(sal) FROM emp WHERE deptno = e.deptno);