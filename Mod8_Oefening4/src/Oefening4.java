import java.util.Scanner;

public class Oefening4
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
			System.out.println("\nDeze Maand Heeft 31 Dagen");
			break;
		case "2":
			System.out.println("\nDeze Maand Heeft 28/29 Dagen");
			break;
		case "3":
			System.out.println("\nDeze Maand Heeft 31 Dagen");
			break;
		case "4":
			System.out.println("\nDeze Maand Heeft 30 Dagen");
			break;
		case "5":
			System.out.println("\nDeze Maand Heeft 31 Dagen");
			break;
		case "6":
			System.out.println("\nDeze Maand Heeft 30 Dagen");
			break;
		case "7":
			System.out.println("\nDeze Maand Heeft 31 Dagen");
			break;
		case "8":
			System.out.println("\nDeze Maand Heeft 30 Dagen");
			break;
		case "9":
			System.out.println("\nDeze Maand Heeft 31 Dagen");
			break;
		case "10":
			System.out.println("\nDeze Maand Heeft 30 Dagen");
			break;
		case "11":
			System.out.println("\nDeze Maand Heeft 31 Dagen");
			break;
		case "12":
			System.out.println("\nDeze Maand Heeft 30 Dagen");
			break;
		case "13":
			System.out.println("\nDeze Maand Heeft 31 Dagen");
			break;
		}
		keyboard.close();
	}

}
