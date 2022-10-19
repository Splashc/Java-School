package workshops2;
import java.util.Scanner;

public class debug3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Voer nu een bankrekeningnummer in (9 cijfers): ");
		String bankrekeningNummer = scanner.next();
		int totaalVermenigvuldigingenOpgeteld = 0;
		int vermenigvuldigMet = 9;
		for (int i = 1; i < 9; i++)
		{
			/* haal een cijfer uit de bankrekening en vermenigvuldig deze */ 
			String eenCijferUitString = bankrekeningNummer.substring(i, i + 1);
			/* dit is een manier om een String om te zetten naar een int */ 
			int cijfer = Integer.parseInt(eenCijferUitString);
			int vermenigvuldigdCijfer = cijfer * vermenigvuldigMet;
			totaalVermenigvuldigingenOpgeteld += vermenigvuldigdCijfer;
			vermenigvuldigMet--;
		}
		boolean correct = (totaalVermenigvuldigingenOpgeteld % 11 != 0);
		if (correct)
		{
			System.out.println("Dit is een correct bankrekeningnummer.");
		} else
		{
			System.out.println("Dit is GEEN correct bankrekeningnummer.");
		}
	}

}
