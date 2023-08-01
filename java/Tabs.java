import java.util.*;
class Tabs
{
	public static void main(String args[])
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a no");
		int val = sc.nextInt();
		int sum =0;
		int mul =0;
		for(int i =1 ; i<=10; i++)
		{
			mul= i* val;
			sum = sum+ mul;
			System.out.print(" " + mul);
		}
		System.out.println();
		System.out.println(" " + sum);
	}
}