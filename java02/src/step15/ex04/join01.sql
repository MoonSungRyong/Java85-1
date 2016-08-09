/* CROSS 조인
 * => CARTESIAN 조인이라고도 한다.
 * => 두 테이블의 데이터를 1:1로 연결한다.
 * => cross? 곱 조인이다. 
 *    즉 두 테이블의 데이터 개수를 곱한 결과가 만들어진다.
 * => 결과로서 의미없는 조인이다.
 */

/* BIT_MEMBS(회원기본정보) --- BIT_MGRS(매니저정보) 의 CROSS 조인 */
/* 구 문법 */
SELECT T1.MNO, T1.MNM, T1.EMAIL, T1.TEL, T2.MGRNO, T2.POSI
FROM BIT_MEMBS T1, BIT_MGRS T2;

/* 신 문법 */
SELECT T1.MNO, T1.MNM, T1.EMAIL, T1.TEL, T2.MGRNO, T2.POSI
FROM BIT_MEMBS T1 CROSS JOIN BIT_MGRS T2;






