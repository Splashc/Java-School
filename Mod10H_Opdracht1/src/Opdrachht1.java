import java.util.Scanner;

public class Opdrachht1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Geef een woord: ");
		String word = keyboard.next();
			
		for (int i = word.length()-1; i >= 0; i--) 
		{
			System.out.print(word.charAt(i));
		}
	}
}
