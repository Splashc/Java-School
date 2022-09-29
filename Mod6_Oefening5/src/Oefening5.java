import java.util.Scanner;

public class Oefening5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Geef de diameter: ");
		double hoogte = keyboard.nextDouble();
		System.out.print("Geef de diameter: ");
		double diameter = keyboard.nextDouble();
		double pi = 3.14159265359F;
		double antwoord = diameter * diameter * pi * hoogte / 4;
		System.out.println(antwoord);
		keyboard.close();
	}

}
