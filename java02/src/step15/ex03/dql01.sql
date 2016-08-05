/* DQL(Data Query Language) */

/* 테이블 구조 조회 
 * > describe 테이블명;
 * > desc 테이블명;
 */
describe test011;
desc test011;

/* 테이블의 모든 컬럼 값 출력하기
 * > select * from 테이블명;
 */
select * from test011;

/* MySQL에서는 함수를 호출하고 그 리턴 값을 출력할 때도 사용한다.*/
select version(); /* MySQL의 버전 정보 출력*/
select now(); /* 현재 날짜 및 시간 정보 출력 */

/* 특정 컬럼의 값을 결과 값으로 선택하고 싶을 때 
 * > select 컬럼명, 컬럼명, ... from 테이블명;
 */
select no, title, password from boards;

/* 컬럼을 지정할 때, 테이블 정의 순서를 따를 필요가 없다.*/
select password, title, no from boards;

/* 컬럼의 별명을 지정할 수 있다.
 * => 컬럼의 별명을 지정하면 데이터를 꺼낼 때 그 별명으로 꺼내야 한다.
 * > select 컬럼명 [as] 별명 ...
 * > select 함수명 [as] 별명 ...
 */
select now(); /* 별명이 없으면 함수 이름을 그대로 결과 데이터의 컬럼 이름으로 사용한다.*/
select now() as today; /* 별명을 지정하면  결과 데이터의 컬럼 이름이 된다.*/
select now() today; /* as를 생략할 수 있다. */

select 
  no, 
  title, 
  conts contents, 
  vw_cnt viewCount, 
  cre_dt createdDate 
from boards;














