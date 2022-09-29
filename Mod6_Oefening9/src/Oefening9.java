import java.util.Scanner;

public class Oefening9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef het aantal minuten ");
		int min = keyboard.nextInt();
		int aantalMinJaar = 60 * 24 * 356;
		int jaar = min / aantalMinJaar;
		int aantalMinOver = min % aantalMinJaar; 
		int aantalMinDag = 60 * 24;
		int dagen = aantalMinOver / aantalMinDag;
		System.out.println(min + " Minuten is ongeveer " + jaar + " En " + dagen);
		keyboard.close();
	}

}
