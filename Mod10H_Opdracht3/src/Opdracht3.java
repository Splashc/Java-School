import java.util.Scanner;
import java.util.Random;

public class Opdracht3
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int randomNumber = new Random().nextInt(9) + 1;
		
		System.out.print("Geef de lengte of breedte: ");
		int sides = keyboard.nextInt();
		
		for (int y = 1; y <= sides; y++) {
			for (int x = sides; x >= 1; x--) {
				System.out.print(randomNumber + " ");
				randomNumber = new Random().nextInt(9) +1;
			}
			System.out.print("\n");
		}
	}
}
