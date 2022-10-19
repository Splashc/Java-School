import java.util.Scanner;
import java.util.Random;

public class Opdracht12
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int getal = new Random().nextInt(10) + 1;
		int attempts = 3;
		
		System.out.println("Raadspel!");
		System.out.println("raad het random getal (1 t/m 10)");
		System.out.println("Je hebt 3 pogingen");
		int guess = keyboard.nextInt();
		
		while (guess != getal) {
			attempts--;
			System.out.println("dat was fout, probeer het opnieuw");
			System.out.println("Je hebt nog " + attempts + " pogingen");
			
			if (attempts == 0) {
				System.out.println("Je hebt verloren");
				break;
			}
			guess = keyboard.nextInt();
		}
		if (guess == getal) {
			System.out.println("Je hebt gewonnen, gefeliciteerd!");
		}
		
	}
}