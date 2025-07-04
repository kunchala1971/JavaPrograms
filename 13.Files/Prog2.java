/*File Attributes*/
import java.io.*;
import java.util.Scanner;
public class Prog2
{
public static void main(String[] a)
{
String fname;
Scanner scanner=new Scanner(System.in);
try
{
System.out.println("Enter Your File Name");
fname=scanner.next();
File file = new File(fname);
System.out.println(file.canRead());//true
System.out.println(file.canWrite()); //true
System.out.println(file.createNewFile());//false
System.out.println(file.exists()); //true
System.out.println(file.getAbsolutePath());//curent path
System.out.println(file.isDirectory());//false
System.out.println(file.isHidden());//false
System.out.println(file.list());
System.out.println(file.delete());
System.out.println(file.createNewFile());//true
}
catch(Exception ex)
{
	System.out.println(ex);
}
}
}
