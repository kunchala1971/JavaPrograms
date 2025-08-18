import java.util.Scanner;
class Prog1
{
public static void main(String args[]) /*throws IOException*/
{
try
{
    // DataInputStream in=new DataInputStream(System.in);
    Scanner in=new Scanner(System.in);
    int a[],n,i;
    System.out.println("Enter n value");
    n=in.nextInt();
    a=new int[n];
    System.out.println("Enter " + n + " Elements");
    for(i=0;i<n;i++)
    {
    a[i]=in.nextInt();
	  }

    System.out.println("The given Elements are");
    for(i=0;i<=n;i++)
    {
    System.out.println(i+1 + ")" + a[i]);
    }
}

catch(ArrayStoreException ex2)
{
  System.out.println("Raised Error " + ex2);
}
catch(ArrayIndexOutOfBoundsException ex1)
{
  System.out.println("ArrayIndexOutOfBoundsException Raised. Error: "+ex1);
}
catch(NumberFormatException ex4)
{
  System.out.println("NumberFormatException Raised. Error:" + ex4);
}

}
}
