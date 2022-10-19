package workshops2;

public class debug1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String woordSamengesteld = "ditIsEenWoord";
		String woordInHoofdletters = woordSamengesteld.toUpperCase();
		String deelVanHetWoord = woordInHoofdletters.substring(1, 5);
		if (deelVanHetWoord.equals("ITIS"))
		{
			System.out.println("Dit klopt");
		} else
		{
			System.out.println("Dit klopt niet!!");
		}
	}

}
