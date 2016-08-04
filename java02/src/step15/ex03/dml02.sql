/* DML(Data Manipulation Language) */

/* 
 * update

update 테이블명 set 컬럼명=값, 컬럼명=값 where 조건;

주의!
  => 조건을 주지 않으면 해당 테이블의 모든 데이터를 변경할 것이다. 
 */
update test010 set conts='xxx'
where no=7;
  
/* 
 * delete

delete from 테이블명 where 조건;

주의!
  => 조건을 주지 않으면 해당 테이블의 모든 데이터를 삭제할 것이다. 
 */

delete from test010 where no < 5;






  
  
