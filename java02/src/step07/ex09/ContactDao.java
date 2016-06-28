package step07.ex09;

public class ContactDao {
  Contact[] contacts = new Contact[100];
  int length;
  
  // insert() 연산자: 연락처 주소를 내부 메모리에 보관한다.
  void insert(Contact contact) {
    this.contacts[this.length++] = contact;
  }
  
  // selectList() 연산자: 배열에 저장된 연락처 주소를 뽑아서 리턴한다.
  Contact[] selectList() {
    Contact[] dataArray = new Contact[this.length];
    for (int i = 0; i < this.length; i++) {
      dataArray[i] = this.contacts[i];
    }
    return dataArray;
  }
  
  // selectOne() 연산자: 배열의 특정 위치에 보관된 연락처 주소를 리턴한다.
  Contact selectOne(int no) {
    if (no >= 0 && no < this.length) {
      return this.contacts[no];
    }
    return null;
  }
  
  // update() 연산자: 배열의 특정 위치에 보관된 연락처 주소를 다른 주소로 교체한다.
  void update(int no, Contact contact) {
    this.contacts[no] = contact;
  }
  
  // delete() 연산자: 배열의 특정 위치에 보관된 주소를 제거한다.
  int delete(int no) {
    if (no >= 0 && no < this.length) {
      for (int i = no; i < this.length; i++) {
        this.contacts[i] = this.contacts[i + 1];
      }
      this.length--;
      return 1;
    } 
    return 0;
  }
  
  // size() 연산자: 배열에 저장된 연락처 주소가 몇 개인지 리턴한다.
  int size() {
    return this.length;
  }  
}







