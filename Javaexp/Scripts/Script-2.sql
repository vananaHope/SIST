/*
 # 데이터 무결성 제약 조건
 1. 데이터의 정확성과 일관성을 보장
 2. 데이터의 정확성을 유지하여 다양한 종류의 업무규칙을 고려함
 	1) student테이블에서 학년 데이터는 1,2,3,4 중의 하나만 입력
 	2) 모든 학번은 유일하게 처리
 	3) student 테이블의 지도 교수 번호는 professor 테이블의
 		교수번호 중의 하나와 반드시 일치
 3. 데이터 무결성 제약조건의 장점
 	1) 테이블 생성 시 무결성 제약 조건을 정의 가능
 		- 생성 후 제약 조건 변경이나 설정도 가능
 	2) 테이블에 대해 정의, 데이터 딕션너리에 저장되므로 
 		응용 프로그램에서 입력되는 모든 데이터에 대하여 동일하게 적용
 	3) 제약조건을 활성화, 비활성화 할 수 있어 융통성 있게 사용 가능
 4. 무결성 제약조건의 종류
 	1) not null : 데이터에 null을 포함할 수 없음
 				  행단위로 입력시 해당 열은 반드시 입력되어야 처리가 된다.
 	2) unique key : 테이블의 모든 행에서 고유한 값을 갖는 열 또는 열 조합을 지정해야 한다.
 					ex) 학번, 주민번호, 사원번호는 중복되지 않아야 한다.
 		ps) null은 입력이 가능하고, 여러가지 null은 중복이 가능						  
 	3) primary key : 해당 컬럼 값은 반드시 존재하며 유일해야 한다.
 		not null과 unique가 결합된 형태
 		주로 테이블에서 식별해야할 컬럼 즉, key를 설정할 때, 사용된다.
 		ex) emp테이블의 empno, dept테이블의 deptno
 	4) foreign key : 한 열과 참조된 테이블의 열 간의 외래 키 관계를 설정하고 시행
 		ex) 사원 테이블의 부서번호는 반드시 부서테이블에 있는 부서번호이어야 한다.
 	5) check : 해당 컬럼에 저장가능한 데이터 범위나 조건을 지정 처리
 		ex) student 테이블의 학년은 1,2,3,4만 데이터로 넣을 수 있다.
 5. 설정 형식
 	1) 컬럼명 데이터타입 constraints 제약조건명 제약조건
 		제약조건명 : 테이블명_컬럼명_제약조건종류
 	2) primary key 지정
 	
 	ex) create table student(
 			stuno number constraint student_stuno_pk primary key
 		);			
 		제약조건 이름 : 테이블명_컬럼명_제약조건종류
 			제약조건 종류 : pk, uq, nn, fk
 		이런 제약조건 사항은 sys.all_constraints : DB시스템에 있는 제약조건 메타테이블에서 확인할 수 있다.	
 				 
 				 	 	 
 
 * */
-- 사원 정보의 제약 조건 테이블에서 확인해보기
SELECT *
FROM sys.all_constraints
WHERE table_name LIKE 'EMP';
-- # not null 제약 조건 설정
CREATE TABLE student03(
	name varchar2(30) CONSTRAINT student03_name_nn NOT null
);
SELECT *
FROM sys.all_constraints
WHERE table_name LIKE 'STUDENT03';

INSERT INTO STUDENT03 VALUES('홍길동');
INSERT INTO STUDENT03 VALUES('김길동');
INSERT INTO STUDENT03 VALUES('오길동');
SELECT * FROM student03;

INSERT INTO STUDENT03 VALUES(NULL);

-- EX) student04 테이블로 학생번호(숫자),이름,국어,영어,수학
--		테이블을 만들면서 학생번호와 이름을 not null로 제약 조건을 만들고, 등록/조회/확인해보세요

CREATE TABLE student04 (
	stuno number CONSTRAINT studnet04_stuno_nn NOT NULL,
	name varchar2(50) CONSTRAINT student04_name_nn NOT NULL,
	kor NUMBER ,
	eng NUMBER,
	math number
)

INSERT INTO STUDENT04 values(7000,'홍길동',97,88,75);
INSERT INTO STUDENT04(stuno) values(NULL);
INSERT INTO STUDENT04(name) values(null);

-- # unique : 중복되지 않은 유일키만 입력 가능, 단 null은 중복 허용

CREATE TABLE employee01 (
	empno number(5) CONSTRAINT employee01_empno_uq UNIQUE,
	ename varchar2(30) CONSTRAINT employee01_ename_nn NOT NULL,
	sal number(5)
);

SELECT *
FROM sys.all_constraints
WHERE table_name LIKE 'EMPLOYEE01';

INSERT INTO EMPLOYEE01 VALUES(1,'홍길동',1000);
INSERT INTO EMPLOYEE01 VALUES(2,'김길동',1000);
INSERT INTO EMPLOYEE01(EMPNO, ENAME) VALUES(3,'마길동');
INSERT INTO EMPLOYEE01 VALUES(3,'오길동',4000);
-- 동일한 사원 정보 입력 시 에러
INSERT INTO EMPLOYEE01 e values(NULL,'하길동',4000);
INSERT INTO EMPLOYEE01 (ename,sal) values('신길동',5000);
-- null은 동일하여도 에러 발생하지 않음
SELECT * FROM EMPLOYEE01;
