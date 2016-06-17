// 5단계: 기존 메서드를 연산자로 전환한다.
// => 연산자란 데이터를 다루는 기능을 한다.
// => 클래스에서 데이터란 인스턴스를 얘기한다.
// => 따라서 인스턴스 변수를 쉽게 다룰 수 있도록 인스턴스 메서드로 선언한다.
package step05.ex02;

public class Score4 {
  int no; // <== 인스턴스 변수 = 필드(field) = 속성(attribute)
  String name;
  float[] scores;
  float sum;
  float aver;

  // 인스턴스 메서드
  // => non-static 이다.
  // => 인스턴스 주소를 갖고 있는 this 변수가 내장되어 있다.
  void sum() { // <== 인스턴스 메서드 = 연산자(operator) = 함수(function)
    for (float score : this.scores) {
      this.sum += score;
    }
  }

  void aver() {
    this.aver = this.sum / this.scores.length;
  }

  void addBonus(float bonus) {
    for (int i = 0; i < this.scores.length; i++) {
      this.scores[i] += bonus;
      if (this.scores[i] > 100f) {
        this.scores[i] = 100f;
      }
    }
  }
}
