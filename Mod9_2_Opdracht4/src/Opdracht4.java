import java.util.Scanner;

public class Opdracht4
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
		
		switch(maand) {
		case 1:
			System.out.println("Uw geboortemaand is Januari");
			break;
		case 2:
			System.out.println("Uw geboortemaand is Februari");
			break;
		case 3:
			System.out.println("Uw geboortemaand is Maart");
			break;
		case 4:
			System.out.println("Uw geboortemaand is April");
			break;
		case 5:
			System.out.println("Uw geboortemaand is Mei");
			break;
		case 6:
			System.out.println("Uw geboortemaand is Juni");
			break;
		case 7:
			System.out.println("Uw geboortemaand is Juli");
			break;
		case 8:
			System.out.println("Uw geboortemaand is Augustus");
			break;
		case 9:
			System.out.println("Uw geboortemaand is September");
			break;
		case 10:
			System.out.println("Uw geboortemaand is Oktober");
			break;
		case 11:
			System.out.println("Uw geboortemaand is November");
			break;
		case 12:
			System.out.println("Uw geboortemaand is December");
			break;
		}
	}
	
}
