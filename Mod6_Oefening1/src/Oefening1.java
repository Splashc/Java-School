import java.util.Scanner;

public class Oefening1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Voer heel getal in: ");
		int inputNumber = keyboard.nextInt();
		System.out.println("Het ingevoerde getal is: " + inputNumber);
		keyboard.close();
	}
}