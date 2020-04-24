import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest 
{
	static String string1 = "lowercase";
	static String string2 = "UPPERCASE";
	static String string3 = "/a/a-a*a/a-a*a-a";
	
	@Test
	public void numOfLowercaseCharsTest() 
	{
		assertEquals("'lowercase' should have 9 lowercase letters", 9, Main.numOfLowercaseChars(string1));
		assertEquals("'UPPERCASE' should have 0 lowercase letters", 0, Main.numOfLowercaseChars(string2));
	}
	
	@Test
	public void shouldReturnNullWhenIsEmpty()
	{
		assertEquals("when empty should return null", 0, Main.numOfLowercaseChars(""));
	}
	
	@Test
	public void charsWhichNotLettersTest()
	{
		assertEquals("'/a/a-a*a/a-a*a-a' should return '//-*/-*-'", "//-*/-*-", Main.charsWhichNotLetters(string3));
	}
}
