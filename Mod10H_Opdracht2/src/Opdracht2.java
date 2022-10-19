import java.util.Scanner;

public class Opdracht2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Geef de lengte A: ");
		double sideA = keyboard.nextDouble();
		
		System.out.print("Geef de lengte B: ");
		double sideB = keyboard.nextDouble();
		
		double sideC = Math.sqrt((sideA * sideA) + (sideB * sideB));
		System.out.println(String.format("\nBerekende lengte C: %.1f", sideC));
	}	
}
