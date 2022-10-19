import java.util.Scanner;
import java.util.Random;

public class Opdracht2
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int number1 = new Random().nextInt(10) + 1;
		int number2 = new Random().nextInt(100) + 1;
		int answer = 0;
		
		System.out.print("Wat is de uitkomst van " + number1 + " x " + number2 + ": ");
		int correctAnswer = (number1 * number2);
		
		do {
			int answerInput = keyboard.nextInt();
			answer = answerInput;
				if (answer == correctAnswer) {
					break;
				}
				System.out.println("Jammer, dat was incorrect, probeer het opnieuw ");
				System.out.print("\nWat is de uitkomst van " + number1 + " x "  + number2 + ": ");
			
			
		}
		while (answer != correctAnswer);
			System.out.println("Correct, het antwoord was " + correctAnswer);
		
		
		
		
	}
}
