/* DDL(Data Definition Language) */
/* 
 * NOT NULL 
 */
create table test002
(
  c1 int, /* 기본은 null 허용 */
  c2 int not null,
  c3 int null
);

/* 컬럼 이름을 지정하지 않으면 
 * 테이블 정의할 때 선언된 순서대로 값을 넣는다 */
insert into test002 values(10, 20, 30);

/* null 허용 컬럼은 값을 넣지 않아도 된다. */
insert into test002(c2) values(20);

/* not null 컬럼은 필수 입력이다. */
insert into test002(c1, c3) values(10, 30);


/*
 * PRIMARY KEY
 * => 중복 값을 허용하지 않는 컬럼
 * => DBA가 데이터를 구분할 때 식별자(key)로 사용하기로 한 컬럼들.
 */

/* primary key 없는 경우*/
create table test003
(
  no int,
  name varchar(20)
);
insert into test003 values(1, '홍길동');
insert into test003 values(1, '홍길동');

/* primary key가 있는 경우*/
create table test004
(
  no int primary key,
  name varchar(20)
);
insert into test004 values(1, '홍길동');
insert into test004 values(1, '홍길동'); /* 입력 오류 */

/* primary key를 지정하는 방법 2 */
create table test005
(
  no int,
  name varchar(20),
  primary key (no)
);

/* primary key를 지정하는 방법 3 */
create table test006
(
  no int,
  name varchar(20)
);
alter table test006
  add primary key (no); 
insert into test006 values(1, '홍길동');
insert into test006 values(1, '임꺽정');

/* 두 개 이상의 컬럼을 primary key로 묶는 경우 */
create table test007
(
  no int,
  name varchar(20)
);
alter table test007
  add primary key (no, name);
insert into test007 values(1, '홍길동');
insert into test007 values(1, '임꺽정');

/* 여러 개의 컬럼을 PK로 선언하는 경우. 예) 좋아요 저장하기 */
create table usr_liks
(
  bno int,
  uid varchar(20)
);
alter table usr_liks
  add primary key (bno, uid);
insert into usr_liks values(100, 'aaa');
insert into usr_liks values(217, 'aaa');
insert into usr_liks values(100, 'aaa'); /* 입력 오류! */















