/*
 1. 다음 중 데이터 조작어(Data Manipulation Language, DML)에 해당하지 않는 것은 무엇인가요?
    A) insert
    B) update
    C) delete
    D) create

D

2. 다음 중 트랜잭션 명령어로 잘못된 것은 무엇인가요?
    A) commit
    B) rollback
    C) insert
    D) 없음

C

commit을 통해 임시로 현재 계정에서 처리된 등록/수정/삭제 데이터가 확정이 되고,
commit하기 전에는 rollback을 통해서 원상복구할 수 있지만, commit 후에는 원상복구가 되지 않는다. 

3. 단일 행을 테이블에 입력하는 명령어는 무엇인가요?
    A) insert into 테이블명 values(데이터1, 데이터2...);
    	전체 컬럼 입력(단일행)
    B) insert into 테이블명 select 컬럼1, 컬럼2.. from 테이블명;
    	select 구문이 단일행이면 단일행 입력 처리
    C) insert into 테이블명(컬럼1, 컬럼2, 컬럼3...) values(데이터1,데이터2,데이터3...);
    	부분 컬럼 입력(단일행)
    D) 모두

D


4. 다중행 입력에서 조회되는 컬럼의 순서와 타입이 입력할 테이블의 컬럼의 순서와 타입과 동일해야 하는 명령어는 무엇인가요?
    A) insert into 테이블명 subquery(select 컬럼1, 컬럼2 from 테이블)
    	단일행 입력도 가능(subquery의 select문이 하나의 row)하고 
    	다중행 입력 가능(subquery의 select문 여러 row일 때)
    B) insert into 테이블명(컬럼1,컬럼2..) select 컬럼1, 컬럼2.. from 테이블명
    C) insert into 테이블명 values(데이터1, 데이터2...)
    D) insert into 테이블명(컬럼1, 컬럼2, 컬럼3...) values(데이터1,데이터2,데이터3...)

A

5. 데이터를 수정할 때, 모든 행의 데이터가 수정되는 상황을 방지하기 위한 조건문은 무엇인가요?
    A) select
    B) insert
    C) where
    D) delete

C

where 조건절이 없으면 해당 테이블의 모든 데이터가 수정됨

6. 다음 중 UPDATE 명령어의 기본 형식에 잘못된 것은 무엇인가요?
    A) update 테이블명
    B) set 컬럼1 = 수정할데이터1,
    C) where 조건(비교/논리)
    D) delete 조건(비교/논리)

D

7. 다중 행 입력에서 전체 컬럼 입력의 형식으로 올바른 것은?
   A) insert into 테이블명 subquery(select 컬럼1, 컬럼2 from 테이블)
   B) insert into 테이블명(컬럼1, 컬럼2)
   C) insert into 테이블명 values(데이터1, 데이터2)
   D) insert into 테이블명(컬럼1, 컬럼2, 컬럼3...)

A

8. 트랜잭션 명령어 중 'rollback'의 기능으로 올바른 것은?
   A) 정상종료 확정: commit
   B) 비정상종료 복구
   C) 새로운 트랜잭션 시작
   D) 트랜잭션 완료 상태 확인

B

java의 DAO에서 DML처리시, rollback()과 commit()을 상황에 따라 예외와 함께 처리한다.

9. 'insert into 테이블명 values(데이터1, 데이터2...);' 이 구문의 기능은?
   A) 모든 컬럼 수정
   B) 특정 컬럼 수정
   C) 모든 컬럼 입력
   D) 특정 컬럼 입력

C

데이터1,데이터2... 의 순서는 테이블의 기본 select *시 나타나는 순서에 맞게 처리하면 된다.

10. 'insert into 테이블명(컬럼1, 컬럼2, 컬럼3...) values(데이터1,데이터2,데이터3...);' 이 구문의 기능은?
   A) 모든 컬럼 수정
   B) 특정 컬럼 수정
   C) 모든 컬럼 입력
   D) 특정 컬럼 입력

D

11. Subquery를 활용한 수정 처리는 다음 중 어떤 경우에 사용될 수 있는가?
   A) 수정 전 데이터의 확인이 필요할 때
   B) 다른 테이블이나 현재 테이블에 정보를 변경할 때
   C) 테이블의 전체 데이터를 일괄적으로 변경할 때
   D) 테이블의 구조 자체를 변경할 때

B

update 테이블1
	set 컬럼1 = (select 컬럼 from 테이블1),
		(컬럼1,컬럼2) = (select 컬럼1,컬럼2 from 테이블2)

12. 'SET 컬럼1,컬럼2.. = (결과가 n인 subquery)' 형식의 구문은 어떤 경우에 사용하는가?
   A) 한개의 컬럼을 수정할 때
   B) 두개 이상의 컬럼을 동시에 수정할 때
   C) 조건에 맞는 데이터를 삭제할 때
   D) 새로운 데이터를 입력할 때

B

13. 부서번호가 10인 데이터의 급여를 부서번호가 20인 사원의 최고급여로 수정하는 쿼리의 올바른 형식은?
   A) UPDATE emp03 SET sal = (SELECT max(sal) FROM emp03 WHERE deptno = 20) WHERE deptno = 10;
   B) UPDATE emp03 SET sal = (SELECT max(sal) FROM emp03 WHERE deptno = 10) WHERE deptno = 20;
   C) UPDATE emp03 SET sal = (SELECT min(sal) FROM emp03 WHERE deptno = 20) WHERE deptno = 10;
   D) UPDATE emp03 SET sal = (SELECT min(sal) FROM emp03 WHERE deptno = 10) WHERE deptno = 20;

A

update 테이블 : 변경할 테이블 
	set sal = (변경할 기준 데이터)
where 조건..

14. 'UPDATE EMP02 SET SAL = (SELECT floor(avg(sal)) FROM emp02 WHERE job = 'SALESMAN') WHERE empno = 7499;' 이 쿼리의 기능은 무엇인가?
   A) 사원번호 7499인 사원의 급여를 SALESMAN 직책의 평균 급여로 수정
   B) 사원번호 7499인 사원의 급여를 SALESMAN 직책의 최고 급여로 수정
   C) SALESMAN 직책의 사원들의 급여를 사원번호 7499인 사원의 급여로 수정
   D) SALESMAN 직책의 사원들의 급여를 사원번호 7499인 사원의 급여의 평균값으로 수정

A

# update 구분에서 subquery 처리 순서
1. 기준이 되는 sql작성 : 어떤 데이터를 호출해서 변경할 것인가?
	SALESMAN 직책의 평균 급여
	SELECT floor(avg(sal)) from emp02 where job = 'SALESMAN'

2. 변경할 테이블의 수정 구문 작성
	update 변경테이블
		set = ()
	where 조건;	
	
3. ()안에 기준이 되는 sql 구문을 삽입 처리..

15. 삭제 처리 구문의 기본 형식으로 옳지 않은 것은?
   A) delete
   B) from 테이블명
   C) where 조건처리
   D) select *

D

16. 'DELETE FROM emp03 WHERE sal < 3000;' 쿼리의 기능은?
   A) 테이블 emp03에서 급여가 3000 미만인 데이터를 수정
   B) 테이블 emp03에서 급여가 3000 미만인 데이터를 추가
   C) 테이블 emp03에서 급여가 3000 미만인 데이터를 조회
   D) 테이블 emp03에서 급여가 3000 미만인 데이터를 삭제

D

17. 'DELETE FROM emp03 WHERE to_char(hiredate,'Q')='2';' 쿼리는 어떤 작업을 수행하는가?
   A) 입사일이 2사분기인 데이터를 테이블 emp03에 추가
   B) 입사일이 2사분기인 데이터를 테이블 emp03에서 조회
   C) 입사일이 2사분기인 데이터를 테이블 emp03에서 삭제
   D) 입사일이 2사분기인 데이터를 테이블 emp03에서 수정

C

18. 'SELECT * FROM emp09 WHERE empno IN (SELECT empno FROM emp09 WHERE sal>=2000);' 이 쿼리의 목적은 무엇인가?
   A) 테이블 emp09에서 급여가 2000 이상인 사원의 정보를 추가
   B) 테이블 emp09에서 급여가 2000 이상인 사원의 정보를 조회
   C) 테이블 emp09에서 급여가 2000 이상인 사원의 정보를 수정
   D) 테이블 emp09에서 급여가 2000 이상인 사원의 정보를 삭제

B

19. 직책별 최근 입사자의 정보를 출력하는 쿼리를 작성할 때, 어떤 함수를 사용해야 하는가?
   A) min(hiredate) : 최초 입사자 구하기
   B) max(hiredate) : 최근 입사자 구하기
   C) avg(hiredate)
   D) sum(hiredate)

B


20. 직책별 최저 급여인 사원의 정보를 출력하는 쿼리를 작성할 때, 어떤 함수를 사용해야 하는가?
   A) min(sal)
   B) max(sal)
   C) avg(sal)
   D) sum(sal)
   
A   
   
 **/