import java.util.Scanner;

public class Opdracht6
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int zes = 0;
		
		for(int y = 6; y >= 0; y--) {
			for (int x = 6-y; x >=0; x--) {
				zes = (zes+6);
				System.out.print((zes) + " ");
			}
			System.out.print("\n");
			zes = 0;
		}
	}
}