import java.util.Scanner;

public class Oefening7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Geef de Lengthe: ");
		double lengte = keyboard.nextDouble();
		System.out.print("Geef de Breedte: ");
		double breedte = keyboard.nextDouble();		
		System.out.print("Geef de Hoogte: ");
		double hoogte = keyboard.nextDouble();	
		double inhoud = lengte * breedte * hoogte;
		System.out.println("De inhoud is " + inhoud + " m3");
		keyboard.close();
	}

}
