/* DML(Data Manipulation Language) */

/* 
 * insert

insert into 테이블명 values(값, 값, ...);

insert into 테이블명 (컬럼1, 컬럼2, 컬럼3, ...)
values (컬럼1값, 컬럼2값, 컬럼3값, ...);
 */
create table test010
(
  no int not null,
  title varchar(100) not null,
  conts text,
  vw_cnt int
);
alter table test010
  add primary key (no);

/* 테이블 전체 데이터 입력 
 * => 컬럼 이름을 지정하지 않으면, 
 *    테이블을 정의할 때 선언한 순서대로 값을 입력해야 한다.
 */
insert into test010 values (1, '제목1', '내용1', 0);

/* 테이블의 컬럼을 지정하여 값 입력하기 
 * => 컬럼의 순서는 상관없다. 
 */
insert into test010(vw_cnt, title, no)
values(0, '제목2', 2);

/* 다른 테이블의 데이터를 가져와서 등록할 수 있다.*/
/* 1) 테스트를 위해 기존 테이블에 데이터를 더 추가하자! */
insert into test009_board2 values(4, 'u1', '1111111');
insert into test009_board2 values(5, 'u1', '222222222');
insert into test009_board2 values(6, 'u1', '333333');
insert into test009_board2 values(7, 'u1', '4444444');
insert into test009_board2 values(8, 'u1', '555555555555');

/* test009_board2의 데이터를 test010 테이블에 입력한다 */
insert into test010(no, title)
select bno, title from test009_board2 where bno > 2;
  
  








  
  
