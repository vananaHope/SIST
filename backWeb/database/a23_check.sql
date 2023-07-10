/*
 # check 
 1. 특정 컬럼에 조건이나 범위를 지정해서 
 	해당 범위에 데이터만 입력되도록 처리하는 것을 말한다.
 2. 형식
 	 컬럼명 데이터유형 constraint 제약명 check(조건데이터-where문 하위 sql)
 	 컬럼명 데이터유형 check(제약조건 내용) 	 
  
 */

CREATE TABLE student06(
	gender varchar2(1) CONSTRAINT student05_gender_ck 
		check(gender IN('F','M'))
)

INSERT INTO STUDENT06 VALUES('F');
INSERT INTO STUDENT06 VALUES('M');
INSERT INTO STUDENT06 VALUES('남');
INSERT INTO STUDENT06 VALUES('여자');
INSERT INTO STUDENT06 VALUES('F');

SELECT * FROM STUDENT06;

-- student07 테이블을 생성해서 
-- sno(프라이머리 키), 이름, 성별(남/여), 국어(0~100), 영어(0~100), 수학(0~100)

CREATE TABLE student07 (
	sno NUMBER PRIMARY KEY,
	name varchar2(30),
	gender varchar2(3) CONSTRAINT student07_gender_ck 
		check(gender IN ('남','여')),
	kor NUMBER check(kor BETWEEN 0 AND 100),	
	eng NUMBER check(eng BETWEEN 0 AND 100),
	math NUMBER check(math BETWEEN 0 AND 100)
);

DROP TABLE STUDENT07;

INSERT INTO student07 values(1000,'노현우','남',100,90,90);
INSERT INTO student07 values(1001,'홍길동','남',100,90,90);


/*
 # 외래키 설정 관계(foreign key)
 1. 연관관계 있는 두 테이블에 대하여, 한 쪽 테이블에 있는 데이터 기준으로 
 다른 테이블의 데이터를 입력할 수 있게 하는 것을 말한다.
 	ex) dept테이블의 deptno만 emp테이블에 입력가능하게 처리
 2. 기본 형식
 	컬럼명 데이터유형 constraint 테이블명_컬럼명_fk 
 		references 대상테이블명(컬럼명)
 	
 **/

CREATE TABLE teacher01(
	tno NUMBER PRIMARY key
);

INSERT INTO teacher01 values(10);
INSERT INTO teacher01 values(20);
INSERT INTO teacher01 values(30);

SELECT * FROM teacher01;

CREATE TABLE student08(
	name varchar2(10),
	tno NUMBER CONSTRAINT student08_tno_fk
		REFERENCES teacher01(tno)
);

INSERT INTO student08 values('홍길동',10);
INSERT INTO student08 values('김길동',20);
INSERT INTO student08 values('신길동',30);
INSERT INTO student08 values('오길동',40);
SELECT * FROM student08;

/*
 ex) 물건 테이블(물건번호, 물건명, 가격, 재고량)
 	 구매 테이블(구매번호, 구매수량, 물건번호-외래키설정)
  
    
 */

CREATE SEQUENCE seq1
	START WITH 1000
	MAXVALUE 2000;

CREATE TABLE product99(
	pno NUMBER PRIMARY KEY,
	pname varchar2(50),
	price NUMBER,
	stock number
);

CREATE TABLE buy99(
	bno NUMBER,
	count NUMBER,
	pno NUMBER CONSTRAINT buy99_pno_fk 
		REFERENCES product99(pno)
);


INSERT INTO product99 VALUES (seq1.nextval,'갤럭시',900000,40);

SELECT * FROM product99;

INSERT INTO buy99 VALUES (1,5,1001);

SELECT * FROM buy99;

