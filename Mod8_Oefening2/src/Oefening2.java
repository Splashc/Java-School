import java.util.Scanner;

public class Oefening2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef de Temperatuur: ");
		float temp = keyboard.nextFloat();
		
		if (temp < 0)
			System.out.print("\nFreezing Weather");
		if (temp >= 0 && temp < 10)
			System.out.println("\nVery Cold Weather");
		if (temp >= 10 && temp < 20)
			System.out.println("\nCold Weather");
		if (temp >= 20 && temp < 30)
			System.out.println("\nNormal in Temp");
		if (temp >= 30 && temp < 40)
			System.out.println("\nIts Hot");
		if (temp > 40)
			System.out.println("\nIts very hot");
		keyboard.close();
	}
}
