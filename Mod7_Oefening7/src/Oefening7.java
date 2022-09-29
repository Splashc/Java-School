import java.util.Scanner;

public class Oefening7
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Geef het eerste getal: ");
		float a = keyboard.nextInt();
		System.out.print("Geef het tweede getal: ");
		float b = keyboard.nextInt();
		System.out.print("Geef het derde getal: ");
		float c = keyboard.nextInt();
		
		float antwoord = a + b + c;
		float gem = antwoord / 3;
		
		System.out.println("Som: " + antwoord);
		System.out.println("Gemiddle: " + gem);
		keyboard.close();
	}

}
