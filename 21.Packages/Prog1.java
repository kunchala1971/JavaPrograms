import tit.math.*;
import tit.general.*;
class Prog1
{
    public static void main(String args[])
    {
        MathFuns mf=new MathFuns();
        GenFun gf=new GenFun();
        System.out.println("Sum of Two Numbers:" + mf.sum2(10,20));
        System.out.println("Sum of Three Numbers:" + mf.sum3(10,20,30));
        gf.topTriangle(5);
        gf.bottomTriangle(5);
        gf.fullTriangle(5);
    }
}