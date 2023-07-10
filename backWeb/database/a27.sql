




-- 게시물 테이블
CREATE TABLE posts (
  post_id NUMBER,
  title VARCHAR2(100),
  content VARCHAR2(4000),
  parent_id NUMBER,
  CONSTRAINT posts_pk PRIMARY KEY (post_id),
  CONSTRAINT posts_fk FOREIGN KEY (parent_id) REFERENCES posts (post_id)
);

-- 시퀀스 생성
CREATE SEQUENCE posts_seq1 start WITH 1 INCREMENT BY 1;



-- 게시물 데이터 입력
INSERT INTO posts (post_id, title, content, parent_id) 
   VALUES (posts_seq.nextval, '게시물 1', '첫 번째 게시물입니다.', NULL);
INSERT INTO posts (post_id, title, content, parent_id)
    VALUES (posts_seq.nextval, '게시물 2', '두 번째 게시물입니다.', NULL);
INSERT INTO posts (post_id, title, content, parent_id) 
   VALUES (posts_seq.nextval, '답글 1-1', '첫 번째 게시물의 답글입니다.', 1);
INSERT INTO posts (post_id, title, content, parent_id)
    VALUES (posts_seq.nextval, '답글 1-2', '첫 번째 게시물의 두 번째 답글입니다.', 1);
INSERT INTO posts (post_id, title, content, parent_id)
 VALUES (posts_seq.nextval, '답글 2-1', '두 번째 게시물의 답글입니다.', 2);
 
계층적 SQL 쿼리:


SELECT
    LPAD(' ', (LEVEL - 1) * 4, ' ') || title AS title,
    content
FROM
    posts
START WITH
    parent_id IS NULL -- 최상위 게시물만 시작점으로 설정
CONNECT BY PRIOR
    post_id = parent_id
ORDER SIBLINGS BY
    post_id ASC;

