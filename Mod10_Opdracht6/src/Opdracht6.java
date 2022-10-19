import java.util.Scanner;

public class Opdracht6
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String inhoud = "|test  |";
		System.out.println("Inhoud string: " + inhoud);
		
		String inhoudReplaced = inhoud.replace("  ", "");
		System.out.println("Inhoud string na bewerking: " + inhoudReplaced);
	}
}
