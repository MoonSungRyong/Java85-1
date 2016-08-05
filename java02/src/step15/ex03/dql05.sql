/* DQL(Data Query Language) */

/* where 절 기타 연산자 
 * => in, like, between a and b, is null
 */

/* in 연산자 */
select no, name from test012
where univ = '대한대학교' or univ = '서초대학교' or univ = '천안대학교';
select no, name from test012
where univ in ('대한대학교','서초대학교','천안대학교');

/* like 연산자
 * => % : 0개 이상의 문자를 의미
 * => _ : 한 개의 문자를 의미
 */
select no, name, univ from test012 where univ = '대한대학교';
select no, name, univ from test012 where univ like '대한대학교';
select no, name, univ from test012 where univ like '대%';
select no, name, univ from test012 where univ like '%대학교';
select no, name, univ from test012 where name like '%신%'; /* 검색 속도 매우 느리다 */
select no, name, univ from test012 where name like '김_';

/* is null 연산자 */
select no, name, univ from test012 where univ = null; /* = 연산자로 null을 검사할 수 없다.*/
select no, name, univ from test012 where univ is null; /* is null 연산자를 사용하라! */
select no, name, univ from test012 where univ is not null; /* null이 아닌 것 */
select no, name, univ from test012 where not univ is null; /* null이 아닌 것 */

/* 컬럼명 between 값1 and 값2 */
select accno, balance from test013 where balance between 100000 and 10000000;
select accno, balance from test013 where not balance between 100000 and 10000000;













