import java.util.Scanner;

public class Opdracht7
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Geef je naam: ");
		String naam = keyboard.nextLine();
		
		System.out.println(naam.charAt(0));
		System.out.println(naam.charAt(1));
		System.out.println(naam.charAt(2));
	}
}