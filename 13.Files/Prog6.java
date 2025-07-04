import java.io.*;

public class Prog6 {
    public static void main(String a[]) {
        BufferedReader br = null;
        Reader r = new InputStreamReader(System.in);
        br = new BufferedReader(r);
        String str = null, msg = "";
        try {
            System.out.println("Enter Input, exit to quit.");
            do {
                str = br.readLine();
                msg += str;
                // System.out.println(str);
            } while (!str.equalsIgnoreCase("exit"));
            System.out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
