# 자바 사용법 - 기본 편
## 소스 폴더와 컴파일된 파일을 두는 폴더를 분리하기

- java02/Exam001.java : 소스 파일과 .class 파일 분리 전
- java02/src/Exam002.java : 소스 파일과 .class 파일 분리

## step01(java02/src/step01)
- Exam003.java : 패키지를 사용하여 클래스 분류하기
- Exam004.java : 리터럴 표현 - 정수 표현
- Exam005.java : 리터럴 표현 - 부동소수점 표현
- Exam006.java : 리터럴 표현 - 정수를 2진수, 8진수, 10진수, 16진수로 표현하기
- Exam007.java : 리터럴 표현 - 구분자 underline(\_) 를 사용하여 숫자를 나눠 표현하기
- Exam008.java : 리터럴 표현 - 정수가 메모리에 저장되는 원리
- Exam009.java : 리터럴 표현 - 부동소수점이 메모리에 저장되는 원리
- Exam010.java : 리터럴 표현 - 문자 표현

## step02(java02/src/step02)
- Exam011.java : 변수 사용 - 자바 기본 데이터 형
- Exam012.java : 변수 사용 - 정수 리터럴 값 저장
- Exam013.java : 변수 사용 - 정수 연산과 데이터 타입
- Exam014.java : 변수 사용 - 다른 타입끼리의 연산 결과
- Exam015.java : 변수 사용 - 배열과 주소 변수(레퍼런스), 가비지와 가비지 컬렉터
- Exam016.java : 변수 사용 - 복합데이터 사용
- Exam017.java : 변수 사용 - 사용자 정의 데이터 타입
- Exam018.java : 변수 사용 - 자바에서 기본으로 제공하는(built-in) 복합 데이터 타입

## step03(java02/src/step03)
- Exam019.java : 연산자 사용 - 비트 논리 연산자
- Exam020.java : 연산자 사용 - 비트 논리 연산자 활용
- Exam021.java : 연산자 사용 - 비트 이동 연산자
- Exam022.java : 연산자 사용 - 비트 이동 연산자 활용
- Exam023.java : 연산자 사용 - 비트 이동 연산자 활용2

## step04(java02/src/step04)
- Exam024.java : 반복문 사용 - do ~ while
- Exam025.java : 반복문 사용 - for ( : )

## step05(java02/src/step05)
- Exam026.java : 사용자 정의 데이터 타입 다루기 - 새 데이터 타입 정의하기
- Exam027.java : 사용자 정의 데이터 타입 다루기 - 사용자 정의 연산자 추가하기
- Exam028.java : 사용자 정의 데이터 타입 다루기 - 메서드 문법
- Exam029.java : 사용자 정의 데이터 타입 다루기 - call by value, call by reference
- Exam030.java : 사용자 정의 데이터 타입 다루기 - static 메서드
- Exam031.java : 사용자 정의 데이터 타입 다루기 - 메서드들을 분류하는 문법 "클래스"
  Array.java <= 배열과 관련된 기능을 모아둔 클래스
- Exam032.java : 사용자 정의 데이터 타입 다루기 - static 변수  
  Array2.java <= 배열을 저장할 static 변수를 선언
- Exam033.java : 사용자 정의 데이터 타입 다루기 - static 변수의 한계
- Exam034.java : 사용자 정의 데이터 타입 다루기 - static 변수의 한계 극복
- Exam035.java : 사용자 정의 데이터 타입 다루기 - instance 변수
  Array3.java <= instance 변수를 사용하여 배열을 개별적으로 관리
- Exam036.java : 사용자 정의 데이터 타입 다루기 - instance 메서드
  Array4.java <= instance 메서드를 사용하여 인스턴스 주소를 자동으로 받기

### 연습1(ex01)
- Test01.java : 스태틱 메서들르 사용하여 명령들을 재사용하기 좋게 기능 별로 묶기
- Test02.java : 클래스 문법을 사용하여 메서드를 분류하기
  Calc.java
