import java.util.Random;
import java.util.Scanner;

public class Opdracht1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int getal = new Random().nextInt(6) + 1;
		int getalInInt = 0;
		while (getalInInt != getal) {
			System.out.print("Geef een getal onder de zes in woorden: ");
			String getalWoord = keyboard.nextLine();
		
			switch (getalWoord) {
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
			default: 
				System.out.print("Dit getal is niet valide!");
				break;
			}
			
		
			if (getalInInt == getal) { 
				System.out.print("Gefeliciteerd, u heeft gewonnen!");
			}
			else {
				System.out.println("U bent een loezer, u hebt verliest.");
			}
			
		}
		
	}

}
