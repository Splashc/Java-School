public class Opdracht9
{
	public static void main(String[] args)
	{
		String sentence = "The quick brown fox jumps over the lazy dog";
		
		System.out.println("Voor verandering: " + sentence);
		String sentenceChanged = sentence.replace("o", "#");
		
		System.out.println("Na verandering: " + sentenceChanged);
	}
}
