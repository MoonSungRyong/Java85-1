/* DQL(Data Query Language) */

/* union 과 union all 집합 연산자
 * => union : 두 결과를 합친다. 단 중복 데이터는 제거한다.
 * => union all : 두 결과를 합친다. 중복 데이터를 제거하지 않는다. 
 */

/* => union 사용 전 */
select * from test012 
where univ = '대한대학교' or major = '컴공과'; 

/* 문제 : 대한대학교 또는 컴공과 학생의 정보를 출력하라!
 *        단 출력 형식은 다음과 같이 하라.
 * 번호, 이름, 대학교명 또는 학과명, 타입(대학교:1, 학과:2)
 * 예) 
 * 1, 홍길동, 대한대학교, 1
 * 3, 임꺽정, 컴공과, 2
 * 4, 유관순, 대한대학교, 1
 * ...
 *     
 */
select no, name, univ, 1 from test012 where univ = '대한대학교'
union
select no, name, major, 2 from test012 where major = '컴공과';


/* 문제 : test012의 대한대학교 학생의 이름과  
 *        test008의 bitcamp.com의 사용자 이름을 출력하라!
 */
select name from test012 where univ = '대한대학교'
union /* 중복 데이터 제거 */
select uname from test008 where uemail like '%@bitcamp.com';

select name from test012 where univ = '대한대학교'
union all /* 중복 데이터 제거 안함 */
select uname from test008 where uemail like '%@bitcamp.com';


/* 용어 정리
 * => 프로젝션(projection): 결과 컬럼을 선택하는 것
 * => 셀렉션(selection): 조건에 맞족하는 결과 행을 선택하는 것.
 */

/* projection의 예 */
select no, name from test012;

/* selection의 예 */
select * from test012 where univ = '대한대학교';




