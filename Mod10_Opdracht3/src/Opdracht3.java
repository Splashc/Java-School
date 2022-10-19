import java.util.Scanner;

public class Opdracht3
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Geef een woord: ");
		String word = keyboard.nextLine();
		
		String replaceWord = word.replace("h", "#");
		System.out.println(replaceWord);
		
		
	}
}
