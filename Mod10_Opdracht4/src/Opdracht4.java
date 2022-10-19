import java.util.Scanner;

public class Opdracht4
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Karakter: ");
		String character = keyboard.next();
		
		String smallChar = character.toLowerCase();
		System.out.println("Kleine letter: " + smallChar);
	}
}
