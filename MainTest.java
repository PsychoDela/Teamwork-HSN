import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
	static String string1 = "lowercase";
	static String string2 = "UPPERCASE";
	
	@Test
	public void numOfUppercaseCharsTest() 
	{	
		assertEquals("'lowercase' should have 0 lowercase letters", 0, Main.numOfUppercaseChars(string1));
		assertEquals("'UPPERCASE' should have 9 lowercase letters", 9, Main.numOfUppercaseChars(string2));
	}
	
	@Test
	public void charsOnOddNums()
	{
		assertEquals("'lowercase' should have 4 characters on odd positions", 4, Main.charsOnOddNums(string1));
	}

}
