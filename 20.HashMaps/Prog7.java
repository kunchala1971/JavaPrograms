import java.util.*;
//HashMap With User Inputs
public class Prog7 {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> map = new HashMap<>();
        System.out.println("enter n value");
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter " + i + " Details");
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