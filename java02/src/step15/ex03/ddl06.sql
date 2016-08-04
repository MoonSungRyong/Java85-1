/* DDL(Data Definition Language) */
/*
 * 일련번호 컬럼
 * => auto_increment 옵션을 붙이면 해당 컬럼의 값은 자동 증가한다.
 * => 단 primary key 컬럼에 대해서만 붙일 수 있다.
 * 
 */
create table test011
(
  no int not null,
  title varchar(100) not null,
  conts text,
  vw_cnt int
);
alter table test011
  add primary key (no);
alter table test011
  modify no int not null auto_increment;

/* auto_increment로 설정된 컬럼은 값을 주지 않아도 
 * 자동으로 증가된 값을 넣는다.
 */
insert into test011(title) values('11111');  
insert into test011(title) values('11111'); 
insert into test011(title) values('11111');
insert into test011(title) values('11111');  
  
  
  
  
  



