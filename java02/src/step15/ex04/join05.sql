/* OUTER 조인
 * => NATURAL 조인의 문제점을 해결하기 위해 등장한 문법
 * => NATURAL 조인의 문제점?
 *    - 관계를 맺지 못한 데이터는 결과에서 제외된다.
 * 
 * => OUTER 조인의 종류
 * 1) LEFT OUTER JOIN => 왼쪽 테이블을 기준으로 연결
 * 2) RIGHT OUTER JOIN => 오른쪽 테이블을 기준으로 연결
 * 3) FULL OUTER JOIN => 양쪽 모두를 기준으로 연결
 */

/* BIT_MEMBS(회원정보) --- BIT_MEMB_PHOS(회원사진)
 * => 모든 회원의 이름과 사진 파일명을 출력하라!
 */

/* 다음 방법은 BIT_MEMB_PHOS 테이블에 있는 데이터와 관계된 
 * 회원 데이터만 결과로 선택되는 문제가 있다!
 * => 즉 두 테이블 사이에 관계가 없는 데이터를 제외되는 문제가 있다.
 */
SELECT T1.MNO, T1.MNM, T2.PHOT_PATH
FROM BIT_MEMBS T1, BIT_MEMB_PHOS T2
WHERE T1.MNO = T2.MNO;

SELECT T1.MNO, T1.MNM, T2.PHOT_PATH
FROM BIT_MEMBS T1 JOIN BIT_MEMB_PHOS T2 USING(MNO);


/* LEFT OUTER JOIN으로 해결 
 * => 왼쪽 테이블을 기존으로 오른쪽 테이블의 데이터를 연결한다.
 * => 따라서 왼쪽 테이블의 데이터는 모두 결과로 선택된다.
 */
SELECT T1.MNO, T1.MNM, T2.PHOT_PATH
FROM BIT_MEMBS T1 LEFT OUTER JOIN BIT_MEMB_PHOS T2 ON T1.MNO = T2.MNO;

/* RIGHT OUTER JOIN 예
 * => 오른쪽 테이블을 기준으로 왼쪽 테이블을 연결한다.
 * => 오른쪽 테이블의 모든 데이터는 결과로 선택된다.
 */
SELECT T1.MNO, T1.MNM, T2.PHOT_PATH
FROM BIT_MEMBS T1 RIGHT OUTER JOIN BIT_MEMB_PHOS T2 ON T1.MNO = T2.MNO;

SELECT T1.MNO, T1.MNM, T2.PHOT_PATH
FROM BIT_MEMB_PHOS T2 RIGHT OUTER JOIN BIT_MEMBS T1 ON T1.MNO = T2.MNO;




















