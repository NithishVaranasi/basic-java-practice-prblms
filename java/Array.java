import java.io.*;
import java.util.*;
class Array
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter size s1");
        int s1 =sc.nextInt();
        System.out.println("enter size s2");
        int s2 =sc.nextInt();
        int sum1=0,sum2=0;
        int arr[]=new int[s1];
        int arr1[]=new int[s2];
        System.out.println("enter elements of s1");
        for(int i=0;i<=s1;i++)
        {
            arr[i]=sc.nextInt();
            sum1 +=arr[i];
        }
        System.out.println("enter elements of s2");
        for(int i=0;i<=s2;i++)
        {
            arr1[i]=sc.nextInt();
            sum2 +=arr1[i];
        }
        if(sum1==sum2 && s1==s2)
        { 
            System.out.println("EMAS");
        }
        else
        {
            System.out.println("TON EMAS");
        }
    }
}