- Test03.java : 스태틱 변수를 사용하여 메서드들의 작업 결과를 저장할 공통 메모리 준비하기
  Calc2.java
- Test04.java : 여러 개의 작업을 동시에 실행했을 때 스태틱 변수의 한계를 경험하기
- Test04_2.java : 인스턴스 변수를 사용하여 메서드들의 작업 결과를 개별적으로 관리하기
  Calc3.java
- Test05.java : 인스턴스 변수를 보다 쉽게 다룰 수 있는 인스턴스 메서드 사용하기
  Calc4.java

### 연습2(ex02)
- Test00.java : 객체지향 구조로 소스 코드를 변환하기 전.
- Test01.java : 1단계 - 자주 사용할 명령어를 별도의 블록으로 묶어 놓는다.
- Test01_2.java : sum() 메서드 개선, 기타 기능 메서드화.
- Test02.java : 2단계 - 클래스 문법을 사용하여 메서드를 분류한다.
  Score.java
- Test03.java : 3단계 - 메서드가 공통으로 사용하는 데이터는 클래스 변수(static 변수)에 저장해두자!
  Score2.java
- Test03_2.java : 스태틱 변수의 한계 경험
- Test04.java : 4단계 - 메서드와 데이터 타입의 결합
  Score3.java
- Test05.java : 5단계 - 데이터 타입의 연사자로서 메서드를 정의하기
  Score4.java

  ### 연습3(ex03)
  - Test01.java : 데이터 타입 정의 - 자동차 정보 다루기
    Car.java
  - Test02.java : 데이터 타입 정의 - 도서 정보 다루기
    Book.java
  - Test03.java : 데이터 타입 정의 - 주문 정보 다루기
    Order.java       
  - Test04.java : 데이터 타입 정의 - 게시물 정보 다루기
    Board.java
  - Test05.java : 데이터 타입 정의 - 회원 정보 다루기
    User.java
  - Test06.java : 데이터 타입 정의 - 연락처 정보 다루기
    Contact.java

## step06(java02/src/step06)
- Exam037.java : JVM 메모리 영역 - 클래스 실행
- Exam038.java : JVM 메모리 영역 - JVM이 관리하는 메모리 영역과 변수
- Exam039.java : JVM 메모리 영역 - JVM이 관리하는 메모리 영역과 변수2
- Exam040.java : JVM 메모리 영역 - 클래스 로딩 시점 확인1
- Exam041.java : JVM 메모리 영역 - 클래스 로딩 시점 확인2

## step07(java02/src/step07)
- Exam042.java : 생성자 - 생성자 사용 전
  Board.java
- Exam043.java : 생성자 - 기본 생성자
  Board2.java  
- Exam044.java : 생성자 - 생성자 용도
  Board3.java
- Exam045.java : 생성자 - 파라미터가 있는 생성자
  Board4.java
- Exam046.java : 생성자 - this() => 생성자에서 다른 생성자를 호출하기
  Board5.java  
- Exam047.java : 생성자 - 기본 생성자가 없고 파라미터를 받는 생성자만 있는 경우
  Board6.java  
- Exam048.java : 기타 - 사용자로부터 키보드 입력 받기
- Exam049.java : 기타 - 사용자로부터 키보드 입력 받기2
                      - 패키지 클래스 사용법
- Exam050.java : 기타 - import 사용법
- Exam051.java : 기타 - import 사용법2
- Exam052.java : 기타 - 사용자 입력과 객체 생성
- Exam053.java : 배열과 인스턴스 - 레퍼런스 배열
- Exam054.java : 배열과 인스턴스 - 레퍼런스 배열2

### 연습1(ex01) - 게시판
- Test01.java : 레퍼런스 배열 연습 - 1단계: 한 개의 데이터 입력 받기
  Board5.java
