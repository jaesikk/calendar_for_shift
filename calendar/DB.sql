# DB 생성
DROP DATABASE IF EXISTS Calendar_P;
CREATE DATABASE Calendar_P;
USE Calendar_P;

# Schedule 데이터 생성
CREATE TABLE `schedule` (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	title CHAR(100) NOT NULL,
	`body` TEXT NOT NULL
);


# Schedule 테스트데이터 생성
INSERT INTO `schedule`
SET title = '미용실',
`body` = '17시 커트 예약';

INSERT INTO `schedule`
SET title = '풋살',
`body` = '20시 참석';

INSERT INTO `schedule`
SET title = '조기축구',
`body` = '6시 참석';


SELECT LAST_INSERT_ID();
SELECT * FROM `schedule`;