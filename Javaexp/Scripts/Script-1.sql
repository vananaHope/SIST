-- first_name과 last_name을 합쳐서 키워드 검색
-- salary를 범위를 정해서 검색 처리

SELECT * 
FROM employees
WHERE FIRST_NAME || LAST_NAME LIKE '%'||'A'||'%'
AND SALARY BETWEEN 0 AND 12000

SELECT * 
FROM employees
WHERE FIRST_NAME || LAST_NAME LIKE '%'||?||'%'
AND SALARY BETWEEN ? AND ?

class Employee {
	private int employee_id;
	private String FIRST_name;
	private String last_name;
	private String email;
	private String phone_number;
	private DATE hire_date;
	private String job_id;
	private double salary;
	private double commission_pct;
	private int manager_id;
	private int department_id;
}

;
-- sql을 map과 함께 처리해보세요
--SELECT *
--FROM JOB_HISTORY jh 
--WHERE jo_id LIKE '%'||?||'%'
--AND DEPARTMENT_ID BETWEEN ? AND ?
;

SELECT *
FROM JOB_HISTORY;

SELECT * 
FROM jobs;

SELECT *
FROM JOBS j 
WHERE job_title LIKE '%'||'S'||'%'
AND MIN_SALARY BETWEEN 1000 AND 10000
;

--SELECT *
--FROM JOBS j 
--WHERE job_title LIKE '%'||?||'%'
--AND MIN_SALARY BETWEEN ? AND ?

/*
 vo 클래스 선언
 메서드 호출
 **/

SELECT * FROM emp02;
-- sysdate : 현재 날짜/시간
-- 전체 컬럼데이터 입력
INSERT INTO emp02 values(1000,'홍길동','사원',7902,sysdate,4000,1000,10);
-- 특정 컬럼데이터 입력
-- 테이블명(입력할 컬럼 순서대로 나열)
-- 	   날짜로 변환('입력할 문자열','입력할 문자열의 형식')
SELECT to_date('2020-01-01','YYYY-MM-DD') FROM dual;

INSERT INTO emp02(empno, ename, hiredate, sal)
	VALUES(1002,'마길동',to_date('2020-01-01','YYYY-MM-DD'),3500);

-- ex) 1003 사원번호로 전체 데이터 입력
INSERT INTO EMP02 
	VALUES(1003,'하기동','대리',7902,
		to_date('2023-05-01','YYYY-MM-DD'),4500,1000,20);

-- ex2) 1004 2023-06-01, 오길동을 입력하세요.

INSERT INTO emp02(empno, ename, hiredate)
	values(1004,'오길동',to_date('2023-06-01','YYYY-MM-DD'));

/*
 INSERT INTO EMP02 
	VALUES(1003,'하기동','대리',7902,
		to_date('2023-05-01','YYYY-MM-DD'),4500,1000,20);

INSERT INTO EMP02 
	VALUES(?,?,?,?,
		to_date(?,'YYYY-MM-DD'),?,?,?);

입력 VO/MAP/배열

class Emp // 입력할 VO
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredateS; // 추가 처리
	private double sal;
	private double comm;
	private int deptno;
	
	
	
 **/

SELECT * FROM emp02 ORDER BY EMPNO ;
SELECT * FROM DEPARTMENTS d ;
-- DEPARTMENTS를 입력 처리하세요

CREATE TABLE DEPARTMENTS10
AS SELECT * FROM DEPARTMENTS d ;

SELECT * FROM DEPARTMENTS10; 

INSERT INTO DEPARTMENTS10
	values(80,'IT',300,1700);

/*
 # 수정 처리 구문 
 
 * */
SELECT * FROM emp02;
UPDATE EMP02 
	SET ename = '오길동(upt)',
		job = '대리',
		sal = 5000,
		HIREDATE = TO_DATE('2023/06/01','YYYY/MM/DD') 
	WHERE empno = 7369;	

/*
 수정할 생성자만 추가..
  UPDATE EMP02 
	SET ename = ?,
		job = ?,
		sal = ?,
		HIREDATE = TO_DATE(?,'YYYY/MM/DD') 
	WHERE empno = ?
 */
CREATE TABLE locations10
AS SELECT * FROM LOCATIONS l; 

UPDATE locations10
	SET street_address = '종로 1가',
		postal_code = '343122',
		city = '서울',
		state_province = '서울',
		country_id = 'SE'
	WHERE location_id = 1000;	
		
SELECT * FROM LOCATIONS10;

/*
 UPDATE locations10
	SET street_address = ?,
		postal_code = ?,
		city = ?,
		state_province = ?,
		country_id = ?
	WHERE location_id = ? 
 */

DELETE
FROM LOCATIONS10
WHERE location_id = 1100
;

/*
DELETE
FROM LOCATIONS10
WHERE location_id = ?*/

SELECT * FROM locations10;


CREATE TABLE member02(
	id varchar2(50),
	pass varchar2(50),
	name varchar2(50),
	point number,
	auth varchar2(20),
	regdate date
);

SELECT * FROM member02;
-- higirl, 8888, '홍리나',2000,'관리자'
INSERT INTO member02 
	values('himan','7777','홍길동',1000,'관리자',sysdate);

SELECT * FROM MEMBER02 m 
WHERE id = 'himan' AND pass = '7777';


 SELECT * FROM MEMBER02;
/*
 SELECT * FROM MEMBER02 m 
WHERE id = ? AND pass = ?

ShMember
private String id;
private String pass;
private String name;
private int point;
private String auth;
private Date regdate;
생성자 id, pass 추가
 **/

/*
 insert into member02 values(?,?,?,?,?,sysdate); 
 */

-- if, while 차이
-- 행이 다수 행의 데이터가 나온다. : while() row(행)
-- 행이 한 개 데이터가 나온다. : if row(행)
--	- 컬럼 1개 - 결과값이 1개의 column으로 표시되는 경우
--		기본데이터형, String
--	- 컬럼 여러개 select *, select empno, ename
--			객체(여러속성)

SELECT count(*)
FROM EMP e 
WHERE DEPTNO = 10;