- Test02.java : 레퍼런스 배열 연습 - 2단계: 반복해서 데이터 입력 받기
- Test03.java : 레퍼런스 배열 연습 - 3단계: 입력 받은 데이터를 배열에 보관하기
- Test04.java : 레퍼런스 배열 연습 - 4단계: 입력 받은 데이터를 배열에 보관하기(단계별 코딩)
- Test04.java : 레퍼런스 배열 연습 - 명령어들을 재사용하고 관리하기 좋게 블록으로 묶는다.

### 연습2(ex02) - 연락처
- Test01.java : 레퍼런스 배열 연습 - 1단계: 한 개의 데이터 입력 받기
  Contact.java 
- Test02.java : 레퍼런스 배열 연습 - 2단계: 반복해서 데이터 입력 받기
- Test03.java : 레퍼런스 배열 연습 - 3단계: 입력 받은 데이터를 배열에 보관하기
- Test04.java : 레퍼런스 배열 연습 - 명령어들을 재사용하고 관리하기 좋게 블록으로 묶는다.

### 연습3(ex03) - 게시판 + 연락처(1단계: 메인 메뉴 기능 추가)
- MainApp.java : 메인 메뉴 출력

### 연습4(ex04) - 게시판 + 연락처(2단계: 게시판, 연락처 클래스 추가)
1) 메인 메뉴 출력: MainApp.java
2) 값 객체: Board.java, Contact.java
3) 게시판 처리: BoardController.java
4) 연락처 처리: ContactController.java

### 연습5(ex05) - 게시판 + 연락처(3단계: 클래스 변수 사용)
1) BoardController와 ContactController의 main()메서드 이름을 service() 변경
  => 실행할 수 있는 클래스를 MainApp로 한정한다.
2) BoardController와 ContactController는 service()를 호출할 때 마다
  새로 레퍼런스 배열을 만들어서 작업을 처리한다.
  즉 메서드 호출이 끝나면 레러펀스 배열이 제거된다.
  기존에 입력한 내용을 날린다.
  => service()에 있던 배열 레퍼런스와 인덱스를 클래스 변수로 만든다.
3) MainApp에서 만든 키보드 스캐너를 BoardController와 ContactController가 공유하기
  => 중복해서 인스턴스를 만들지 않기 때문에 자원(메모리) 절약할 수 있다.

### 연습6(ex06) - 게시판 + 연락처(4단계: 인스턴스 변수 사용 전)
1) 여러 개의 게시판을 만들기
  => BoardController는 오직 한 개의 게시판 데이터만 다룬다.
  => 해결책: BoardController를 여러 개 복제하여 사용한다.
  => 문제점: 반복해서 코드를 추가 삭제해야 한다. 유지보수 불편!
  
### 연습7(ex07) - 게시판 + 연락처(5단계: 인스턴스 변수 사용 후)
1) BoardController가 갖고 있는 데이터 중에서 각 게시판 별로 
   따로 관리해야 하는 변수는 인스턴스 변수로 선언한다.
   => Board[] boards, int i, String boardName
2) ContactController에 대해서도 여러 개의 연락처를 개별적으로 관리할 수 있도록
   처리한다.
  
### 연습8(ex08) - 게시판 + 연락처(6단계: CRUD 명령 처리)
1) BoardController의 service() 등 메서드를 변경한다.
2) ContactController의 service() 등 메서드를 변경한다.
3) 사용자 정보 CRUD 추가
4) 프로젝트 정보 CRUD 추가

### 연습9(ex09) - 게시판 + 연락처(7단계: DAO 도입)
1) BoardController에서 데이터 처리 부분을 BoardDao 클래스로 이전
  => BoardDao 클래스 생성
2) ContactController, MemberController, ProjectController도 처리

## step08(java02/src/step08)
- ex01/Exam055_*.java : 상속 사용 전
- ex02/Exam056_*.java : 상속 적용 후 - 인스턴스 변수 상속
- ex03/Exam057_*.java : 상속 - 인스턴스 메서드 상속 
- ex04/Exam058.java : 상속 - 스태틱 변수 상속
       Exam059_*.java : 클래스 로딩 
       Exam060_*.java : 생성자 호출
