/* DDL(Data Definition Language) */
/* 1. 테이블 생성 
create table 테이블명
(
  컬럼명 컬럼타입 [옵션] 
  | PRIMARY KEY (컬럼, ...) 
  | UNIQUE (컬럼, ...) 
  | FOREIGN KEY (컬럼, ...)
  ...
) 
 */

create table test001(
  no int,
  name varchar(10)
);

/* 2. 테이블 삭제
drop table 테이블명;
 */
drop table test001;

/* 3. 테이블 변경
alter table 테이블명
  add/alter/change/modify/drop ...;
 */

/* 3.1 컬럼 추가 */
alter table test001
  add email varchar(50);

alter table test001
  add column postno char(5);

/* 3.2 컬럼 이름 및 속성 변경 */
alter table test001
  change postno pstno char(6);

/* 3.3 컬럼 속성만 변경 */
alter table test001
  modify pstno varchar(10);

/* 3.4 컬럼 삭제 */
alter table test001
  drop pstno;
  
  
  
  
  
  
  
  


