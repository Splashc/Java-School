package workshops2;
import java.util.Scanner;
import java.util.Random;

public class debug2
{

	public static void main(String[] args)
	{
		int randomGetal = new Random().nextInt(4) + 1;
		do
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Voer een nummer in van 1 t/m 4: ");
			int ingevoerdGetal = keyboard.nextInt();
			if (ingevoerdGetal <= 0 || ingevoerdGetal >= 5)
			{
				System.out.println("getal ligt niet in het gewenste bereik!");
			} else
			{
				if (randomGetal == ingevoerdGetal)
				{
					System.out.println("Je hebt gewonnen!!");
					break;
				} else
				{
					System.out.println("Je hebt een fout getal gekozen, probeer opnieuw");
				}
			}
		} while (true);
	}

}
