import java.util.Scanner;
public class Oefening1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welke dag is het: ");
		int dag = keyboard.nextInt();
		
		switch (dag) 
		{
		case 1:
			System.out.println("\nHet is Maandag");
			break;
		case 2:
			System.out.println("\nHet is Dinsdag");
			break;
		case 3:
			System.out.println("\nHet is Woensdag");
			break;
		case 4:
			System.out.println("\nHet is Donderdag");
			break;
		case 5:
			System.out.println("\nHet is Vrijdag");
			break;
		case 6:
			System.out.println("\nHet is Zaterdag");
			break;
		case 7:
			System.out.println("\nHet is Zondag");
			break;
			
		}
		keyboard.close(); 	
		System.out.print("\nDombo die dag bestaat niet he");
	}
}
