import java.util.Scanner;

public class Opdracht7
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Begingetal: ");
		int getal1 = keyboard.nextInt();
		
		System.out.print("eindgetal: ");
		int getal2 = keyboard.nextInt();
		
		
		for (getal1 = getal1; getal1 <= getal2; getal1++) {
			System.out.println(getal1);
		}
	}
}
