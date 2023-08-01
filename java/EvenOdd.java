import java.util.*;
class EvenOdd
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		sc.close();
	}	
}