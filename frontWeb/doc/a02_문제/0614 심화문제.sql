/*
[1단계:개념] 1. 제약조건의 각각의 특징을 기본 예제를 통해서 설정하고 확인하세요.
 **/

CREATE TABLE food(
	fno number PRIMARY KEY,
	food_name varchar2(50) NOT NULL,
	price number check(price BETWEEN 1000 AND 100000),
	restau varchar2(60)
);

SELECT * FROM food;

INSERT INTO food values(1000,'짜장면',8000,'홍콩반점');
INSERT INTO food VALUES(1001,NULL,100,'탄');

/*
[1단계:코드] 2. 쇼핑몰의 회원 정보/구매정보/물품정보를 테이블로 만들 때, 오늘 배운 제약조건 5가지를 통해 만드세요
*/

CREATE TABLE MemberShop (
	memberNo NUMBER PRIMARY KEY,
	name varchar2(50) NOT NULL,
	gender varchar2(3) check(gender IN ('남','여')),
	contact varchar2(30),
	address varchar2(90) NOT NULL
);


INSERT INTO MemberShop values(1000,'홍길동','남','010-1234-1234','서울');
INSERT INTO MemberShop values(1001,'김길동','여','010-4567-1234','인천');
INSERT INTO MemberShop values(1002,'오길동','남','010-9999-1234','강원');

CREATE TABLE ProductShop(
	pNo NUMBER PRIMARY KEY,
	pname varchar2(50) NOT NULL,
	price NUMBER,
	stock number
);

INSERT INTO ProductShop VALUES(2000,'PS5',700000,20);
INSERT INTO ProductShop VALUES(2001,'Switch',300000,10);
INSERT INTO ProductShop VALUES(2002,'Xbox',500000,40);

CREATE TABLE buyP (
	buy_No NUMBER PRIMARY KEY,
	count NUMBER CHECK(count BETWEEN 1 AND 99),
	pNo NUMBER CONSTRAINTS buyP_pNo_fk 
		REFERENCES ProductShop(pNo),
	memberNo NUMBER CONSTRAINTS buyP_memberNo_fk
		REFERENCES MemberShop(memberNo)
);

INSERT INTO buyP VALUES (3000,3,2002,1000);

SELECT * FROM buyP;

/*
[1단계:코드] 3. 컴퓨터부품테이블(부품key, 부품명, 가격, 재고량, 부품 설명)만들되, 
sequence를 이용해서 부품key를 설정해서 할당하도록 하세요.
 **/

CREATE SEQUENCE seq2
	START WITH 1000;

CREATE TABLE comPart(
	partNo varchar2(50) PRIMARY key,
	partName varchar2(50) NOT NULL,
	price NUMBER,
	stock NUMBER CHECK(stock BETWEEN 1 and 99),
	description varchar2(90)
);

INSERT INTO comPart values('cpu-'||seq2.nextval,'라이젠 시리즈',200000,50,'AMD CPU');

SELECT * FROM comPart;

/*
 [1단계:코드] 4. Enrollments라는 테이블을 생성하고, 학생의 학번(student_id)과 수강한 강의의 고유번호(course_id)를 
 저장하는데, 각각의 값은 Students 테이블과 Courses 테이블의 학번과 고유번호를 참조하는 외래키로 설정되도록 하세요. 
 */

CREATE TABLE students(
	student_id varchar2(50) PRIMARY KEY,
	name varchar2(20),
	grade NUMBER,
	gender varchar2(3) check(gender IN ('남','여')),
	contact varchar2(30)	
);

INSERT INTO students values('20170640','오길동',1,'남','010-1234-5432');
INSERT INTO students values('20150220','김길동',4,'남','010-123-5431');
INSERT INTO students values('20190910','한길동',3,'여','010-4123-5402');

CREATE TABLE courses(
	course_id varchar2(30) PRIMARY KEY,
	courseName varchar2(50),
	professor varchar2(20),
	description varchar2(90)
);

INSERT INTO courses values('Math-'||seq2.nextval,'1차 방정식','오태식','1차 방정식에 대한 학습');
INSERT INTO courses values('Math-'||seq2.nextval,'2차 방정식','김태식','2차 방정식에 대한 학습');
INSERT INTO courses values('Math-'||seq2.nextval,'3차 방정식','신태식','3차 방정식에 대한 학습');

SELECT * FROM courses;

CREATE TABLE enrollments (
	course_id varchar2(30) REFERENCES courses(course_id),
	student_id varchar2(50) REFERENCES students(student_id)
);

INSERT INTO enrollments VALUES ('Math-1004',20170640);
INSERT INTO enrollments VALUES ('Math-1004',20150220);
INSERT INTO enrollments VALUES ('Math-1005',20190910);

SELECT * FROM enrollments;
DROP TABLE enrollments;
DROP TABLE students;