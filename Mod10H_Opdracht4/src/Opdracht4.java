import java.util.Scanner;

public class Opdracht4
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Geef een zin op: ");
		String sentence = keyboard.nextLine();
		
		String[] sentenceCutUp = sentence.split(" ");
		int wordAmount = sentenceCutUp.length;
		
		System.out.println("Lossen woorden: ");
		for (int i = 0; i < wordAmount; i++) {
			System.out.println(sentenceCutUp[i]);
		}
		
	}
}
