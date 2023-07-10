SELECT * FROM EMPLOYEES e;
SELECT * FROM emp;
-- 사원번호(empno), 사원명(ename), 직책(job)
-- 관리자번호(mgr), 입사일(hiredate), 급여(sal)
-- 보너스(comm), 부서번호(deptno)
-- 급여가 (3000이상 이거나 2000미만)이고 부서명이 30이 아닌 데이터를 검색
-- 사원명과 관리자번호(mgr) - null인 경우 출력
-- null이 아닌 경우만 중복되지 않는 관리자번호를 출력하세요
-- 급여가 2000이상이고 보너스가 null이 아닌 경우를 출력하세요
-- 직책이 saleman이거나 부서번호가 20인 경우 사원명, 직책, 부서번호 출력

SELECT * 
FROM EMP 
WHERE deptno != 30 AND (sal >= 3000 OR sal < 2000);

SELECT * 
FROM EMP e 
WHERE ename IS NULL or mgr IS NULL;

SELECT DISTINCT mgr
FROM EMP e 
WHERE mgr IS NOT NULL;

SELECT ename, sal, COMM  
FROM EMP e 
WHERE sal >= 2000 
AND comm IS NOT NULL;

SELECT ename, job, deptno
FROM EMP e 
WHERE job = 'salesman' OR deptno = 20;



