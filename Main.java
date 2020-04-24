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
	
	public static ArrayList <String> charsOnEvenNums(String string)
	{
		return null;
	}
	
	public static String charsOnOddNums(String string)
	{
		String str = "";
		for(int i = 0; i <string.length(); i++)
		{
			if (i % 2 != 0)
			str+= string.charAt(i);
		}
		return str;
	}
	
	public static int numOfUppercaseChars(String string)
	{
		int charCount = 0;
		
		for (int i = 0; i < string.length(); i++)
		{
			if (Character.isUpperCase(string.charAt(i)))
			{
				charCount++;
			}
		}
		
		return charCount;
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
