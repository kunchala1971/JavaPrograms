//String Tokens
import java.util.StringTokenizer;
public class Prog4
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("Hello how are you students");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}

}
}
