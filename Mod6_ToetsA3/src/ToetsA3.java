import java.util.Scanner;
public class ToetsA3
{

	public static void main(String[] args)
	{
		// Sven Punselie SD1A
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Toets van Sven \n");
		System.out.print("Snelheid (km/h): ");
		double snelheid = keyboard.nextDouble();
		
		System.out.print("Reactietijd (sec): ");
		double reactietijd = keyboard.nextDouble();
		
		double remweg = reactietijd * snelheid / 3.6;
		System.out.println("Remweg is " + remweg + " Meter");
		keyboard.close();

	}

}
