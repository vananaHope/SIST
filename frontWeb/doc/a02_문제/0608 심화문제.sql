/*
 1. 아래의 EMP 테이블에 새로운 사원 데이터를 추가해보세요. 이름은 '최길동', 사원 번호는 2000, 직책은 '과장', 급여는 5000으로 설정하세요. 
2. EMP 테이블에서 '최길동'의 급여를 6000으로 수정해보세요. 
3. EMP 테이블에서 사원 번호가 2000인 사원 정보를 삭제해보세요. 
4. EMP 테이블에서 사원들의 급여를 10% 인상하는 SQL 문을 작성해보세요. 
5. 새로운 사원 정보를 추가하고, 바로 롤백하여 원래 상태로 돌리는 SQL 문을 작성해보세요.
 **/

CREATE TABLE EMP10
AS SELECT * FROM EMP;

SELECT * FROM EMP10;

INSERT INTO EMP10(empno, ename, job, sal)
			values(2000,'최길동','과장',5000);
		
UPDATE emp10
	SET sal = 6000
	WHERE ename = '최길동';

DELETE 
FROM emp10
WHERE empno = 2000;

UPDATE emp10
	SET sal = sal*1.1;
	
INSERT INTO emp10 values(7200,'홍길동','대리',7839,sysdate,3000,500,20);
COMMIT;
ROLLBACK;
	
