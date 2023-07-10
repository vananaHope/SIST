/*
# 기타 함수들
1. nvl(데이터, null값일 때 처리할 데이터)
	해당 데이터가 null값일 때, 처리할 데이터를 설정함으로
	null에 대한 여러가지 에러나 연산 처리 등에 대하여
	효과적으로 처리할 수 있다.

 **/

SELECT ename, sal, comm, sal+comm 합산,
		nvl(comm,0) 보너스 초기,
		sal + nvl(comm,0) 합산2
FROM emp;

/*
2. nvl2(데이터, null이 아닐 때, null일 때 처리)
	특정한 데이터(컬럼)이 null이 아닐 때와 null일 때를 구분하여 처리하는 경우
	ex) comm이 null일 때는 100, null이 아닐 때는 comm에서 
	10% 추가해서 결과값을 처리
	
	 
 **/

SELECT ename, sal, comm, nvl2(comm, comm*1.1, 100) "보너스"
FROM emp;

-- ex) comm이 null일 때는 sal의 15%로 설정하고, null이
--		아닐 때는 comm에서 sal의 5%를 더하여 보너스 금액을 처리
-- 		결과값을 10단위 절삭처리(floor()-정수, trunc()-자리수)

SELECT ename, sal, comm, nvl2(comm, trunc(comm+sal*0.05,-1), round(sal*0.15,0)) "보너스"
FROM emp;

/*
# nullif(데이터1, 데이터2)
두 개의 매개변수로 받는 데이터를 비교하여 동일하면 null을 반환하고,
동일하지 않으면 첫 번째 데이터1을 반환하는 함수를 말한다.
 
 **/

SELECT nullif('a','a') "동일할 때",
	   nullif('a','b') "다를 때",
	   nullif(15,20) "다를 때2",
	   nvl(NULLIF('a','a'),'동일') "중첩1",
	   nvl(NULLIF('a','b'),'동일') "중첩2"
FROM dual;	   
	   
-- nvl(nullif(데이터1,데이터2),'null일 때')
-- 중첩함수를 이용해서 동일 할 때는 문자열 처리, 다를 때, 데이터1 처리
-- ex1) comm이 0인 경우에는 null을 반환하고, 그렇지 않으면
--		comm 그대로 출력해서, 사원명, 급여, comm을 출력하세요
SELECT ename,sal,nullif(comm,0) "보너스"
FROM emp;
-- ex2) hiredate와 현재 날짜를 비교하여 hiredate가 현재 날짜와 같은 경우
-- 		null, 그렇지 않는 경우 hiredate 반환 sql
SELECT ename,nullif(hiredate,sysdate) 입사일
FROM emp;

/*
 # 조건을 처리하는 1단계 decode 함수
 1. 프로그램밍 언어의 if 문이나 case문으로 표현되는 내용을 하나의
 함수로 처리할 수 있게 해준다.
 
 2. 기본 형식
 	decode(데이터,케이스1,처리1,케이스2,처리2....그외 처리할 데이터)
 	
 */

-- 부서정보가 10(인사) 20(총무) 그 외는 부서미정 이라고 할 때
SELECT ename, decode(deptno, 10, '인사',
							 20, '총무',
							 '부서미정'
					) dname
FROM emp;

SELECT * FROM emp;
-- ex) 직책(job)을 기준으로 팀을 정하기로 했다.
--		CLERK인 경우 1팀, SALESMAN인 경우 2팀, 그 외는 미배정
--		이라고 처리할 때, 사원명과 팀을 출력하세요.

SELECT ENAME, decode(job,'CLERK','1팀','SALESMAN','2팀','미배정') "팀"
FROM EMP;


SELECT DISTINCT job
FROM emp;

-- ex) 사원번호를기준으로 짝수인 경우 홍팀, 홀수인 경우 청팀으로
--		처리해보자. 사원번호, 사원명, 팀

SELECT empno, ename, decode(MOD(empno,2),0,'홍팀','청팀') "팀"
FROM emp;

-- ex2) 사원의 직책(job)이 SALESMAN이면서 보너스(COMM)이 NULL이 아닌 경우에는 영업직, 그 외에는
--		비영업직이라는 영업직 여부를 사원번호, 사원명, 직책, 보너스, 영업직 여부를 출력하세요
-- hint) 3항 연산자 여러가지 조건 처리
SELECT empno,ename,job,comm, decode(job,'SALESMAN',decode(comm,NULL,'비영업직','영업직'),'비영업직') "영업직여부"
FROM EMP;

/*
 # 조건을 처리하는 함수 2단계 case
 1. decode의 확장된 형태로 컬럼값의 '=' 비교를 통해
 	조건의 일치하는 경우에만 다른 값을 대치하지만,
 	case 함수는 산술연산, 관계연산, 논리 연산을 통해
 	boolean으로 범위를 지정하여 다양한 비교가 가능하게 해준다.
 
 2. 기본 형식
 	1) 조건문 형태로 사용
 		조건문(논리,산술,관계,비교)
 		case when 조건문1 then 처리할 데이터
 			 when 조건문2 then 처리할 데이터
 			 else 위 조건에 해당하지 않는 경우 처리할 데이터
 		end alias명 
 			 
 	2) switch case문 형태로 사용
 		case 컬럼|데이터
 			when 케이스1 then 처리할 데이터
 			when 케이스2 then 처리할 데이터
 			when 케이스3 then 처리할 데이터
 			..
 			else 그 외 
 		end alias명	
 	
 	3)  
 		
 	
 
 **/
