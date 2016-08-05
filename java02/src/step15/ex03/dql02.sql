/* DQL(Data Query Language) */

/* distinct 와 all
 * => distinct : 중복 값을 제거한 결과를 리턴
 * => all : 기본 옵션. 모든 값 리턴. 생략 가능.  
 */
create table test012
(
  no int not null,
  name varchar(50) not null,
  univ varchar(50),
  major varchar(50)
);
alter table test012
  add primary key (no);
insert into test012 values(1, '홍길동', '대한대학교', '교육학과');
insert into test012 values(2, '임꺽정', '대한대학교', '컴공과');
insert into test012 values(3, '이순신', '서초대학교', '전자과');
insert into test012 values(4, '강감찬', '서초대학교', '경제학과');
insert into test012 values(5, '전봉준', '서초대학교', '경제학과');
insert into test012 values(6, '윤봉길', '왕십리대학교', '교육학과');
insert into test012 values(7, '안중근', '왕십리대학교', '경제학과');
insert into test012 values(8, '유관순', '왕십리대학교', '컴공과');
insert into test012 values(9, '김구', '천안대학교', '교육학과');
insert into test012 values(10, '안창호', '천안대학교', '경제학과');
insert into test012 values(11, '신채호', '천안대학교', '교육학과');
insert into test012 values(12, '을지문덕', '성주대학교', '교육학과');
insert into test012 values(13, '이율곡', '성주대학교', '컴공과');
insert into test012 values(14, '이황', '성주대학교', '전자과');
insert into test012 values(15, '화요비', '대한대학교', '교육학과');
insert into test012(no, name, major) values(16, '이문세', '교육학과');
insert into test012(no, name, major) values(17, '김광석', '교육학과');
insert into test012(no, name, major) values(18, '이선희', '컴공과');
insert into test012(no, name, univ) values(19, '김범룡', '성주대학교');
insert into test012(no, name, univ) values(20, '이승철', '대한대학교');

select all univ from test012; /* 중복 제거 없이 데이터 조회 */ 
select univ from test012; /* all을 생략할 수 있다 */
select distinct univ from test012; /* 데이터 중복 제거 */
select distinct major from test012; /* 데이터 중복 제거 */












