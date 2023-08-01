import java.util.*;
class Movezero
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements");
        for (int i = 0; i < size; i++) 
		{
            arr[i] = scanner.nextInt();
        }
        int nonzero = 0;
        for (int i = 0; i < size; i++) 
		{
            if (arr[i] != 0) 
			{
                arr[nonzero++] = arr[i];
            }
        }
        while (nonzero< size) 
		{
            arr[nonzero++] = 0;
        }
        System.out.println("new array:");
        for (int i = 0; i < size; i++) 
		{
            System.out.print(arr[i] + " ");
        }
    }
}