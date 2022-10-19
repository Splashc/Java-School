import java.util.Scanner;
import java.util.Random;

public class Opdracht1
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int correctNumber = new Random().nextInt(10) + 1;
		
		System.out.print("Voer een nummer van 1 tot 10 in: ");
		int number = keyboard.nextInt();
		
		do {
			System.out.println("Jammer, u heeft niet goed geraden, probeer het opnieuw ");
			System.out.print("\nVoer een nummer van 1 tot 10 in: ");
			number = keyboard.nextInt();
		}
		while (number != correctNumber);
		
		System.out.println("Correct, het getal was " + correctNumber);
		
		
	}
}
