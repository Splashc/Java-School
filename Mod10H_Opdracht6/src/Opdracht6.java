import java.util.Scanner;
import java.util.Random;

public class Opdracht6
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int number1 = new Random().nextInt(9) + 1;
		int number2 = new Random().nextInt(9) + 1;
		int solution = (number1 + number2);
		int answer = 0;
		
		String[] methods = {"x", "+"};
		int method = new Random().nextInt(2);
		
		System.out.println("De rekenquiz start..");
		
		do { 
		System.out.print("Wat is de uitkomst van " + number1 + methods[method] + number2 + "? ");
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
