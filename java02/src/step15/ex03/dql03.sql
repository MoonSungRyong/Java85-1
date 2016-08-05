/* DQL(Data Query Language) */

/* order by
 * => 결과 데이터 정렬
 * > order by 컬럼명 desc/asc, 컬럼명 desc/asc, ...
 * => asc 옵션은 생략 가능  
 */
select * from test012 order by no;
select * from test012 order by no asc;
select * from test012 order by no desc;
select * from test012 order by univ asc;
select * from test012 order by univ desc;

/* 여러 개의 컬럼을 조합하여 정렬하기
 * 컬럼 순서대로 정렬한다.
 */
select * from test012 order by univ asc, name asc;

/* 정렬할 컬럼을 지정할 때 select하지 않은 컬럼도 가능하다 */
select no, name from test012 order by univ desc;


















