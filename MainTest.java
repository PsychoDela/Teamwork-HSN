import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

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

}
