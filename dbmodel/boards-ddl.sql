/*# MySQL 설정
1. root 암호 변경

2. 데이터베이스(스키마,schema) 생성 
   => Excel 파일을 생성하는 것과 같다.
*/
create database java85db
default character set utf8
default collate utf8_general_ci;
      
/* 3. 사용자 생성 */
create user 'java85'@'localhost' identified by '1111';
   
/* 4. 사용자가 관리할 데이터베이스를 지정 및 권한 설정*/
grant all privileges on java85db.* to 'java85'@'localhost';
   
/* 5. 게시판 테이블 생성  
   => 엑셀 파일에서 시트(sheet)를 생성하는 것과 같다.
*/
create table boards (
  no int not null primary key auto_increment,
  title varchar(255) not null,
  conts text,
  writer varchar(20),
  cre_dt datetime not null,
  vw_cnt int default 0
);
      
/* 6. 게시판 예제 데이터 입력 */
insert into boards(title, conts, cre_dt) values('1111','xxxx',now());
insert into boards(title, conts, cre_dt) values('2222','xxxx',now());
insert into boards(title, conts, cre_dt) values('3333','xxxx',now());
insert into boards(title, conts, cre_dt) values('4444','xxxx',now());
insert into boards(title, conts, cre_dt) values('5555','xxxx',now());
insert into boards(title, conts, cre_dt) values('6666','xxxx',now());
insert into boards(title, conts, cre_dt) values('7777','xxxx',now());
insert into boards(title, conts, cre_dt) values('8888','xxxx',now());
insert into boards(title, conts, cre_dt) values('9999','xxxx',now());
insert into boards(title, conts, cre_dt) values('0000','xxxx',now());
  
/* 7. 입력 확인 */
select * from boards;
  
/* 8. boards 테이블에 컬럼 추가 */
alter table boards
  add password varchar(100);
  
update boards set password = password('1111');

/* 9. 업로드 파일 테이블 생성 */
create table board_files (
  no int not null primary key auto_increment,
  bno int not null,
  filename varchar(255) not null
);

/* 10. board_files 외부키 설정 */
alter table board_files
  add foreign key (bno) references boards (no);




