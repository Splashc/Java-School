import java.util.Scanner;

public class Oefening3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Geef je geboorte jaar: ");
		int geboren = keyboard.nextInt();
		int leeftijd = 2022 - geboren;
		System.out.println("Je bent: " + leeftijd);
		keyboard.close();
	}

}
