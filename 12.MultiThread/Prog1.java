/*
What is multithread ?
multithread is a separate program.
A Single processor can do the multple programs simultaneously.
it executes concurrently or parallely depends upon the system speed.
In Operating system we are calling Multitasking
In Programming Languages we are calling Multithrading

*/
import java.io.*;
import java.util.*;
class Prog1 extends Thread
{
public void run()
{
    try
    {
        System.out.println("\nMy First Thread is Started");
        for(int i=1;i<=5;i++)
        {
            System.out.println("\ni=" + i);
            if(i==1 || i==3)
            {
            sleep(1000);
            }
        }
        System.out.println("\nThread is Completed");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
public static void main(String args[])
{
Prog1  mt=new Prog1 ();
mt.start();
}

}
