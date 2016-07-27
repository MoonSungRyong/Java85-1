/* 주제: 스레드 - JVM의 기본 스레드들 */
package step14;

public class Exam093_2 {

  public static void main(String[] args) {
    // 1) main() 호출하는 스레드 알아내기
    Thread mainThread = Thread.currentThread();
    
    // 2) "main" 스레드가 소속된 그룹 알아내기
    ThreadGroup mainTG = mainThread.getThreadGroup();

    // 3) 상위 스레드 그룹 알아내기
    ThreadGroup systemTG = mainTG.getParent();

    // 4) 최상위 스레드 그룹에서부터 하위 그룹까지 모두 스레드 정보를 출력한다.
    printThreadInfo(systemTG, 0);
    
    
  }
  
  static void printThreadInfo(ThreadGroup tg, int step) {
    printSpace(step * 2); 
    System.out.printf("=> [%s]\n", tg.getName());
    Thread[] threadList = new Thread[10];
    int count = tg.enumerate(threadList, false);
    for (int i = 0; i < count; i++) {
      printSpace(step * 2); 
      System.out.printf("  * %s\n", threadList[i].getName());
    }
    
    ThreadGroup[] threadGroupList = new ThreadGroup[10];
    count = tg.enumerate(threadGroupList, false);
    for (int i = 0; i < count; i++) {
      printThreadInfo(threadGroupList[i], step + 1);
    }
  }
  
  static void printSpace(int len) {
    for (int i = 0; i < len; i++) 
      System.out.print(" ");
  }

}

/* JVM 스레드 맵
 * [main TG]
 *   => main T
 * 
 * 
 * 메인 스레드?
 * => main() 메서드를 호출하는 스레드
 * => JVM 프로세스가 직접 main() 메서드를 호출하는 것은 아니다.
 * 
 * 스레드 그룹?
 * => 스레드가 속해 있는 그룹
 * 
 */











