import java.util.Scanner;

public class Oefening2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Voer en getal in: ");
		int getal = keyboard.nextInt();

		if (getal < 0)
		{
			System.out.print("Het getal is negatief");
		} else
		{
			System.out.println("Het getal is posetief");
		}
		keyboard.close();
	}
}
