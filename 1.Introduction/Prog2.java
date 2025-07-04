import java.util.*;
class Prog2
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a,b values");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=a+b;
        System.out.println("A=" + a);
        System.out.println("B=" + b);
        System.out.println("Sum=" + c);
    }
}