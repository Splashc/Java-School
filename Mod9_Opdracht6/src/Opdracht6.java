import java.util.Scanner;

public class Opdracht6
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String choice = "a";
		
		while (choice != "c") {
			
			System.out.print("Wat is het commando in Java om uit een loop te stappen?");
			System.out.print("\na. int");
			System.out.print("\nb. continue");
			System.out.print("\nc. break");
			System.out.print("\nd. exit");
			System.out.print("\ngeef jouw keuze: ");
			String keuze = keyboard.nextLine();	
			
			choice = keuze;
			if (choice == "c") {
				System.out.println("Correct!");
				break;
			}
			else {
			System.out.println("Incorrect!");
			System.out.print("Opnieuw? Druk op j en enter om door te gaan: ");
			String next = keyboard.nextLine();	
			}
		}
	}
}

