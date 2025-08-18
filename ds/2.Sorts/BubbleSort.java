import java.util.Scanner;

public class BubbleSort {
  public static void main(String args[])  
  {
    int nums[],n,temp;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter n value");
    n=in.nextInt();
    nums=new int[n];
    System.out.println("Enter " + n + " Elements");
    for(int i=0;i<n;i++)
    {
      nums[i]=in.nextInt();
    }
     System.out.println("The Before Sort the Elements are");
    for(int i=0;i<n;i++)
    {
      System.out.print(nums[i] + " ");
    }
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(nums[i]>nums[j])
        {
          temp=nums[i];
          nums[i]=nums[j];
          nums[j]=temp;
        }
      }
    }
    System.out.println("The Sorted Elements are");
    for(int i=0;i<n;i++)
    {
      System.out.print(nums[i] + " ");
    }

  }
}
