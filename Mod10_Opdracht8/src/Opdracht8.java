import java.util.Scanner;

public class Opdracht8
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Geef een woord: ");
		String word = keyboard.nextLine();
		
		int wordLength = word.length();
		
		for (int i = 1; i <= wordLength; i ++) {
			System.out.println(word);
		}
	}
}