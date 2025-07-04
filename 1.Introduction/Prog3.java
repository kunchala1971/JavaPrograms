import java.util.*;
class Prog3
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        float r,area,pi=3.1416f;
        System.out.println("Enter radius value");
        r=scanner.nextFloat();
        area=pi*r*r;
        System.out.println(r + " Area is " + area);
    }
}