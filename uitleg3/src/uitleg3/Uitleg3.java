package uitleg3;
import java.util.Scanner;

public class Uitleg3
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een woord; ");
		String woord = keyboard.next();
		keyboard.close();
		String nieuwewoord = woord.toUpperCase();
		
		
		System.out.println(nieuwewoord);
		
	}

}
