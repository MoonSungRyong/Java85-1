package step14.ex05.client;

import java.awt.Label;
import java.awt.Panel;

import step14.ex05.ProjectDao;

public class ProjectPanel extends Panel {
  private static final long serialVersionUID = 1L;

  ProjectDao projectDao;
  
  public ProjectPanel() {
    Label label = new Label("프로젝트 화면");
    add(label);
  }

  public void setProjectDao(ProjectDao projectDao) {
    this.projectDao = projectDao;
  }
  
  
}
