/* group by ~ having 
 * => 데이터를 그룹으로 묶어서 집계 함수를 사용하여 결과를 추출할 때.
 * => 집계함수란?
 *    count(), sum(), avg(), max(), min() 등    
 */

/* 문제: 각 교육과정 당 학습 모듈 수를 출력하라. */

/* 전체 학습모듈 개수 */
SELECT COUNT(*)
FROM BIT_CO_MODS;

/* 각 교육과정 당 학습 모듈 수 */
SELECT 
  CONO, 
  (SELECT TITL FROM BIT_COURS WHERE CONO=CM.CONO) TITLE, 
  COUNT(*) CNT
FROM BIT_CO_MODS CM
GROUP BY CONO;


/* GROUP BY로 데이터를 묶은 후 그 결과에 대해 
 * 조건을 거는 방법
 */
/* 문제: 교육 과정 모듈이 5개 이상인 것만 추출하라 */
SELECT 
  CONO, 
  (SELECT TITL FROM BIT_COURS WHERE CONO=CM.CONO) TITLE, 
  COUNT(*) CNT
FROM BIT_CO_MODS CM
GROUP BY CONO
HAVING COUNT(*) >= 5;












