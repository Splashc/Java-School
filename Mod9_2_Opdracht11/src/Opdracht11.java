import java.util.Scanner;

public class Opdracht11
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Geef beginwaarde: ");
		int waarde1 = keyboard.nextInt();
		
		System.out.print("Eindwaarde: ");
		int waarde2 = keyboard.nextInt();
		
		
		if (waarde1 > waarde2) {
			for (int i = waarde1; i >= waarde2; i--) {
				System.out.println(i);
			}
		}
		
		if (waarde1 < waarde2) {
			for (int i = waarde1; i <= waarde2; i++) {
				System.out.println(i);
			}
		}
	}
}