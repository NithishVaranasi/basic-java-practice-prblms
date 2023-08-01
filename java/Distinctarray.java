import java.io.*;
import java.util.*;
public class Distinctarray
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n1 size :");
		int n1 =sc.nextInt();
		int a[]=new int[n1];
		
		System.out.println("enter n1 ele :");
		
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=1;
		for(int i=0;i<n1-1;i++)
		{
				if(a[i]==a[i+1])
				{
					continue;
				}
				else
				{
					count+=1;
				}
		}
		System.out.println("count:"+count);
	}
}