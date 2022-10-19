import java.util.Scanner;

public class Opdracht2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Geef een woord: ");
		String word = keyboard.nextLine();
		
		int charCheck = word.length();
		
		System.out.println("Dit woord bevat " + charCheck + " karakters");
		
	}
}
