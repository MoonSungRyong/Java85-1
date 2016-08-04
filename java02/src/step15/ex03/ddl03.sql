/* DDL(Data Definition Language) */
/* 
 * UNIQUE
 * - PK와 마찬가지로 데이터 중복을 허용하지 않는다.
 * - 테이블은 오직 한 개의 PK만 가질 수 있다.
 *   물론 한 개의 PK는 여러 개의 컬럼으로 구성될 수 있다.
 * - 그런데 PK 처럼 데이터 중복을 막고 싶을 경우 사용한다. 
 */

/* 이메일에 unique 적용 전 */
create table test008
(
  uid varchar(20) not null,
  uname varchar(50) not null,
  uemail varchar(50) not null
);
alter table test008
  add primary key (uid);
insert into test008 values('u1', 'aaa', 'aaa@test.com');
insert into test008 values('u2', 'bbb', 'bbb@test.com');
insert into test008 values('u3', 'ccc', 'aaa@test.com');

/* 이메일에 unique 적용 전 */
drop table test008;
create table test008
(
  uid varchar(20) not null,
  uname varchar(50) not null,
  uemail varchar(50) not null
);
alter table test008
  add primary key (uid);
alter table test008
  add unique (uemail);
insert into test008 values('u1', 'aaa', 'aaa@test.com');
insert into test008 values('u2', 'bbb', 'bbb@test.com');
insert into test008 values('u3', 'ccc', 'aaa@test.com');









