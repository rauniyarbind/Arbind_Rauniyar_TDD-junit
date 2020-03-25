package task.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

class remove2ATest {
/* 
 * 1. 1 A : ABCD => BCD --- success
 * 2. 2 A : AACD => CD --- success
 * 3. BACD=> BCD --- success
 * 4. BBAA => BBAA --- success
 * 5. AABAA => BAA ---  success
 */
	
	RemoveAChar removeAChar;
	@BeforeEach
	void setUp(){
		removeAChar = new RemoveAChar();
	}

	@Test
	void firstposA() {
		assertEquals("BCD",removeAChar.remove("ABCD"));
	}
	
	@Test
	void twoAstart() {
		assertEquals("CD",removeAChar.remove("AACD"));
	}
	
	@Test
	void noAstart() {
		assertEquals("BCD",removeAChar.remove("BCD"));
	}
	
	@Test
	void Aatendandstart() {
		assertEquals("BAA",removeAChar.remove("AABAA"));
	}
	
	@Test
	void Aatend() {
		assertEquals("BBAA",removeAChar.remove("BBAA"));
	}	
	   
}
