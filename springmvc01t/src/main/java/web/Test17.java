/* 주제: 파일 업로드
 * => test17.html 입력폼의 파일 업로드 처리
 * => test17result.jsp 는 파일업로드 결과 출력    
 */
package web;

import java.io.File;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller   
public class Test17 {
  @Autowired
  ServletContext sc; // 이 객체는 메서드의 파라미터로 받을 수 없다.
  
  @RequestMapping("/test17")
  public String upload(
      String name, 
      @RequestParam(defaultValue="20") int age, 
      MultipartFile file1, 
      MultipartFile file2,
      Model model) {
    
    model.addAttribute("name", name);
    model.addAttribute("age", age);
    
    String newFilename = null;
    if (!file1.isEmpty()) {
      newFilename = this.getNewFilename(file1.getOriginalFilename());
      try {
        file1.transferTo(new File(sc.getRealPath("/upload/" + newFilename)));
      } catch (Exception e) {}
      model.addAttribute("file1", newFilename);
    }
    
    if (!file2.isEmpty()) {
      newFilename = this.getNewFilename(file2.getOriginalFilename());
      try {
        file2.transferTo(new File(sc.getRealPath("/upload/" + newFilename)));
      } catch (Exception e) {}
      model.addAttribute("file2", newFilename);
    }
    return "/test17result.jsp";
  } 
  
  int count = 0;
  private String getNewFilename(String originFilename) {
    if (count > 100) {
      count = 0;
    }
    return System.currentTimeMillis() + "_" + (++count) + extractFileExt(originFilename);
  }
  
  private String extractFileExt(String filename) {
    return filename.substring(filename.lastIndexOf("."));
  }
  
}










