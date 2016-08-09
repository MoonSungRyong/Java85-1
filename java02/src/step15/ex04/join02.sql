/* NATURAL 조인
 * => EQUI 조인이라고도 한다.
 * => 두 테이블의 공통 컬럼을 기준으로 데이터를 결합하는 기법.
 * => 보통 부모 테이블의 PK와 자식 테이블의 FK 컬럼을 기준으로 결합한다.
 */

/* BIT_MEMBS(회원기본정보) --- BIT_MGRS(매니저정보) */
/* 구 문법 */
SELECT T1.MNO, T1.MNM, T1.EMAIL, T1.TEL, T2.MGRNO, T2.POSI
FROM BIT_MEMBS T1, BIT_MGRS T2
WHERE T1.MNO=T2.MGRNO; /* 동등 연산자(Equal)를 사용하여 연결.*/

/* 신 문법
 * => 두 테이블에서 이름이 같은 컬럼을 찾아 그 컬럼의 값을 기준으로 연결한다.
 * => 부모 테이블의 PK와 자식 테이블의 FK의 컬럼 이름이 다를 경우 
 *    제대로 연결되지 않는다.
 * => 따라서 다음은 질의 결과는 옳지 않다. 
 */
SELECT T1.MNO, T1.MNM, T1.EMAIL, T1.TEL, T2.MGRNO, T2.POSI
FROM BIT_MEMBS T1 NATURAL JOIN BIT_MGRS T2;

/* PK와 FK가 같은 경우
 * => BIT_COURS(교육과정) --- BIT_APPLS(과정신청) 
 */
/* 구 문법 */
SELECT T1.CONO, T1.TITL, T2.CONO, T2.SNO
FROM BIT_COURS T1, BIT_APPLS T2
WHERE T1.CONO = T2.CONO;

/* 신 문법
 * => FK 컬럼이 두 개인데 그 중 한 개(CONO)는 부모테이블에 일치하는 컬럼이 있고,
 *    나머지 한 개(SNO)가 부모 테이블에 일치하는 컬럼이 없기 때문에 내춰럴 조인을 
 *    수행할 수 없다. 
 */
SELECT T1.CONO, T1.TITL, T2.CONO, T2.SNO
FROM BIT_COURS T1 NATURAL JOIN BIT_APPLS T2













