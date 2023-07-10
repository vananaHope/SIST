-- 1) employee 테이블 전체를 조회하고, 해당 컬럼을 조회해보세요.

SELECT * FROM EMPLOYEES;
SELECT employee_id FROM EMPLOYEES;
SELECT employee_id, FIRST_NAME  FROM EMPLOYEES;
SELECT employee_id, FIRST_NAME , LAST_NAME FROM EMPLOYEES;
SELECT employee_id, FIRST_NAME , LAST_NAME, PHONE_NUMBER  FROM EMPLOYEES;
SELECT employee_id, FIRST_NAME , LAST_NAME, EMAIL ,PHONE_NUMBER  FROM EMPLOYEES;
SELECT employee_id, FIRST_NAME , LAST_NAME, EMAIL ,PHONE_NUMBER, HIRE_DATE  FROM EMPLOYEES;
SELECT employee_id, FIRST_NAME , LAST_NAME, EMAIL ,PHONE_NUMBER, HIRE_DATE ,JOB_ID  FROM EMPLOYEES;
SELECT employee_id, FIRST_NAME , LAST_NAME, EMAIL ,PHONE_NUMBER, HIRE_DATE ,JOB_ID ,SALARY  FROM EMPLOYEES;
SELECT employee_id, FIRST_NAME , LAST_NAME, EMAIL ,PHONE_NUMBER, HIRE_DATE ,JOB_ID ,SALARY  FROM EMPLOYEES;
SELECT MANAGER_ID, DEPARTMENT_ID FROM EMPLOYEES;

--[1단계:개념] 2. 정보와 데이터의 차이점을 기술하세요.
-- 데이터는 현실에서 측정하거나 관측한 값을 말하며 ( 원유 )
--	정보는 이러한 데이터를 가공하여 유용하게 활용할 수 있도록 한 결과물을 말한다. ( 가공우유 )
--[1단계:개념] 3. 데이터의 형태에 따른 분류를 하고, 예를 나타내세요.
/*
 공유 데이터 : 특정 조직 내에 있는 어떤 사용자도 접속해서 다 같이 사용할 수 있는 데이터를 말한다.
 ex) 
 
 통합 데이터 : 최소한의 중복과 통제 가능한 중복만을 허용하는 데이터를 말하며, 데이터 간의 관계 속에서
 			통합적인 정보를 찾아내야 한다.
 			ex) 사원 정보와 급여에 대한 정보는 모두 다른 곳에 저장되어 있지만 이를 유용하게 사용하기 위해서는
 			통합적인 처리가 필요하다.
 
 저장 데이터 : 컴퓨터가 접근할 수 있는 물리적인 저장소에 저장된 데이터
 			ex) SSD, HDD, USB 등...
 
 운영 데이터 : 조직의 주요 기능을 수행하고 효율적으로 운영하는데 필수적인 데이터를 말한다.
 			ex) 쿠팡이츠, 배민 등에 있는 배달 관련 데이터들, 은행 대출을 상환하거나 빌려주는데 필요한 데이터들
 			기업의 비즈니스 알고리즘과 관련된 데이터들
 **/

--[1단계:개념] 5. 이산형 데이터와 연속형 데이터의 차이점을 기술하세요
/*
 이산형 데이터와 연속형 데이터 모두 크기와 연산이 가능한 수치형 데이터에 포함되는 것들이다. 하지만 두 개의 데이터는 차이가 있다.
 이산형 데이터는 개수를 세는 데 필요한 데이터로 물건의 개수, 가입자 수, 회원 수, 합격 지수 등에 주로 쓰이는 데이터를 말한다.
 연속형 데이터는 측정을 하는 데 필요한 데이터로 키, 몸무게, 물건의 길이 등에 주로 쓰인다.
  
 * */
--[1단계:개념] 6. 테이블과 컴럼명의 alias를 사용하는 방법을 예제를 통해서 기술하세요.

/*
 컬럼명 AS 별칭
 컬럼명 별칭
 컬럼명 "별칭" ==> 별칭을 띄어쓰거나 특수문자가 들어갈 때는 ""를 사용한다.
 **/

SELECT job AS "직업 종류"
FROM emp;

SELECT job "직업 종류"
FROM emp;

SELECT * FROM emp 직원;
--[1단계:개념] 7. 하나의 테이블을 사용할 때도 alias를 사용하는 경우를 기술하세요.



--[1단계:코드] 8. 아래의 형태로 사원정보(emp) 테이블의 컬럼이름에 맞는 데이터를 출력하세요
--              부서번호 - deptno  사원번호(empno) 직책(job)  급여(sal*12) 보너스

SELECT deptno 부서번호, empno 사원번호, job 직책, sal*12 "급여 보너스"
FROM emp;
--[1단계:코드] 9. 아래의 형식으로 컬럼간의 연산과 연결처리를 하여 alias로 출력하세요.
--     1) @@님의 사원번호는 @@이고, 올해 연말보너스는 연봉의 20%인 @@원입니다.  @@님(ename)
--     2) @@님의 입사일은 @@이고, 현재 연봉의 1/13인 월급여는 @@만원.   입사일 @@(hiredate)

-- 1)
SELECT ename||'님의 사원번호는 '||empno||'이고, 올해 연말 보너스는 연봉의 20%인'||sal*0.2||'원 입니다.' msg
FROM emp;

-- 2)
SELECT ename||'님의 입사일은 '||hiredate||'이고, 현재 연봉의 1/13인 월 급여는 '||sal/13||'만원 입니다.' msg
FROM emp;

