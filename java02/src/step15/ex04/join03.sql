/* JOIN ~ USING(컬럼) 조인
 * => 두 테이블의 데이터를 연결할 때 기준으로 사용할 컬럼을 지정한다.
 * => NATURAL 조인의 한계를 극복하는 문법.
 *    => FK 컬럼의 이름과 일치하는 PK 컬럼을 찾을 수 없다면 
 *       연결을 제대로 수행하지 못하는 문제. 
 */

/* BIT_MEMBS(회원정보) --- BIT_MEMB_PHOS(회원사진) 
 * => 두 테이블의 관계를 보면 NATURAL JOIN으로도 연결할 수 있지만,
 *    다음과 같이 JOIN ~ USING()을 사용하여
 *    조인할 때 사용할 기준 컬럼을 명확히 지정할 수 있다.
 */
SELECT T1.MNO, T1.MNM, T1.EMAIL, T2.MNO, T2.PHOT_PATH
FROM BIT_MEMBS T1 JOIN BIT_MEMB_PHOS T2 USING(MNO);

/* 특히 다음과 같이 FK 컬럼이 여러 개인 경우 어떤 컬럼을 기준으로 
 * 부모 테이블과 관계를 맺을 지 결정할 때 JOIN ~ USING() 문법은 유용한다.
 * => FK 컬럼이 두 개인데 그 중 CONO 컬럼을 사용하여 부모 테이블의 데이터와 연결한다.
 */
SELECT T1.CONO, T1.TITL, T2.CONO, T2.SNO
FROM BIT_COURS T1 JOIN BIT_APPLS T2 USING(CONO); /* 실행 OK! */


/* 다음 조인은 FK와 PK 이름이 다르기 때문에 JOIN ~ USING 문법으로도 해결 불가!*/
SELECT T1.MNO, T1.MNM, T1.EMAIL, T1.TEL, T2.MGRNO, T2.POSI
FROM BIT_MEMBS T1 JOIN BIT_MGRS T2 USING(MGRNO); /* 실행 오류! */















