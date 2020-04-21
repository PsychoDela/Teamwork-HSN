import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest 
{
	static String string1 = "lowercase";
	static String string2 = "UPPERCASE";
	
	String prazanString;
	String maliString;
	String velikiString;

	Main main;

	@BeforeEach
	public void NapraviObjekt() {
		main = new Main();
		prazanString = "";
		maliString = "abc";
		velikiString = "abc abc";
	}

	@AfterEach
	public void IzbrisiObjekt() {
		main = null;
	}

	@Test
	public void shouldReturn0WhenStringIsEmpty() {
		int rez = main.stringLength(prazanString);
		assertEquals(0, rez);
	}

	@Test
	public void shouldReturn3WhenThereIsOneWord() {
		int rez = main.stringLength(maliString);
		assertEquals(3, rez);
	}

	@Test
	public void shouldReturn7WhenThereIsMoreThanOneWord() {
		int rez = main.stringLength(velikiString);
		assertEquals(7, rez);
	}
	
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
}