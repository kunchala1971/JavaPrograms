import java.io.*;
import java.util.*;
/*ReadLinesFromFile*/
public class Prog5
{
public static void main(String a[])
{
Scanner in=new Scanner(System.in);
BufferedReader br = null;

String strLine = "";
String fname="";
try
{
System.out.println("Enter Your File Name");
fname=in.next();
br = new BufferedReader( new FileReader(fname));

int i=1;
while( (strLine = br.readLine()) != null)
{
System.out.println(i+ " " + strLine);
i++;
}

}
catch(FileNotFoundException e)
{
System.err.println("Unable to find the file:" + fname  );
}
catch (IOException e1)
{
 System.err.println("Unable to read the file: " + fname);
}
}
}
