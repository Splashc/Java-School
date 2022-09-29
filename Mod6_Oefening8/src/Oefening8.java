import java.util.Scanner;

public class Oefening8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hvl graden is het? ");
		double graden = keyboard.nextDouble();
		double fahr = 32;
		double totaal = graden * 1.8 + fahr;
		System.out.println(graden + " graden celsius is gelijk aan " + totaal);
		keyboard.close();
	}

}
