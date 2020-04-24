import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		String test;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesite string: ");
		test = sc.nextLine();
		sc.close();
		
		System.out.println(stringLength(test));
		System.out.println(charsOnEvenNums(test));
		System.out.println(charsOnOddNums(test));
		System.out.println(numOfUppercaseChars(test));
		System.out.println(numOfLowercaseChars(test));
		System.out.println(charsWhichNotLetters(test));
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
		String charactersOnEvenPositions = "";
		for(int i = 0; i < string.length(); i++) {
			if(i % 2 == 0) {
				charactersOnEvenPositions += string.charAt(i);
			}
		}
		return charactersOnEvenPositions;
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
