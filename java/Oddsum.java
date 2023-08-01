import java.util.Scanner;
public class Oddsum 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        int sum = sumOfOddNumbers(start, end);
        System.out.println("Sum of odd numbers from " + start + " to " + end + ": " + sum);
        scanner.close();
    }
    public static int sumOfOddNumbers(int start, int end) 
	{
        if (start > end) 
		{
            return 0;
        } 
		else if (start % 2 != 0) 
		{
            return start + sumOfOddNumbers(start + 2, end);
        } 
		else 
		{
            return sumOfOddNumbers(start + 1, end);
        }
    }
}
