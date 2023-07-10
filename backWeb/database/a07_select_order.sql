/*
# keyword 검색(계속)
1. 자릿수에 맞추어서 검색하기
	ex) 앞에서 3번째 자리에 A를 포함하는 검색
		컬럼명 like '__A%'
	ex) 뒤에서 두번째 자리에 글자가 A가 있는 직책을 검색
		컬럼명 LIKE '%A_'	  
	ex) 글자수가 6자리이고 앞에서 3번째자리에 R이 있는 데이터 검색	  
 		컬럼명 LIKE '__R___'
 	 
 * * */
-- 날짜 검색 할 때
SELECT ENAME, ''||HIREDATE "문자열로"
FROM EMP;

SELECT ENAME, HIREDATE
FROM EMP e 
WHERE HIREDATE LIKE '___02%';


-- EX) 앞에서 4,5번째 자리에 ES를 포함한 직책 검색
SELECT * 
FROM EMP e 
WHERE JOB LIKE '___ES%';
-- EX) 뒤에서 세번째 자리에 M이 포함된 직책 검색
SELECT * 
FROM EMP e 
WHERE JOB LIKE '%M__';
-- EX) 자리수가 5자리이고 중간에 I자가 포함된 사원명 검색 
SELECT *
FROM EMP e 
WHERE ENAME LIKE '__I__';


SELECT *
FROM EMP e 
WHERE ENAME LIKE '__R___';


SELECT *
FROM EMP e 
WHERE JOB LIKE '%A_';

SELECT *
FROM EMP e 
WHERE ENAME LIKE '__A%';

/*
 # 정렬 처리
 1. SQL 명령문에서 검색된 결과는 테이블에 데이터가 입력된 순서로
 	일반적으로 출력된다.
 	
 2. 데이터의 출력 순서를 특정 컬럼을 기준으로 오름차순/내림차순으로
 	정렬하는 경우가 발생한다.
 	
 3. 여러 개의 컬럼에 대해 정렬 순서를 지정해서 처리해야 할 경우가 발생하는 데,
 	입사일을 오름차순으로 급여 기준으로 내림차순 등이라고 할 수 있다.
 
 4. 기본적인 정렬 방법
 	1) 문자값을 알파벳순으로 출력되고, 한글을 가나다라 순으로 출력된다.
 	2) 숫자값을 가장 작은 값으로부터 출력
 	3) 날짜는 최신 날짜순으로 출력할 수 있다.
 	
 5. 기본 형식
 	SELECT * FROM 테이블 WHERE 조건 다음에....
 	ORDER BY 컬럼1명 [ASC/DESC], 컬럼2명 [ASC/DESC]									
 	ASC : Default로 오름차순 정렬(생략가능)
 	DESC : 역순/내림차순으로 정렬
 	
 ***/

-- 사원 번호를 기준으로 오름차순/내림차순 정렬
SELECT empno, ename 
FROM emp;

SELECT empno, ename
FROM emp
ORDER BY empno DESC;

SELECT *
FROM EMP e 
ORDER BY empno DESC;

-- ex) 연봉이 가장 높은 사람부터 가장 낮은 사람으로 급여와 이름을 
--		출력하세요

SELECT ename, sal 
FROM EMP e 
ORDER BY sal DESC;

-- ex) 입사일을 기준으로 최근에 입사한 사람으로부터 입사를 먼저 한 사람을 나중에 출력하세요

SELECT hiredate, ENAME 
FROM EMP e 
ORDER BY HIREDATE DESC;

-- ex) 부서번호는 오름차순, 연봉은 내림차순으로 이중 정렬 기준으로 
-- 		부서번호 급여 사원명을 출력하세요

SELECT deptno, sal, ename
FROM EMP e 
ORDER BY deptno , sal DESC;

