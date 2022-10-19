package uitleg4;
import java.util.Scanner;


public class uitleg4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een woord: ");
		String inputstring = keyboard.next();
		
		//actie
		String outputstring = inputstring.substring(0, 2) + "#"
				+ inputstring.substring(3);
		
		//output
		System.out.println("Output: " + outputstring);
		
		keyboard.close();
	}

}
