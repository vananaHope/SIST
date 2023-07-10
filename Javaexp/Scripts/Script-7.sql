CREATE TABLE MEMBER02(
   id varchar2(50),
   pass varchar2(50),
   name varchar2(50),
   point NUMBER,
   auth varchar2(50),
   regdate date
);

INSERT INTO member02 values('himan','7777','홍길동',1000,'관리자',sysdate);

SELECT * FROM MEMBER02 m ;