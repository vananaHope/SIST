--1. 다음 중 SQL에서 문자의 첫 번째 문자만 대문자로 변환하는 함수는 무엇인가요?
--    - A) TO_UPPER()
--    - B) TO_LOWER()
--    - C) INITCAP() ###
--    - D) CAP_FIRST()
--		

--2. 다음 중 SQL에서 여러 행을 그룹화하여 그룹별로 결과를 반환하는 함수의 유형은 무엇인가요?
--    - A) 단일행 함수
--    - B) 복수행 함수 ###
--    - C) 변환함수
--    - D) 일반함수
--
--3. 다음 중 SQL에서 문자열 전체를 대문자로 변환하는 함수는 무엇인가요?
--    - A) UPPER() ###
--    - B) LOWER()
--    - C) INITCAP()
--    - D) CAPS()
--
--4. 다음 중 SQL에서 대상 컬럼의 데이터 대문자/소문자로 전환할 때 주로 사용하는 함수는 무엇인가요?
--    - A) SWITCH()
--    - B) CHANGE()
--    - C) UPPER() 또는 LOWER() ###
--    - D) FLIP()
--
--5. 다음 중 SQL에서 특정 문자열의 위치를 찾아주는 함수는 무엇인가요?
--    - A) FIND()
--    - B) SEARCH()
--    - C) INSTR() ###
--    - D) LOCATE()
--		특정 문자의 첫 번쨰 위치
--		instr(ename,'A')
--6. 다음 중 SQL에서 문자열 데이터를 시작 위치와 마지막 위치를 기준으로 절삭 처리하는 함수는 무엇인가요?
--    - A) CUT()
--    - B) TRIM() 
--    - C) SUBSTR() ###
--    - D) SLICE()
--		substr(문자열, 시작위치, 시작위치를 기준으로 개수)
--		ex) 주민번호, 사번, 학번 등의 데이터를 추출해서 각 코드의 위치에 있는 내용을 기준으로 처리
--7. 다음 중 SQL에서 두 문자열을 결합처리하는 함수는 무엇인가요?
--    - A) CONCAT() ###
--    - B) CONNECT()
--    - C) COMBINE()
--    - D) JOIN()
--		두 개 정도까지 사용하다가, 복잡성이 늘어나면 문자열1||문자열2
-- 		형식으로 처리한다.
--8. 다음 중 SQL에서 함수2를 적용하고 함수1을 적용하여 중첩적으로 적용되는 것을 표현하는 용어는 무엇인가요?
--    - A) 중복함수
--    - B) 복합함수
--    - C) 중첩함수 ###
--    - D) 복잡함수
--		여러가지 함수를 이용해서 원하는 데이터유형으로 변경되는 경우가 많기에 사용된다.
--		함수2(함수1(컬럼)) : 함수1이 적용되고, 함수2를 적용하는 경우를 말한다.
--9. 다음 중 SQL에서 문자열의 바이트 크기를 반환하는 함수는 무엇인가요?
--    - A) LENGTH()	문자열의 개수
--    - B) SIZE()
--    - C) BYTE()
--    - D) LENGTHB() 문자열의 byte 수 ###
--		length(), lengthb() 영문의 경우 1자가 1byte라서 동일하나,
--		한글의 경우 1자가 3byte이기에 차이가 난다.
--10. 다음 중 SQL에서 오른쪽에 있는 특정한 문자열을 삭제 처리하는 함수는 무엇인가요?
--    - A) LTRIM()
--    - B) RTRIM() ###
--    - C) TRIM()
--    - D) CUT()
--    ltrim(' himan ',' ') ==> 'himan '  왼쪽 공백 삭제
--    rtrim(' himan ',' ') ==> ' himan'  오른쪽 공백 삭제
--    trim(' ' from ' himan ') ==> 'himan' 양쪽 공백 삭제
--실습 문제:
--1. EMP 테이블에서 사원명(ename)을 대문자로 출력하세요.
SELECT upper(ename) 사원명
FROM emp;
--2. EMPLOYEES 테이블에서 사원번호(empno)가 100인 데이터의 이메일(email)을 소문자로 출력하세요.
SELECT lower(email) 이메일
FROM EMPLOYEES e 
WHERE EMPLOYEE_ID  = 100;
--3. EMP 테이블에서 사원명(ename)과 부서번호(deptno)을 연결한 결과를 출력하세요. 결과 컬럼 이름은 "이름/부서"로 지정하세요.
SELECT concat(concat(ename,'/'),DEPTNO) "이름/부서번호"
FROM EMP; 
--4. EMP 테이블에서 직원명(ename)과 입사일(hiredate)을 연결한 결과를 출력하세요. 결과 컬럼 이름은 "이름/입사일"로 지정하세요.
SELECT concat(concat(ename,'/'),hiredate) "이름/입사일",
		to_char(hiredate,'YYYY/MM/DD') 날짜
FROM emp;
--5. EMP 테이블에서 입사일(hire_date)이 1981년인 데이터의 사원명(ename)과 입사일(hire_date)을 출력하세요.
SELECT ename,hiredate
FROM emp
WHERE instr(hiredate,'81')>0;
--6. EMPLOYEES 테이블에서 사원번호(employee_id)가 200 또는 300인 데이터의 이메일(email)과 직무(job_id)를 출력하세요.
SELECT email, job_id
FROM EMPLOYEES e 
WHERE EMPLOYEE_ID IN (200,300);
--7. EMP 테이블에서 직원명(ename)을 출력하되, 이름의 앞뒤에 있는 공백을 제거한 결과를 출력하세요.
SELECT ename, trim(' ' FROM ename)
FROM emp;
--8. EMPLOYEES 테이블에서 이메일(email)에 "J"가 포함된 데이터의 사원명(ename)과 이메일(email)을 출력하세요.
SELECT first_name, email
FROM EMPLOYEES e 
WHERE email LIKE '%J%';