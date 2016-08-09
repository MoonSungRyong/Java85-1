/* sub query
 * => 주의해서 사용해야 한다.
 * => query의 성능을 떨어뜨리는 요인이 되기도 한다.  
 */

/* 문제: 강의가 배정된 강사의 이름과 이메일을 출력하라! */
SELECT DISTINCT CM.TNO, M.MNM, M.EMAIL
FROM BIT_CO_MODS CM
  JOIN BIT_MEMBS M ON M.MNO = CM.TNO
WHERE TNO IS NOT NULL;

/* 3) where 절에 서브 쿼리 넣기 */
SELECT M.MNM, M.EMAIL 
FROM BIT_MEMBS M 
WHERE MNO IN (SELECT DISTINCT TNO FROM BIT_CO_MODS WHERE TNO IS NOT NULL);
















