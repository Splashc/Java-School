import java.util.Scanner;

public class Oefening2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Voer heel getal 1 in: ");
		int getal = keyboard.nextInt();
		System.out.print("Voer heel getal 2 in: ");
		int getal2 = keyboard.nextInt();
		int totaal = getal + getal2;
		System.out.println("Het totaal is " + totaal);
		keyboard.close();
	}	
}

