/*
 # 테이블 생성
 1. 데이터베이스에서 핵심 객체인 테이블 물리적 sql에 의해서 처리되는 것을 말한다.
 
 2. 테이블 생성 기초
 	1) 데이터 유형
 		number : 숫자형
 		varchar2(byte) : 가변형 문자열
 			한글 3byte(oracle)
 			varchar2(10)
 			==> 최대문자열 10byte
 				영문은 글자 10, 한글 3
 				입력된 글자 크기만큼 메모리 할당
 				himan ==> 5byte
 		char(byte) : 고정형 문자열
 			char(10)
 			==> 무조건 10byte
 				'a' ==> 'a        '
 				자리수가 정해진 코드성 데이터를 
 				사용할 때, 활용할 때 사용된다.
 				주민번호, 학번, 사번, 제품serial번호
 				
 		Date : 날짜
 		==> 테이블 생성시, 사용되는 가장 기초적인 데이터 유형을
 		분류한 것이다.
 	2) 테이블 생성 기본형식
 		create table 테이블명(
 			컬럼1명 데이터유형,
 			컬럼2명 데이터유형
 		);
 		ps) 테이블 삭제 sql 
 		drop table 테이블명;	
 	3) 기본 데이터 입력 형식
 		insert into 테이블 values(데이터1, 데이터2...);
 		
 */
-- char() : 데이터의 크기가 고정되어 있을 때, 활용한다.
-- ex) 학번, 주민번호, 사번
-- 학생테이블1 학생명과 점수
CREATE TABLE student01(
	psid char(10),
	name varchar2(50),
	point number
);

INSERT INTO student01 values('홍길동',70);
INSERT INTO student01 values('김길동',80);
INSERT INTO student01 values('신길동',90);

SELECT * FROM student01;

DROP TABLE student01;

-- ex) 구매물건 정보 테이블(물건일련번호, 물건명, 판매가격)
CREATE TABLE product (
	id CHAR(10),
	name varchar2(50),
	price NUMBER
);

INSERT INTO product values('P-01','바나나',5000);
INSERT INTO product values('P-02','딸기',3000);
INSERT INTO product values('P-03','아보카도',2000);

SELECT * FROM product;


-- ex) 회원정보 테이블(회원아이디, 회원패스워드, 회원명, 포인트, 권한)

CREATE TABLE member(
	memId varchar2(50),
	memPw varchar2(50),
	name varchar2(50),
	point NUMBER,
	auth varchar2(50)
);

INSERT INTO MEMBER values('helloman','dd1234','홍길동',1000,'Bronze');
INSERT INTO MEMBER values('hellowoman','dd12fgfg','신길동',5000,'Silver');
INSERT INTO MEMBER values('fxxx','ff1234','김길동',10000,'Platinum');

SELECT * FROM MEMBER;
-- ex) 학생정보2 테이블(학생번호, 학생명, 국어, 영어, 수학)

CREATE TABLE student02 (
	sNumber NUMBER,
	sName varchar2(50),
	kor NUMBER(3),
	eng number(3),
	math number(3)
);

INSERT INTO student02 values(1,'홍길동',70,90,80);
INSERT INTO student02 values(2,'김길동',90,90,80);
INSERT INTO student02 values(3,'신길동',70,100,80);

SELECT * FROM student02;

/*
 # 데이터의 수정
 
   
 
 * */



