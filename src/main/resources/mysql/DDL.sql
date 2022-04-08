create database mybatis_db default character set utf8mb4 default collate utf8mb4_general_ci;
create user 'root'@'%' identified by '1234';
grant all on mybatis_db.* to 'root'@'%';


use mybatis_db;

CREATE TABLE t_board (
    board_idx INT AUTO_INCREMENT COMMENT '글 번호',
    title VARCHAR(300) NOT NULL COMMENT '제목',
    contents TEXT NOT NULL COMMENT '내용',
    hit_cnt SMALLINT(10) DEFAULT 0 NOT NULL COMMENT '조회수',
    created_datetime DATETIME NOT NULL COMMENT '작성시간',
    creator_id VARCHAR(50) NOT NULL COMMENT '작성자',
    updated_datetime DATETIME DEFAULT NULL COMMENT '수정시간',
    updater_id VARCHAR(50) DEFAULT NULL COMMENT '수정자',
    deleted_yn CHAR(1) DEFAULT 'N' NOT NULL COMMENT '삭제여부',
    PRIMARY KEY(board_idx)
);
