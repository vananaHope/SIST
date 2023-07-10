/* 
 # 여러가지 조인 구문 형식 활용
 1. 조인은 기본 inner와 함께 여러가지 방식이 있다.
 2. 조인 형식
 	1) no equi join
 		조인하는 두 개의 테이블의 컬럼 값이 동일하지 않을 떄,
 		조인하는 형식
		- 범위로 조인하는 경우 		
 	
 	2) outer join
 		equi join의 조인 조건에서 양측 컬럼 값 중, 어느 하나라도
 		null이면 '=' 비교 결과가 거짓이 되어 null값을 가진 행은
 		출력이 되지 않는다.
 		
 	3) self join
 		테이블 컬럼 안에 내부적으로 연관관계가 있는 컬럼 간의 조인을 
 		말한다.
 	
 
 */
SELECT *
FROM emp e, dept d;
-- equi join(inner join) 12(emp)*4(dept) = 48건이 조인이 된다.
-- 범위로 join하는 경우
SELECT ename, sal FROM emp;
-- 등급, 최소급여, 최대급여 : 해당 등급에 최소 최대 범위를 설정
SELECT *
FROM SALGRADE s ;

SELECT ename, sal, grade
FROM emp e, SALGRADE s 
WHERE sal BETWEEN losal AND hisal;

-- 4등급에 해당 하는 사원 정보를 출력하세요
SELECT grade, e.*
FROM emp e, SALGRADE s 
WHERE sal BETWEEN losal AND hisal
AND grade = 4;

-- ex) SMITH의 급여와 급여 등급을 출력하세요
SELECT ENAME, SAL, GRADE
FROM EMP E, SALGRADE s 
WHERE SAL BETWEEN losal AND hisal
AND ENAME = 'SMITH';

-- ex2) SALESMAN의 급여와 등급을 출력하세요
SELECT ENAME, JOB, SAL, GRADE
FROM EMP e , SALGRADE s 
WHERE sal BETWEEN losal AND hisal
AND JOB = 'SALESMAN';

SELECT * FROM jobs j;

/*
 # subquery, inline view을 통한 조인 구문 처리
 1. 조인하기 전에 데이터를 로딩해서 가져오는 형식을 subquery라고 한다.
 	1) subquery에서 컬럼에 대한 비교 연산식으로 subquery를 가져오는
 		형태가 있는 경우도 있고,
 		select *
 		from 테이블
 		where 컬럼 = ( sql 결과 ) 
 	2) sql 실행 결과를 테이블 형태로 선언(inline view)하여 처리하는
 		형태가 있다.
 		select *
 		from (
 			sql결과
 		)
 		where...
 		
 	3) 	
 		
 
 
 **/
-- 사원 정보 중 최고 급여자의 사원 정보를 출력하세요
SELECT max(sal)
FROM emp;

SELECT *
FROM EMP e
WHERE sal = (
	SELECT max(sal)
	FROM EMP  
);

-- ex1) 사원번호가 가장 낮은 사원의 정보를 출력하세요
SELECT *
FROM EMP e 
WHERE empno = (
	SELECT min(EMPNO)
	FROM emp
);


-- ex2) 사원 중에서 가장 최근에 입사한 사원의 정보를 출력하세요
SELECT *
FROM EMP e 
WHERE HIREDATE = (
	SELECT max(HIREDATE)
	FROM EMP 
);

-- view : 가상테이블, inline view(sql을 통해서 테이블 형태와 같이 바로 처리하는 것을 말한다.)

SELECT *
FROM emp e,
(
	SELECT max(sal) SAL
	FROM EMP 
) me
WHERE e.sal = me.sal;

-- 부서별 최고 급여자에 대한 정보를 출력하고자 한다.
SELECT deptno, max(sal)
FROM EMP e 
GROUP BY deptno;

SELECT e.*
FROM EMP e, 
(
	SELECT deptno, max(sal) sal
	FROM EMP e 
	GROUP BY deptno	
) me
WHERE e.DEPTNO = me.deptno
AND e.sal = me.sal
ORDER BY e.deptno;

-- ex) 직책별(job)로 가장 최근에 입사한 사원의 정보를 출력하세요
SELECT *
FROM EMP e , (
	SELECT job, max(hiredate) HIREDATE 
	FROM EMP e 
	GROUP BY job
) rh
WHERE e.job = rh.job 
AND e.hiredate = rh.hiredate;







