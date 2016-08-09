/* NATURAL 조인
 * => EQUI 조인이라고도 한다.
 * => 두 테이블의 공통 컬럼을 기준으로 데이터를 결합하는 기법.
 * => 자식 테이블의 FK 컬럼의 이름과 일치하는 부모테이블의 PK를 찾아 결합한다.
 * => 만약 자식 테이블의 FK 컬럼 이름과 같은 PK를 찾을 수 없다면 연결할 수 없다.
 */

/* BIT_MEMBS(회원정보) --- BIT_MEMB_PHOS(회원사진정보) */
/* 구 문법 */
SELECT T1.MNO, T1.MNM, T1.EMAIL, T2.MNO, T2.PHOT_PATH
FROM BIT_MEMBS T1, BIT_MEMB_PHOS T2
WHERE T1.MNO = T2.MNO;

/* 신 문법 */
SELECT T1.MNO, T1.MNM, T1.EMAIL, T2.MNO, T2.PHOT_PATH
FROM BIT_MEMBS T1 NATURAL JOIN BIT_MEMB_PHOS T2;


/* 내춰럴 조인이 안되는 경우! */
/* BIT_MEMBS(회원기본정보) --- BIT_MGRS(매니저정보) */
/* 구 문법
 * => 직접 어떤 컬럼과 비교하여 결합할지 지정하기 때문에 잘 동작한다. 
 */
SELECT T1.MNO, T1.MNM, T1.EMAIL, T1.TEL, T2.MGRNO, T2.POSI
FROM BIT_MEMBS T1, BIT_MGRS T2
WHERE T1.MNO = T2.MGRNO; /* 동등 연산자(Equal)를 사용하여 연결.*/

/* 신 문법
 * => 부모 테이블의 PK와 자식 테이블의 FK의 컬럼 이름이 다르기 때문에
 *    내춰럴 조인이 이루어지지 않는다.
 * => 그냥 무식한 cross 조인이 이루어진다.
 */
SELECT T1.MNO, T1.MNM, T1.EMAIL, T1.TEL, T2.MGRNO, T2.POSI
FROM BIT_MEMBS T1 NATURAL JOIN BIT_MGRS T2;

/* FK 이름과 PK 이름이 같지만, FK 컬럼이 여러 개인 경우, 
 * => BIT_COURS(교육과정) --- BIT_APPLS(과정신청) 
 */
/* 구 문법
 * => 두 개의 FK 컬럼 중에서 어떤 컬럼을 기준으로 결합할지 지정할 수 있다. 
 */
SELECT T1.CONO, T1.TITL, T2.CONO, T2.SNO
FROM BIT_COURS T1, BIT_APPLS T2
WHERE T1.CONO = T2.CONO; /* 정상적으로 조인이 이루어진다.*/

/* 신 문법
 * => FK 컬럼이 두 개인데 그 중 한 개(CONO)는 부모테이블에 일치하는 컬럼이 있고,
 *    나머지 한 개(SNO)가 부모 테이블에 일치하는 컬럼이 없기 때문에 내춰럴 조인을 
 *    수행할 수 없다. 
 */
SELECT T1.CONO, T1.TITL, T2.CONO, T2.SNO
FROM BIT_COURS T1 NATURAL JOIN BIT_APPLS T2;











