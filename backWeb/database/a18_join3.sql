/*
 # outer join
 1. equi join의 조인 조건에서 양측 컬럼 값 중 , 어느 하나라도
 	null이면 '=' 비교 결과가 거짓이 되어 null값을 가진 행은
 	출력이 되지 않는다.
 2. 부서번호에 해당하는 사원이 없으면 inner join시 해당 부서정보를 
 	표시 못하는 경우가 발생한다.
 3. 즉, 해당 부서에 사원이 없더라도 부서정보를 표시할 필요성이 있을 때는
 	equi join으로 불가능하게 된다.
 4. outer join 처리 형식
 	1) ANSI 방식
 		where 절의 조인 조건에서 outer join 연산자의 (+) 기호
 		사용하면 조인 조건에 의해 null로 출력되는 테이블의 컬럼 처리		 
 	
 * */

SELECT ename, deptno
FROM emp
ORDER BY deptno;

SELECT *
FROM dept;

SELECT d.*, e.*
FROM emp e, dept d
WHERE e.deptno(+) = d.DEPTNO 
ORDER BY d.deptno;

SELECT dname, nvl(ename,'사원없음') 사원명
FROM EMP e , DEPT d 
WHERE e.deptno(+) = d.DEPTNO
ORDER BY dname;

SELECT DISTINCT DEPARTMENT_ID  
FROM EMPLOYEES e;

SELECT *
FROM DEPARTMENTS d ;

-- ex) EMPLOYEES와 DEPARTMENTS의 DEPARTMENT_ID 기준으로
--		부서별, 사원명(FIRST_NAME)을 출력하되, 사원이 없는 곳은 
--		미배정이라고 표시하세요 

SELECT DEPARTMENT_NAME 부서명, NVL(FIRST_NAME,'미배정') 사원명
FROM EMPLOYEES e  , DEPARTMENTS d 
WHERE E.DEPARTMENT_ID(+) = D.DEPARTMENT_ID 
ORDER BY DEPARTMENT_NAME;

SELECT DEPARTMENT_NAME 부서명, COUNT(FIRST_NAME) 사원명
FROM EMPLOYEES e  , DEPARTMENTS d 
WHERE E.DEPARTMENT_ID(+) = D.DEPARTMENT_ID 
GROUP BY DEPARTMENT_NAME
ORDER BY DEPARTMENT_NAME;

/*
 # self join
 1. 테이블 컬럼 안에 내부적으로 연관관계가 있는 컬럼 간의 조인을 말한다.
 2. 하나의 테이블 내에 있는 컬럼끼리 연결하는 조인이 필요한 경우에 사용된다.
 	조인 대상 테이블이 자신 하나라는 것 이외에는 equi join가 동일한다.
 3. where 절을 사용하는 self join
 	  하나의 테이블에서 두 개의 컬럼을 연결하여 equi join
 	  from 절에서 하나의 테이블에 테이블의 별명을 따로 지정해서 처리
 4. 형식
 	  select a.*, b.*
 	  from 테이블 a, 테이블 b
 	  where a.컬럼 = b.컬럼
 		
 5. 사용 예
 	  emp 테이블에서 empno와 mgr은 연관관계의 계층형 join관계로 
 	  내부 join을 유지하고 있다.
 	  empno : 모든 사원 고유 번호
 	  mgr : 해당 사원의 관리자 번호
 	  SMITH의 관리자 번호는 7902이고, 이 관리자의 번호로 하는 이름은 FORD					
 	  							
 
 
 **/
SELECT EMPNO, ENAME, MGR
FROM EMP;

SELECT EMPNO, ENAME, MGR
FROM EMP e 
WHERE EMPNO = 7902;

SELECT EMPNO, ENAME, MGR
FROM EMP e 
WHERE EMPNO = 7566;

SELECT EMPNO, ENAME, MGR
FROM EMP e 
WHERE EMPNO = 7839;

SELECT E.EMPNO 사원번호, E.ENAME 사원명, E.MGR 관리자번호,
	   m.ename 관리자의이름
FROM emp e, emp m
WHERE e.mgr = m.empno; 
-- 하위테이블의 mgr(관리자번호)과 상위테이블의 empno연관관계로 SELF join

SELECT '사원명'|| E.ENAME ||'의 관리자는 '|| 
	   m.ename || '입니다.' show
FROM emp e, emp m
WHERE e.mgr = m.empno;
