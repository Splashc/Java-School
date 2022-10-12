import java.util.Scanner;

public class Oefening3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef De Grade: ");
		String cijfer = keyboard.nextLine();
		
		switch (cijfer) 
		{
		case "E":
			System.out.println("\nExcellent");
			break;
		case "V":
			System.out.println("\nVery Good");
			break;
		case "G":
			System.out.println("\nGood");
			break;
		case "A":
			System.out.println("\nAverage");
			break;
		case "F":
			System.out.println("\nFail");
			break;
		}
		keyboard.close(); 	
	}

}
