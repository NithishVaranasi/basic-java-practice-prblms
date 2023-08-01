import java.util.*;
                                                                                                         class Triplet
{
	
	public static boolean increasingTriplet(int[] arr)
	{
		int x = Integer.MAX_VALUE;
		int y = Integer.MAX_VALUE;
		for(int num:arr)
		{
			if(num<=x)
			{
				x=num;//updating the value
			}
			else if(num<=y)
			{
				y=num;
			}
			
			else
			{	
				System.out.println(x+" " +y+" "+num);
				return true;
				
			}
		}
		System.out.println(x+" " +y+" "); 
		return false;
	}
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of elements");
		int size= sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter elements");
		for(int i=0; i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		boolean result=increasingTriplet(arr);
		System.out.println(result);
	}
}