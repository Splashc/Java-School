import java.util.Random;
import java.util.Scanner;

public class Oefening7
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Geef een getal in woorden: ");
		String getalInWoorden = keyboard.nextLine();
		int randomGetal = new Random().nextInt(6) +1;
		
		int getalInInt = 0;
		switch (getalInWoorden) {
		case "een":
			getalInInt = 1;
			break;
		case "twee":
			getalInInt = 2;
			break;
		case "drie":
			getalInInt = 3;
			break;
		case "vier":
			getalInInt = 4;
			break;
		case "vijf":
			getalInInt = 5;
			break;
		case "zes":
			getalInInt = 6;
			break;
		}
		if (getalInInt == randomGetal)
		{
			System.out.print("Gefeliciteerd je hebt het goed geraden");
		} 
		else 
		{
		String juisteGetalInWoorden = "";
		switch (randomGetal)
		{
		case 1:
			juisteGetalInWoorden = "een";
			break;
		case 2:
			juisteGetalInWoorden = "twee";
			break;
		case 3:
			juisteGetalInWoorden = "drie";
			break;
		case 4:
			juisteGetalInWoorden = "vier";
			break;
		case 5:
			juisteGetalInWoorden = "vijf";
			break;
		case 6:
			juisteGetalInWoorden = "zes";
			break;
		}
		System.out.println("Helaas het was verkeerd, het juiste getal was " + juisteGetalInWoorden );
		
		keyboard.close();
		}
	}
}
