import java.util.Scanner;

public class Opdracht11
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Geef een woord: ");
		String word = keyboard.next();
		
		String wordPart1 = word.substring(0,2);
		String wordPart2 = word.substring(3);
		
		System.out.println(wordPart1 + "#" + wordPart2);
	}
}
