import java.util.Scanner;

public class Opdracht5
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String eigenNaam = "Fridtjof";
		String naam = "";
		
		
		while (!naam.contentEquals(eigenNaam)) {
			System.out.print("Je eigen naam is: ");
			naam = keyboard.nextLine();
			if (naam.contentEquals(eigenNaam)) {
				break;
			}
			System.out.println("Dit is niet jouw naam!\n");
		}
		
		System.out.println("\ndit is van jou");
	}
}