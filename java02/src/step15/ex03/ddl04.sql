/* DDL(Data Definition Language) */
/* 
 * FOREIGN KEY
 * - 다른 테이블의 PK를 참조하는 컬럼.
 * - 지정한 테이블에 들어있는 PK 값이 아니면 저장할 수 없다. 
 * - 무결성을 지키는 문법 => 데이터 결함을 방지한다. => 데이터의 신뢰도를 유지.
 * - 유효하지 않은 값이 들어가는 것을 막는 문법
 * - 외부키 컬럼은 자신이 참조하는 테이블의 PK 컬럼과 타입과 크기가 같아야 한다.
 *   이름은 같지 않아도 된다.
 *   그러나 유지보수의 일관성을 위해 보통 PK 이름과 같게 만든다.
 */

create table test009_user
(
  uid varchar(10),
  uname varchar(50)
);
alter table test009_user
  add primary key (uid);
insert into test009_user values('u1','aaa');
insert into test009_user values('u2','bbb');
insert into test009_user values('u3','ccc');

/* foreign key 적용 전 게시판 */
create table test009_board1
(
  bno int,
  uid varchar(10),
  title varchar(50)
);
alter table test009_board1
  add primary key (bno);
insert into test009_board1 values(1, 'u1', 'aaaaaaaa');
insert into test009_board1 values(2, 'u1', 'bbbbbbbbbbbbb');
insert into test009_board1 values(3, 'u2', 'xxxxxxxx');

/* 존재하지 않는 사용자 아이디를 넣더라도 입력이 된다. 
 * => 데이터의 신뢰성을 잃는다.*/
insert into test009_board1 values(4, 'u4', 'ㅋㅋㅋㅋㅋㅋㅋ');

/* foreign key 적용 후 게시판 */
create table test009_board2
(
  bno int,
  uid varchar(10),
  title varchar(50)
);
alter table test009_board2
  add primary key (bno);

/* uid 컬럼이 외부 어떤 테이블의 어떤 컬럼을 참조하는지 지정한다.
 * => 단 반드시 외부 컬럼은 그 테이블의 PK 이어야 한다.
 * => 외부 테이블의 일반 컬럼을 참조할 수 없다.
 */ 
alter table test009_board2
  add foreign key (uid) references test009_user(uid);

/* 존재하는 uid 값은 넣을 수 있다.*/
insert into test009_board2 values(1, 'u1', 'aaaaaaaa');
insert into test009_board2 values(2, 'u1', 'bbbbbbbbbbbbb');
insert into test009_board2 values(3, 'u2', 'xxxxxxxx');

/* 존재하지 않는 uid 값은 넣을 수 없다. 
 * => 데이터의 결함이 발생하는 것을 막는다.*/
insert into test009_board2 values(4, 'u4', 'ㅋㅋㅋㅋㅋㅋㅋ');


/* 테이블 관계
 * 관계
 * => 이렇게 다른 테이블의 PK를 참조하는 경우
 *    두 테이블은 관계를 맺고 있다고 말한다.
 * => PK 컬럼을 갖고 있는 테이블을 "부모 테이블"이라 부른다.
 *    FK 컬럼을 갖고 있는 테이블을 "자식 테이블"이라 부른다.
 * 
 */












