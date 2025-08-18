
import java.util.Scanner;
class Prog2
{
public static void main(String args[])
{
try
{
Scanner in=new Scanner(System.in);
int a,b,c;
System.out.println("Enter a values");
a=in.nextInt();
System.out.println("Enter b values");
b=in.nextInt();
if(a>0 && b>0)
{
c=a/b;
System.out.println("A=" + a + " B=" + b + " C=" + c);
}
else
{
  System.out.println("Division By Zero is Not Possible ");
}
}
catch(ArithmeticException ex)
{
System.out.println("Arithmatic Exception Raised:" + ex);
}
catch(NumberFormatException ex2)
{
System.out.println("NumberFormatException Raised :" + ex2);
}

}
}
