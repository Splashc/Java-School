
public class Oefening10
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int min = 3456789;
		int aantalMinJaar = 60 * 24 * 356;
		int jaar = min / aantalMinJaar;
		
		int aantalMinOver = min % aantalMinJaar; 
		int aantalMinDag = 60 * 24;
		int dagen = aantalMinOver / aantalMinDag;
		System.out.println(jaar);
		System.out.println(dagen);
	}

}
