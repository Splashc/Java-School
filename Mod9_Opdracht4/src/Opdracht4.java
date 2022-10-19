
public class Opdracht4
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for (int i = 1; i <= 50; i++) {
			System.out.print(i +" ");
			sum += i;
			if (i == 50) {
				System.out.print("\nDe som van deze getallen is: " + sum);
			}
		}
	}
}

