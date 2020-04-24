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
		return null;
	}
	
	public static String charsOnOddNums(String string)
	{
		return null;
	}
	
	public static int numOfUppercaseChars(String string)
	{
		return 0;
	}
	
	public static int numOfLowercaseChars(String string)
	{
		int charCount = 0;
		
		for (int i = 0; i < string.length(); i++)
		{
			if (Character.isLowerCase(string.charAt(i)))
			{
				charCount++;
			}
		}
		
		return charCount;
	}
	
	public static String charsWhichNotLetters(String string)
	{
		String chars = "";
		
		for (int i = 0; i < string.length(); i++)
		{
			if (Character.isAlphabetic(string.charAt(i)) == false)
			{
				chars += string.charAt(i);
			}
		}
		
		return chars;
	}
}
