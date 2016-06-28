package step07.ex09;

public class MemberDao {
  Member[] members = new Member[100];
  int length;
  
  void insert(Member member) {
    this.members[this.length++] = member;
  }
  
  Member[] selectList() {
    Member[] dataArray = new Member[this.length];
    for (int i = 0; i < this.length; i++) {
      dataArray[i] = this.members[i];
    }
    return dataArray;
  }
  
  Member selectOne(int no) {
    if (no >= 0 && no < this.length) {
      return this.members[no];
    }
    return null;
  }
  
  void update(int no, Member member) {
    this.members[no] = member;
  }
  
  int delete(int no) {
    if (no >= 0 && no < this.length) {
      for (int i = no; i < this.length; i++) {
        this.members[i] = this.members[i + 1];
      }
      this.length--;
      return 1;
    } 
    return 0;
  }
  
  int size() {
    return this.length;
  }
}
