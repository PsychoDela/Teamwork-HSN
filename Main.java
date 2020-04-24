public class Main 
{
	public static void main(String[] args)
	{
		
	}
	
	public static int stringLength(String string)
	{
		if (string.length() == 0) {
			return 0;
		} else
			return string.length();
	}
	
	public static String charsOnEvenNums(String string)
	{
		return null;
	}
	
	public static int charsOnOddNums(String string)
	{
		int charCount = 0;
		for(int i = 0; i <string.length(); i++)
		{
			if (i % 2 != 0)
			charCount++;
		}
		return charCount;
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
