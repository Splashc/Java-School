import java.util.Scanner;

public class Opdracht8
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int vak = 0;
		
		do {
		System.out.println("Wat is het leukste vak in deze opleiding?");
		System.out.println("1: PHP");
		System.out.println("2: Java/OOP");
		System.out.println("3: Webdevelopement");
		System.out.println("4: Engels");
		vak = keyboard.nextInt();
		if (vak == 2) {
			break;
		}
		System.out.println("Fout, probeer het opnieuw!\n");
		}
		
		while (vak != 2);
		
		System.out.println("\nGoedzo, Java/OOP is het leukste vak van de opleiding!");
		
	}
}
