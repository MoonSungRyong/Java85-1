/* DQL(Data Query Language) */

/* where 
 * => from 절에서 검색한 결과를 조건에 따라 선별하기
 * select 컬럼명, ... from 테이블명 where 조건..
 */
select * from test012 where no > 10;
select * from test012 where no = 11;

/* select 또는 where 절에 연산자 사용가능
 * => +, -, *, /
 */
select * from test012 where no = 5 + 2;
select * from test012 where no = 5 - 2;
select * from test012 where no = 5 * 2;
select * from test012 where no = 4 / 2;
select * from test012 where (no % 2) = 1;


/* select 절에서 결과로 선택할 컬럼에 대해 연산을 수행할 수 있다.*/
create table test013
(
  accno varchar(20) not null,
  balance int not null,
  acc_type int default 0
);
alter table test013
  add primary key (accno);
insert into test013(accno, balance) values('111-11-1234', 100000);
insert into test013(accno, balance) values('111-11-1235', 800000);
insert into test013(accno, balance) values('111-11-1236', 8000000);
insert into test013(accno, balance) values('111-11-1237', 90000000);

select accno, balance, balance * 0.025 as interest from test013;

/* 비교 연산자 : =, !=, <>, >, <, >=, <= */
select * from test013 where balance = 100000;
select * from test013 where balance != 100000;
select * from test013 where balance <> 100000;
select * from test013 where balance > 8000000;
select * from test013 where balance < 8000000;
select * from test013 where balance >= 8000000;
select * from test013 where balance <= 8000000;

/* 비교 연산자와 날짜 컬럼 */
select no, cre_dt from boards where cre_dt > '2016-08-01';
select no, cre_dt from boards where cre_dt < '2016-08-01';

/* 날짜 컬럼과 날짜 함수 */
select no, title, cre_dt, adddate(cre_dt, 7) expire from boards;


/* 논리 연산자 : and, or, not */
select * from test012 where univ = '대한대학교' and major = '교육학과';
select * from test012 where univ = '대한대학교' or major = '교육학과';
select * from test012 where univ != '대한대학교';
select * from test012 where not univ = '대한대학교';







