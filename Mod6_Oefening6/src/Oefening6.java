import java.util.Scanner;

public class Oefening6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hoeveel heb je contant: ");
		double contant = keyboard.nextDouble();
		System.out.print("Hoeveel kost het: ");
		double bedrag = keyboard.nextDouble();
		double wisselgeld = contant - bedrag;
		System.out.println("Wisselgeld van" + contant + " Euro:" + wisselgeld);
		keyboard.close();
	}

}
