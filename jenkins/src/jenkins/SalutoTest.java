package jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SalutoTest {

	@Test
	public void saludarTest() {
		Saludo saludo = new Saludo();
		
		assertEquals("hola jenkins", saludo.saludar());
		
	}
	
}
