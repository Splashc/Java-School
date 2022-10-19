import java.util.Scanner;

public class Opdracht10
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Geef tekst 1 op: ");
		String word1 = keyboard.next();
		
		System.out.print("Geef tekst 2 op: ");
		String word2 = keyboard.next();
		
		int length1 = word1.length();
		int length2 = word2.length();
		
		char start1 = word1.charAt(0);
		char start2= word2.charAt(0);
		
		if (start1 == start2 && length1 == length2) 
		{
			System.out.println("De teksten hebben dezelfde lengte en de eerste letter is gelijk");
		}
		else if (start1 == start2 && length1 != length2) 
		{
			System.out.println("De teksten hebben niet dezelfde lengte en de eerste letter is gelijk");
		}
		else if (start1 != start2 && length1 == length2)
		{
			System.out.println("De teksten hebben dezelfde lengte en de eerste letter is niet gelijk");
		}
	}
}
