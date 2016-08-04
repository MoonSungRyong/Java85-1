/* DDL(Data Definition Language) */
/* 
 * FOREIGN KEY와 식별/비식별 관계
 */
/* 사용자의 사진 정보를 넣는 테이블 */

/* 비식별 관계, 일 대 다 관계, FK != PK */
create table test009_photo1
(
  pno int,
  uid varchar(10),
  photo varchar(100)
);
alter table test009_photo1
  add primary key (pno);
alter table test009_photo1
  add foreign key (uid) references test009_user(uid);  
insert into test009_photo1 values(1, 'u1', 'aaa.gif');
insert into test009_photo1 values(2, 'u2', 'bbb.gif');
insert into test009_photo1 values(3, 'u1', 'ccc.gif');

/* 일 대 다의 관계 (1:*)
 * => 사용자(1) <---> 사진(*)
 * => 사진 데이터는 여러 개 넣을 수 있다.
 * => FK 컬럼이 test009_photo1 테이블에서 일반 컬럼으로 사용된다.
 * => "비식별(non-identifying) 관계"라 부른다.
 *    이런 말을 만난다면 "FK != PK"라는 뜻이다.
 */

/* 일 대 일의 관계 (1:1)
 * => 사용자(1) <---> 사진(1)
 * => 사용자는 사진 한 개만 가질 수 있다.
 * => FK 컬럼이 해당 테이블에서 PK로도 사용될 때.
 * => 관계를 표현하는 컬럼이 PK로 사용된다는 의미로 
 *    "식별 관계(identifying)"라 부른다.
 *    이런 말을 듣는다면 "FK == PK"라고 생각하라!
 */

/* 식별 관계, 일 대 일 관계, FK == PK */
create table test009_photo2
(
  uid varchar(10),
  photo varchar(100)
);
alter table test009_photo2
  add primary key (uid);
alter table test009_photo2
  add foreign key (uid) references test009_user(uid);  
insert into test009_photo2 values('u1', 'aaa.gif');
insert into test009_photo2 values('u2', 'bbb.gif');
insert into test009_photo2 values('u1', 'ccc.gif'); /* 입력 오류! */








