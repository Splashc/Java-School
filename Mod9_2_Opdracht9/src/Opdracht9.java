import java.util.Scanner;
import java.util.Random;

public class Opdracht9
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int randomNum = new Random().nextInt(1000) + 1;
		int guesses = 1;
		
		System.out.print("Raad een nummer tussen de 1 en de 1000: ");
		int guessNum = keyboard.nextInt();
		
		while (guessNum > randomNum) {
			guesses++;
			
			System.out.println("Je gok is te hoog\n");
			System.out.print("Raad een nummer tussen de 1 en de 1000: ");
			guessNum = keyboard.nextInt();
			
			if (guessNum == randomNum) {
				break;
			}
		}
		
		
		while (guessNum < randomNum) {
			guesses++;
			
			System.out.println("Je gok is te laag\n");
			System.out.print("Raad een nummer tussen de 1 en de 1000: ");
			guessNum = keyboard.nextInt();
			
			if (guessNum == randomNum) {
				break;
			}
		}
		System.out.println("\nGefeliciteerd");
		System.out.println("Je hebt " + guesses + " keer geprobeerd.");
	}
}
