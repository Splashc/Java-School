import java.util.Scanner;

public class Opdracht3
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Geef je geboortemaand: ");
		int maand = keyboard.nextInt();
		
		while (maand > 12) {
			System.out.println("Is dit wel je geboorte maand?\n");
			System.out.print("Geef een valide geboortemaandtal: ");
			maand = keyboard.nextInt();
		}
		
		System.out.println("Je geboortemaand is " + maand);
	}
	
}
