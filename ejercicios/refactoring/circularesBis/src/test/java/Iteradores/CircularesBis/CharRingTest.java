package Iteradores.CircularesBis;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CharRingTest {
	
	CharRing r1 , r2;
	@BeforeEach
	void setUp() throws Exception {
		r1 = new CharRing("EJEMPLO".toString());
		r2 = new CharRing("a".toString());
	}

@Test
	public void CharRingNextTest() {
		assertEquals('a',r2.next());
		assertEquals('a',r2.next());
	}
@Test
	public void CharRingNextTwoTest() {
		assertEquals('E',r1.next());
		assertEquals('J',r1.next());
		assertEquals('E',r1.next());
		assertEquals('M',r1.next());
		assertEquals('P',r1.next());
		assertEquals('L',r1.next());
		assertEquals('O',r1.next());
		assertEquals('E',r1.next());
	}
}