--1. emp 테이블에서 사원명과 직무를 이어서 표현하고, 직무는 대문자로 변환하여 출력하세요.
SELECT CONCAT(ENAME, upper(JOB)) "이름과 직무"
FROM emp;
--2. emp 테이블에서 사원명의 글자 수와 직무의 글자 수를 출력하세요.
SELECT length(ename) "사원명 글자수", length(job) "직무 글자수"
FROM emp;
--3. emp 테이블에서 직무가 'SALESMAN'인 사원들의 사원명과 직무를 이어서 표현하세요.
SELECT concat(ename,job) "이름과 직무"
FROM EMP e 
WHERE job = 'SALESMAN';
--4. emp 테이블에서 급여가 3000 이상인 사원들의 사원명과 급여를 이어서 표현하세요.
SELECT concat(ename, sal) "이름과 급여"
FROM EMP e 
WHERE sal >= 3000;
--5. emp 테이블에서 사원명에서 첫 글자만 대문자로 변환하여 출력하세요.
SELECT INITCAP(job)
FROM emp;
--6. emp 테이블에서 사원명과 직무를 이어서 표현하고, 사원명을 소문자로 변환하여 출력하세요.
SELECT concat(lower(ename),job) "이름과 직무"
FROM emp;
--7. emp 테이블에서 직무가 'ANALYST'인 사원들의 사원명과 직무를 이어서 표현하고, 직무를 소문자로 변환하여 출력하세요.
SELECT concat(ename,lower(job)) "이름과 직무"
FROM EMP e 
WHERE job = 'ANALYST';
--8. emp 테이블에서 직무가 'MANAGER'이거나 'SALESMAN'인 사원들의 사원명과 직무를 이어서 표현하고, 직무를 대문자로 변환하여 출력하세요.
SELECT CONCAT(ENAME,LOWER(JOB))
FROM EMP e 
--WHERE JOB = 'MANAGER' OR JOB = 'SALESMAN';
WHERE JOB IN ('MANAGER','SALESMAN');
--9. emp 테이블에서 급여가 2000 이상이고 3000 이하인 사원들의 사원명과 급여를 이어서 표현하세요.
SELECT CONCAT(ENAME,SAL) 
FROM EMP e 
WHERE SAL BETWEEN 2000 AND 3000;
--10. emp 테이블에서 사원명에서 첫 3글자를 추출하여 출력하세요.
SELECT substr(job,1,3)
FROM EMP e;

--11. emp 테이블에서 사원명에서 뒤에서 3글자를 추출하여 출력하세요.
SELECT substr(ename,-3)
FROM emp;
--12. emp 테이블에서 사원명에서 2번째부터 4번째까지의 글자를 추출하여 출력하세요.
SELECT substr(ename,2,4)
FROM emp;
--13. emp 테이블에서 사원명에서 뒤에서 5번째부터 뒤에서 2번째까지의 글자를 추출하여 출력하세요.
SELECT ename, substr(ename,-5,4)
FROM emp;
--14. emp 테이블에서 사원명에서 첫 번째와 두 번째 글자를 추출하여 이어서 출력하세요.
SELECT concat(substr(ename,1,1),substr(ename,2,1))
FROM emp;
--15. emp 테이블에서 직무가 'CLERK'인 사원들의 사원명과 직무를 이어서 표현하고, 사원명을 소문자로 변환하여 출력하세요.
SELECT concat(lower(ename),job)
FROM emp
WHERE job = 'CLERK';
--16. emp 테이블에서 직무가 'CLERK'가 아닌 사원들의 사원명과 직무를 이어서 표현하고, 직무를 대문자로 변환하여 출력하세요.
SELECT concat(ename,upper(job))
FROM EMP e 
WHERE job <> 'CLERK';
--17. emp 테이블에서 사원명과 직무를 이어서 표현하고,직무를 대문자로 변환하여 출력하세요. 단, 사원명과 직무 사이에 '/'를 추가하세요.
SELECT CONCAT(CONCAT(ENAME,'/'),UPPER(JOB))
FROM EMP;

SELECT ename||'/'||upper(job)
FROM emp;
--18. emp 테이블에서 급여가 1000 이하인 사원들의 사원명과 급여를 이어서 표현하세요.
SELECT CONCAT(ENAME,JOB)
FROM EMP e 
WHERE SAL <= 1000;