- ex05/Exam061_*.java : 각종 초기화 블록 실행 순서
- ex06/Exam062.java : 상속 - 인스턴스 생성과 초기화
       Exam063_*.java : 다형성 - 다형적 변수
       Exam064_*.java : 다형성 - 오버라이딩
       Exam065_*.java : 다형성 - 오버로딩

## step09(java02/src/step09)      
- Exam066_*.java : Object 클래스
- Exam067_*.java : String 클래스
- Exam068_*.java : StringBuffer 클래스
- Exam069_*.java : Date 클래스
- Exam070_*.java : 랩퍼(Wrapper) 클래스
- Exam071_*.java : Collection 클래스
- Exam072_*.java : Iterator 패턴 활용

## step10(java02/src/step10)
- Exam073.java : OOP 문법 활용 - 상속 활용 전
- Exam074.java : OOP 문법 활용 - 상속 활용 후
- Exam075.java : OOP 문법 활용 - 상속을 이용한 기능 확장
- Exam076.java : OOP 문법 활용 - Frame의 기본 배치 관리자
- Exam077.java : OOP 문법 활용 - BorderLayout 배치관리자 사용법
- Exam078.java : OOP 문법 활용 - FlowLayout 배치관리자 사용법
- exam079/*.java : OOP 문법 활용 - 객체 간의 협력을 이해하기
- exam080/*.java : OOP 문법 활용 - 이벤트 처리와 리스너
- exam081/*.java : 인터페이스 사용법
- exam082/*.java : inner class 사용 전
- exam083/*.java : inner class 사용 후
- exam084/*.java : 이너 클래스 사용법
- exam085/*.java : final 사용법

## step11(java02/src/step11)
### ex01 : 상속, 옵저버(리스너) 패턴, 익명 이너 클래스
### ex02 : 메뉴 사용법, 익명 이너 클래스, 인터페이스 구현
### ex03 : Panel 사용 및 교체 방법
### ex04 : CardLayout 사용법
### ex05 : BoardPanel UI 구현 - 목록 및 입력 폼 
### ex06 : BoardDao 적용, TextArea 대신 List 사용하여 게시물 목록 출력
### ex07 : 데이터를 파일로 쓰고, 읽기
- Exam086_*.java : 파일을 다루는 도구 - File 클래스 사용법
- Exam087_*.java : 파일을 다루는 도구 - FileOutputStream/FileInputStream 사용법
- Exam088_*.java : 파일을 다루는 도구 - FileWriter/FileReader 사용법
- Exam089_*.java : 데이터 가공 스트림 클래스 사용법, transient 옵션의 사용법.

## step12(java02/src/step12)
### exam01 : 캡슐화의 도입 배경
### exam02 : 캡슐화 도입 장점
### exam03 : 캡슐화 문법 정리 
### exam04 : 캡슐화 사용법 확인!

## step13(java02/src/step13)
### ex01 : JDBC 적용
=> JDBC 드라이버를 클래스 경로에 추가해야 한다.
1) java02 프로젝트 폴더에 libs 폴더를 생성한다.
2) MySQL JDBC Driver 파일을 복사해온다.
3) JDBC Driver를 컴파일할 때 찾을 수 있도록 클래스 경로에 추가한다.
   => 프로젝트의 컨텍스트메뉴 > Build Path > Configure Build Path... 클릭
   => Library 탭 선택 > Add Jars... 버튼 클릭 > mysql****.jar 파일 선택 > OK
=> step11/ex07의 파일을 복사해온다.
=> BoardDao 클래스를 변경한다.
=> 나머지는 소스코드에서 확인하라!

### ex02 : 의존 객체 주입


- Exam090_*.java : try...catch... 예외처리 사용법
- Exam091_*.java : JDBC 사용법
- Exam092_*.java : DAO 적용

## step14(java02/src/step14)
### ex01/* : 네트워크 프로그래밍 소개
### ex02/* : 바이너리 데이터 송수신
### ex03/* : 미니 웹브라우저 만들기
### ex04/* : 서버 계산기 => Application Server의 도입
  CalcServer01.java : 1단계 - 한 번 연결에 한 개의 명령처리
  CalcServer02.java : 2단계 - 한 번 연결에 여러 개의 명령처리
  CalcServer03.java : 3단계 - 순차적으로 여러 번의 연결 허용
  CalcServer04.java : 4단계 - 동시 연결 허용
  CalcServer.java : 5단계 - Connectionful 방식을 Connectionless 방식으로 전환
### ex05/* : 게시판 => Application Server 도입
  
- Exam093_*.java : 스레드 사용법
- Exam094_*.java : 동기화, 세마포어(Semaphore), 뮤텍스(Mutex), 
                   크리티컬 섹션(Critical Section)



# 디자인 패턴(java02/src/designpatterns)
## factorymethod : 팩토리 메서드 패턴 소개

## iterator : 이터레이터 패턴 소개
- step01/*.java : iterator 적용 전
- step02/*.java : 객체화 + 이터레이터 적용
- step03/*.java : 상속 - generalization
- step04/*.java : 추상 클래스와 추상 메서드 
- step05/*.java : 추상 클래스의 한계
- step06/*.java : 추상 클래스와 인터페이스의 결합

## observer : 옵서버 패턴 소개
- step01/*.java : 옵서버 적용 전
- step02/*.java : WordCounter가 새로 등장 
- step03/*.java : MyObserver가 등장
- step04/*.java : 인터페이스 적용
- step05/*.java : 컬렉션 객체를 이용하여 여러 개의 옵서버를 관리하기

## decorator : 데코레이터 패턴 소개
- *.java

## singleton : 싱글톤 패턴 소개
- *.java


# 알고리즘(java02/src/algorithms)
## sort.quick : 퀵 소트 소개
## list.linkedlist : 연결 리스트 소개

# MySQL 설정
1. root 암호 변경

2. 데이터베이스(스키마,schema) 생성 
   => Excel 파일을 생성하는 것과 같다.
   => create database java85db
      default character set utf8
      default collate utf8_general_ci;
      
3. 사용자 생성
   => create user 'java85'@'localhost' identified by '1111';
   
4. 사용자가 관리할 데이터베이스를 지정 및 권한 설정
   => grant all privileges on java85db.* to 'java85'@'localhost';
   
5. 게시판 테이블 생성 
   => 엑셀 파일에서 시트(sheet)를 생성하는 것과 같다.
create table boards (
  no int not null primary key auto_increment,
  title varchar(255) not null,
  conts text,
  writer varchar(20),
  cre_dt datetime not null,
  vw_cnt int default 0
);
      
6. 게시판 예제 데이터 입력
insert into boards(title, conts, cre_dt) values('1111','xxxx',now());
insert into boards(title, conts, cre_dt) values('2222','xxxx',now());
insert into boards(title, conts, cre_dt) values('3333','xxxx',now());
insert into boards(title, conts, cre_dt) values('4444','xxxx',now());
insert into boards(title, conts, cre_dt) values('5555','xxxx',now());
insert into boards(title, conts, cre_dt) values('6666','xxxx',now());
insert into boards(title, conts, cre_dt) values('7777','xxxx',now());
insert into boards(title, conts, cre_dt) values('8888','xxxx',now());
insert into boards(title, conts, cre_dt) values('9999','xxxx',now());
insert into boards(title, conts, cre_dt) values('0000','xxxx',now());
  
7. 입력 확인
select * from boards;
  
8. boards 테이블에 컬럼 추가
alter table boards
  add password varchar(100);
  
update boards set password = password('1111');
  
  
  
  
  
  
  
  
   
