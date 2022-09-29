import java.util.Scanner;

public class Oefening4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Voer een jaar in: ");
		int jaar = keyboard.nextInt();
		int ant = jaar % 4;
		if (ant == 0) {
			System.out.print("ja");
		}
		else {
			System.out.println("Nee");
		}
		keyboard.close();
	}

}
