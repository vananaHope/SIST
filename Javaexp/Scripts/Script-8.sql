/*
   code(키, 값, 상위키,정렬순위)
    1000  과일  0
    1001  사과   1000 1
    1002  바나나  1000 2
    1003  딸기   1000 3
    1004  오렌지  1000 4
    select *
    from code
    where 상위키 = 1000;
    order 정렬순위 
 */
INSERT INTO code VALUES (code_seq.nextval, '과일',0,1);
INSERT INTO code VALUES (code_seq.nextval, '사과',1001,1);
INSERT INTO code VALUES (code_seq.nextval, '바나나',1001,2);
INSERT INTO code VALUES (code_seq.nextval, '딸기',1001,3);
INSERT INTO code VALUES (code_seq.nextval, '오렌지',1001,4);

INSERT INTO code VALUES (code_seq.nextval, '부서','',0,1);

-- 제목, 값, 상위번호, 정렬
-- title, val, refno, ordno
INSERT INTO code VALUES (code_seq.nextval, '인사',1006,1,10);
INSERT INTO code VALUES (code_seq.nextval, '재무',1006,2,20);
INSERT INTO code VALUES (code_seq.nextval, '회계',1006,3,30);
INSERT INTO code VALUES (code_seq.nextval, 'IT',1006,4,40);

INSERT INTO code VALUES (code_seq.nextval, '기획',1006,5,50);
SELECT * FROM code;

DROP TABLE code;

CREATE TABLE code(
	NO NUMBER(4) PRIMARY KEY,
	title VARCHAR2(100),
	refno number(4),
	ordno number(2)
);
SELECT *
FROM code;

SELECT *
FROM CODE c 
WHERE title LIKE '%%'
START WITH refno = 0
CONNECT BY PRIOR NO=refno;

SELECT *
FROM code
WHERE title LIKE '%%'
START WITH refno = 1006
CONNECT BY PRIOR NO=refno;

CREATE SEQUENCE code_seq
	START WITH 1001;

DROP SEQUENCE code_seq;

SELECT code_seq.nextval FROM dual;

SELECT NO, title, refno, ordno
FROM CODE c 
WHERE title LIKE '%%'
ORDER BY refno, ordno;
/*
 private int no;
 private String title;
 private int refno;
 private int ordno;
 **/

ALTER TABLE CODE 
ADD val varchar2(100);
