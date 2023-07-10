/*
[1단계:개념] 1. 테이블 구조변경의 종류를 기본 코드로 리스트하세요

1) 컬럼 추가
alter table 테이블명
	add 컬럼명 데이터유형 [default 디폴트데이터, 제약조건]

2) 컬럼 변경
alter table 테이블명
	rename column 기존컬럼 to 새로운 컬럼

3) 컬럼 삭제
alter table 테이블명
	drop column 컬럼명

4) 컬럼 수정
alter table 테이블명
	modify 컬럼명 변경할 속성
	
5) 테이블 수정
alter table 테이블명
	rename to 새로운 테이블명

6) 테이블 삭제
drop table 테이블명
							

[1단계:코드] 2. emp14 (사원명과 부서명, 급여)테이블을 만들고, 직책명 컬럼을 추가하되 default로 '직책없음', 
                제약사항으로 사원정보의 직책범위를 distinct로 확인하여 check 설정하여 만드세요.
 
 */

CREATE TABLE emp14
AS SELECT ename, dname, sal FROM emp e, dept d WHERE e.deptno = d.deptno;

SELECT * FROM emp14;

SELECT * FROM emp;

SELECT * FROM dept;

DROP TABLE emp14;

SELECT DISTINCT job FROM emp;

ALTER TABLE emp14
	ADD job varchar2(50) DEFAULT '직책없음';

ALTER TABLE emp14
MODIFY job varchar2(50)
CONSTRAINT emp14_job_ck check(job IN('CLERK','SALESMAN', 'PRESIDENT', 'MANAGER', 'ANALYST','직책없음'));

INSERT INTO emp14 values('RHO','IT',5000,'PRE');


