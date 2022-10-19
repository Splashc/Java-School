import java.util.Scanner;
import java.util.Random;

public class Opdracht5
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number2 = new Random().nextInt(9) + 1;
		int solution = (number2 * 3);
		int answer = 0;
		
		System.out.println("De rekenquiz start..");
		
		do { 
		System.out.print("Wat is de uitkomst van 3x" + number2 + "? ");
		answer = keyboard.nextInt();
		
		if (answer == solution) {
			System.out.println("Goed");
			System.out.println("Einde quiz.");
			break;
		}
		System.out.println("Fout");
		}
		while (answer != solution);
	}
}
