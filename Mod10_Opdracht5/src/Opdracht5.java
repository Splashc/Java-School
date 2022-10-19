import java.util.Scanner;

public class Opdracht5
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String exampleString = "The quick brown fox jumps over the lazy dog";
		System.out.println(exampleString);
		
		int position = 0;
		
			do {
			System.out.print("\nVan welke positie in de zin wilt u het getal weten? (getal van 1 t/m 43): ");
			position = (keyboard.nextInt());
			if (position <= 43 && position > 0) {
				char charAmount = exampleString.charAt(position -1);

				System.out.println("Op positie " + position + " staat een: " + charAmount);
				break;
			}
			
			System.out.println("Deze positie bestaat niet");
			}
			while (position > 43);
	}
}