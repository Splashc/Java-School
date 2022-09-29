import java.util.Scanner;

public class Oefening5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef het eerste getal: ");
		int eerste = keyboard.nextInt();
		System.out.println("Geef het tweede getal: ");
		int tweede = keyboard.nextInt();
		
		if (eerste >= tweede) 
		{
			System.out.println("Getal 1 is het Grooste getal " + eerste + " ");
		}
		else
		{
			System.out.println("Getal 2 is Grooste getal " + tweede + " ");
		}
		keyboard.close();
	}

}
