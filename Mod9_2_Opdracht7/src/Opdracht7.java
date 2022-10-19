import java.util.Scanner;

public class Opdracht7
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Geef de breedte: ");
		int x = keyboard.nextInt();
		
		System.out.print("Geef de lengte: ");
		int y = keyboard.nextInt();
		
		for (int y2 = 1; y2 <= y; y2++) {
			for (int x2 = x; x2 > 0; x2--) {
				System.out.print("##  ##");
				System.out.print("\n  ");
			}
			System.out.print("\n");
			
		}
	}
}
