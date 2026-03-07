import java.util.*;
//HashMap With User Inputs
public class Prog7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> map = new HashMap<>();

        for(int i=1;i<=3;i++)
        {
            System.out.print("Enter Id: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            map.put(id,name);
        }

        System.out.println("Student List");

        for(Map.Entry<Integer,String> e : map.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}