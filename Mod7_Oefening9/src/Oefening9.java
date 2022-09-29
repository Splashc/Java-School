import java.util.Scanner;

public class Oefening9
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef het eerste getal: ");
		int eerste = keyboard.nextInt();
		System.out.println("Geef het tweede getal: ");
		int tweede = keyboard.nextInt();
		System.out.println("Geef het tweede getal: ");
		int deerde = keyboard.nextInt();
		
		if (eerste <= tweede || eerste <= deerde) 
		{
			System.out.println("Getal 1 is het Kleinste getal " + eerste + " ");
		}
		else if (tweede <= deerde)
		{
			System.out.println("Getal 2 is Kleinste getal " + tweede + " ");
		}
		else {
			System.out.println("Getal 3 is het Kleinste getal " + deerde);
		}
		keyboard.close();
	}
}

