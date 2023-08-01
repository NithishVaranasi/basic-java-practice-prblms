import java.io.*;
import java.util.*;
class Randnum
{
	public static void main (String []x)
	{
		int guesses=3;
		Scanner sc =new Scanner(System.in);
		Random rand= new Random();
		int randnum =rand.nextInt(51);
		System.out.println("FIVE GUESSES TO WIN A LOOT");
		System.out.println("GENERATED A RANDOM NUMBER");
		for(;;)
		{
			
			System.out.println("ENTER THE NUMBER TO GUESS");
			int elem =sc.nextInt();
			if(elem==randnum)
			{
				System.out.println("THE ELEMENTS ARE MATCHED");
				System.out.println("Oh.... FUCK OOPS U LOST U R TIME , GO AHEAD"+ "U R MAVERICK");
				break;
			}
			else if(elem<randnum)
			{
				guesses=guesses-1;
				if(guesses==0)
				{
					System.out.println("GUESSES TO BE FINISHED");
					break;
				}
				
				System.out.println("THE ELEMENT IS < RANDOM. NOT MATCHED PLEASE RE=ENTER THE ELEMENTS");
				System.out.println("OHH! FUCK.... GUESS AGAIN!!!");
			}
			else 
			{
				guesses=guesses-1;
				if(guesses==0)
				{
					System.out.println("GUESSES FINISHED");
					break;
				}
				System.out.println("THE ELEMENT IS > RANDOM. NOT MATCHED  RE=ENTER THE ELEMENTS");
				System.out.println("OH! FUCK... GUESS AGAIN!!!");
			}
		}
		
		System.out.println("THE GENERATED RANDOM NUMBER IS"+randnum);
		sc.close();
	}
}