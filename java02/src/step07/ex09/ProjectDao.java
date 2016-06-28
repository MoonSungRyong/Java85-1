package step07.ex09;

public class ProjectDao {
  Project[] projects = new Project[100];
  int length;
  
  void insert(Project project) {
    this.projects[this.length++] = project;
  }
  
  Project[] selectList() {
    Project[] dataArray = new Project[this.length];
    for (int i = 0; i < this.length; i++) {
      dataArray[i] = this.projects[i];
    }
    return dataArray;
  }
  
  Project selectOne(int no) {
    if (no >= 0 && no < this.length) {
      return this.projects[no];
    }
    return null;
  }
  
  void update(int no, Project project) {
    this.projects[no] = project;
  }
  
  int delete(int no) {
    if (no >= 0 && no < this.length) {
      for (int i = no; i < this.length; i++) {
        this.projects[i] = this.projects[i + 1];
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
