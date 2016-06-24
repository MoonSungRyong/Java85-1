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

### 연습3(ex03) - 게시판 + 연락처
- MainApp.java : 메뉴 출력
