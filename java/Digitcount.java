import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Digitcount {
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        countRepeatedDigits(number);
    }
    public static void countRepeatedDigits(long number) 
	{
        String numberString = String.valueOf(number);
        Map<Character, Integer> digitCountMap = new HashMap<>();
        for (int i = 0; i < numberString.length(); i++) 
		{
            char digit = numberString.charAt(i);
            digitCountMap.put(digit, digitCountMap.getOrDefault(digit, 0) + 1);
        }
        System.out.println("Digit count in the number " + number + ":");

        for (Map.Entry<Character, Integer> entry : digitCountMap.entrySet()) 
		{
            int count = entry.getValue();
            System.out.println(entry.getKey() + " is repeated " + count + " times.");
        }
    }
}
