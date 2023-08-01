import java.util.*;
class Sumofno 
{
    public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
        int n=sc.nextInt();
        int sum = getSingleDigitSum(n);
        System.out.println("Single-digit sum: " + sum);
    }
    public static int getSingleDigitSum(int n) {
        while (n > 9) {
            int temp = n;
            int digitSum = 0;
            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }
            n = digitSum;
        }
        return n;
    }
}
//if n%9!=0
//{m=n%9
//sop(m)
	