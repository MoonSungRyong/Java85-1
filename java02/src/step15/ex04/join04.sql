/* JOIN ~ ON (조건) 조인
 * => JOIN ~ USING(컬럼)의 문제점을 보완하기 위해 등장한 문법
 * => 조인하려는 테이블의 컬럼 이름이 다를 경우 
 *    JOIN ~ USING을 사용할 수 없는 문제 해결!  
 */

/* BIT_MEMBS(회원정보) --- BIT_MEMB_PHOS(회원사진) */
SELECT T1.MNO, T1.MNM, T1.EMAIL, T2.MNO, T2.PHOT_PATH
FROM BIT_MEMBS T1 JOIN BIT_MEMB_PHOS T2 ON T1.MNO = T2.MNO;

SELECT T1.CONO, T1.TITL, T2.CONO, T2.SNO
FROM BIT_COURS T1 JOIN BIT_APPLS T2 ON T1.CONO = T2.CONO; 


/* JOIN ~ ON 문법의 진정한 힘은 다음과 같이 기준 컬럼의 이름이 다를 경우이다.*/
SELECT T1.MNO, T1.MNM, T1.EMAIL, T1.TEL, T2.MGRNO, T2.POSI
FROM BIT_MEMBS T1 JOIN BIT_MGRS T2 ON T1.MNO = T2.MGRNO;















