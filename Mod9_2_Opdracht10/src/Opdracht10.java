import java.util.Scanner;

public class Opdracht10
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String choice = "0";

		while (!choice.contentEquals("n")) {
			System.out.print("\nGeef het aantal mijlen: ");
			double miles = keyboard.nextInt();
			double milesToKM = (miles * 1.609344);
			
			System.out.println("Dit is " + milesToKM + " km");
			System.out.print("Wilt u nog een convertie? (j/n): ");
			choice = keyboard.next();
		}
		System.out.println("\nBedankt.");
	}
}