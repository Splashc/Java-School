import java.util.Scanner;

public class Oefening8
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Geef en getal: ");
		int getal = keyboard.nextInt();

		int som = getal % 7;
		if (som == 0) {
			System.out.println("Dit getal is wel deelbaar door 7");
		}
		else {
			System.out.println("Dit getal is niet deelbaar door 7");
		}
		keyboard.close();
	}

}
