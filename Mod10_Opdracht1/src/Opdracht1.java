import java.util.Scanner;

public class Opdracht1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Geef een woord: ");
		String word = keyboard.nextLine();
		
		String newWord = word.toUpperCase();
		
		System.out.println(newWord);
	}
}