-- 부서번호에 따라서 보너스 적용
SELECT ename, deptno, sal, 
	CASE WHEN deptno = 10 THEN sal*0.2
		 WHEN deptno = 20 THEN sal*0.5
		 WHEN deptno = 30 THEN sal*0.7
		 ELSE sal*1.2
	END 보너스	 
FROM emp;

SELECT * FROM emp;

/* job에 따른 보너스 적용 CLERT

ex1) 급여의 %가 보너스
CLERK 5%
SALESMAN 10%
PRESIDENT 15%
MANAGER 17%
ANALYST 20%
그 외는 0%
를 적용해서 보너스와 급여, 합산을 출력하세요
*/
SELECT ename,job,sal,per,floor(per*100)||'%'"%",
		floor(sal*per) 보너스,
		floor(sal+sal*per) 합산
FROM(
SELECT ENAME, SAL, JOB,
	CASE WHEN JOB='CLERK' THEN SAL*0.05
		 WHEN JOB='SALESMAN' THEN SAL*0.1
		 WHEN JOB='PRESIDENT' THEN SAL*0.15
		 WHEN JOB='MANAGER' THEN SAL*0.17
		 WHEN JOB='ANALYST' THEN SAL*0.2
		 ELSE SAL*0
	END per
FROM EMP
);
/*
ex2) sal 5000이상 A, 4000~4999 B, 3000~3999 C, 2000~2999 D
		 2000미만 E
	급여 등급 출력

*/
SELECT ENAME, SAL,
	CASE WHEN SAL>=5000 THEN 'A'
		 WHEN SAL<5000 AND SAL>=4000 THEN 'B'
		 WHEN SAL<4000 AND SAL>=3000 THEN 'C'
		 WHEN SAL<3000 AND SAL>=2000 THEN 'D'
		 ELSE 'E'
	END 급여등급
FROM EMP;

-- ex3) 위 ex1을 switch case 문 형태로 적용해보세요
 
SELECT ename, job, sal,
	CASE JOB
		WHEN 'CLERK' THEN SAL*0.05
		WHEN 'CLERK' THEN SAL*0.05
		WHEN 'SALESMAN' THEN SAL*0.1
		WHEN 'PRESIDENT' THEN SAL*0.15
		WHEN 'MANAGER' THEN SAL*0.17
		WHEN 'ANALYST' THEN SAL*0.2
		ELSE SAL*0 
		END per
FROM emp;

-- 부서번호에 따른 보너스 처리
SELECT ename, deptno,
	CASE deptno
		WHEN 10 THEN sal*0.2
		WHEN 20 THEN sal*0.5
		WHEN 30 THEN sal*0.7
		ELSE sal*1.2
	END 보너스
FROM emp;	
	
/*
 # sign(n)
 1. 비교시 주로 활용(범위설정)
 	1) n < 0 : -1 리턴
 	2) n = 0 : 0 리턴
	3) n > 1 : 1 리턴 
 
 */
SELECT sign(-5),
	   sign(0),
	   sign(7)
FROM dual;	   

-- 급여가 3000이상인 경우와 그렇지 않은 경우
SELECT sal, sign(sal - 3000) div
FROM emp;

-- decode 함수와 함께 혼합해서 원하는 데이터를 처리
-- ex) decode와 sign을 활용해서 2000이상인 경우와
--		그렇지 않은 경우를 구분해서 2000미만인 경우 보너스 대상자 /
--		보너스 대상자 아님을 표시해보세요

SELECT ename, sal, decode(sign(sal - 2000),-1,'보너스 대상자','보너스 대상자 아님') "대상자"
FROM emp;

/*
 # extract
 1. 날짜에서 숫자형으로 연도, 월, 일을 추출할 때 활용한다.
 2. 형식
 	extract(옵션 from 날짜형 데이터)
 
 **/
SELECT 
	extract(YEAR FROM sysdate) "오늘연도",
	extract(MONTH FROM sysdate) "오늘월",
	extract(DAY FROM sysdate) "오늘일"
FROM dual;

SELECT *
FROM EMPLOYEES e ;

-- ex) employees의 hire_date를 이용해서 숫자형으로
--		년도, 월, 일을 뽑아내되, sign() decode()와 
--		혼합해서 2005년 이후 입사자 여부를 출력하세요

SELECT 
	extract(YEAR FROM hire_date) "연도",
	extract(MONTH FROM hire_date) "월",
	extract(DAY FROM hire_date) "일",
	decode(sign(extract(YEAR FROM hire_date)-2005),-1,'이전','이후') "2005년 이후 입사자"
FROM employees;	
	
