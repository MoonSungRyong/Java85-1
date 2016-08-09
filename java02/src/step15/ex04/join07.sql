/* sub query
 * => 주의해서 사용해야 한다.
 * => query의 성능을 떨어뜨리는 요인이 되기도 한다.  
 */

/* 1) select 절에 sub query 사용하기
 * => 각 결과 레코드에 대해 서브 쿼리를 실행한다.
 * => 결과 개수 만큼 서브 쿼리를 실행하기 때문에,
 *    결과 개수가 많은 경우 성능을 저하시키는 원인이 된다. 
 */
SELECT 
  TNO, 
  (SELECT MNM FROM BIT_MEMBS WHERE MNO=T.TNO) NAME,
  IFNULL(SAL_HR, 0) MONEY_PER_HOUR
FROM BIT_TCHS T