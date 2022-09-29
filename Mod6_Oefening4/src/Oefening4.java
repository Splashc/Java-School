import java.util.Scanner;

public class Oefening4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Geef het bedrag: ");
		double bedrag = keyboard.nextDouble();
		System.out.println("Het bedrag is: " + bedrag);
		double btw = bedrag * 0.21 % 100;
		double eindbedrag = bedrag + btw;
		System.out.println(eindbedrag);
		keyboard.close();
		
	}

}
