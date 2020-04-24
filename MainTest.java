import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import zadaca.Tekst;

class MainTest {

	@Test
	public void charactersOnEvenPositionsWhenStringExists() {
		Main main = new Main();
		String result = main.charsOnEvenNums("Zelena kuca");
		assertEquals("Zln ua", result);
	}
}
