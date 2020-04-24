import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)
	{
		
	}
	
	public static int stringLength(String string)
	{
		return 0;
	}
	
	public static String charsOnEvenNums(String string)
	{
		String charactersOnEvenPositions = "";
		for(int i = 0; i < string.length(); i++) {
			if(i % 2 == 0) {
				charactersOnEvenPositions += string.charAt(i);
			}
		}
		return charactersOnEvenPositions;
	}
	
	public static ArrayList <String> charsOnOddNums(String string)
	{
		return null;
	}
	
	public static int numOfUppercaseChars(String string)
	{
		return 0;
	}
	
	public static int numOfLowercaseChars(String string)
	{
		return 0;
	}
	
	public static ArrayList <String> charsWhichNotLetters(String string)
	{
		return null;
	}
}
