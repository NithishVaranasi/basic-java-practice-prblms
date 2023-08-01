import java.util.*;
class MoveZero1
{
	public static void main(Stirng x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of elements");
		int []size= sc.nextInt();
		int [] arr1=size.nextInt();
		System.out.println("enter the elements");
		for(int i=0; i<size;i++);
		{
			arr1[i]=sc.nextInt();
		}
		  int non = 0;
        for (int i = 0; i < size; i++) 
		{
            if (arr1[i] != 0) 
			{
                arr1[non++] = arr1[i];
            }
        }
        while (non < size) 
		{
            arr1[non++] = 0;
        }
        System.out.println("new array:");
        for (int i = 0; i < size; i++) 
		{
            System.out.print(arr1[i] + " ");
        }
	}
}