 import java.util.*;
  public class Prog4
  {
  public static void main(String[] args)
  {
  List<String> list = new ArrayList<String>();
  list.add("Red");
  list.add("Green");
  list.add("Orange");
  list.add("White");
  list.add("Black");
  System.out.println("List  :\n" + list);
  List<String> sublist = list.subList(0, 3);
  System.out.println("List of first three elements: " + sublist);
 }
}
