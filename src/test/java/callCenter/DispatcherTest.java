package callCenter;

import org.junit.Test;

public class DispatcherTest {
	
	@Test
	public void testDiezLlamadas() {
		Thread llamada1= new Thread("Llamada1");
		Thread llamada2= new Thread("Llamada2");
		Thread llamada3= new Thread("Llamada3");
		llamada1.start();
		llamada2.start();
		llamada3.start();
	}

}
