import java.io.File;
import java.util.*;

/*Getting File List From Folder*/
public class Prog3 {
  public static void main(String a[]) {
    try {
      File dir = new File("E:\\JavaPrograms\\13.Files");
      File[] files = dir.listFiles();
      for(File file: files)
      {
      System.out.println(file.getName());
      Thread.sleep(100);
      }
      // File file = new File("E:\\JavaPrograms\\13.Files");
      // String[] names = file.list();
      // for (String name : names) {
      //   System.out.println(name);
      //   Thread.sleep(100);
      // }

    } catch (Exception ex) {
      System.out.println(ex);
    }

  }
}
