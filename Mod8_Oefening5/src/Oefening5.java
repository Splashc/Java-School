import java.util.Scanner;

public class Oefening5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef de Nummer van de maand: ");
		String maand = keyboard.nextLine();
		
		switch (maand) 
		{
		case "1":
			System.out.println("\nDeze is jan");
			break;
		case "2":
			System.out.println("\nDeze is feb");
			break;
		case "3":
			System.out.println("\nDeze is Maart");
			break;
		case "4":
			System.out.println("\nDeze Is april");
			break;
		case "5":
			System.out.println("\nDeze is mei");
			break;
		case "6":
			System.out.println("\nDeze Is juni");
			break;
		case "7":
			System.out.println("\nDeze is juli");
			break;
		case "8":
			System.out.println("\nDeze is aug");
			break;
		case "9":
			System.out.println("\nDeze Maand sep");
			break;
		case "10":
			System.out.println("\nDeze Maand okt");
			break;
		case "11":
			System.out.println("\nDeze Maand nov");
			break;
		case "12":
			System.out.println("\nDeze Maand dec");
			break;
		  default:
			  System.out.println("Dit is geen maand");
		}
		keyboard.close();
	}

}
