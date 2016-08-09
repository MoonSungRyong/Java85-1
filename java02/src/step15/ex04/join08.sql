/* sub query
 * => 주의해서 사용해야 한다.
 * => query의 성능을 떨어뜨리는 요인이 되기도 한다.  
 */

/* 문제: 임꺽정 강사의 강의 모듈을 모두 출력하라! */
SELECT DISTINCT MNO, MNM, EMAIL, CM.SMNO, SM.TITL
FROM BIT_MEMBS M 
  JOIN BIT_CO_MODS CM ON M.MNO = CM.TNO
  JOIN BIT_SUBJ_MODS SM ON CM.SMNO = SM.SMNO
WHERE M.MNM LIKE '임꺽정';


/* 2) from 절에 sub query 사용하기
 * => 서브 쿼리의 결과가 from 절에서 가상의 테이블로 사용된다. 
 */
SELECT DISTINCT MNO, MNM, EMAIL, CM.SMNO, SM.TITL
FROM (SELECT MNO, MNM, EMAIL FROM BIT_MEMBS WHERE MNM LIKE '임꺽정') M
  JOIN BIT_CO_MODS CM ON M.MNO = CM.TNO
  JOIN BIT_SUBJ_MODS SM ON CM.SMNO = SM.SMNO;







