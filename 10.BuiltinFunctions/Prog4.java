
//String Tokens
import java.util.Scanner;
import java.util.StringTokenizer;

public class Prog4 {
    public static void main(String args[]) {
        String name;
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        StringTokenizer st = new StringTokenizer(name);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}
