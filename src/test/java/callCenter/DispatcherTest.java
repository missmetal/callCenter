package callCenter;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dispatcher.Dispatcher;
import empleados.Director;
import empleados.Empleado;
import empleados.Operador;
import empleados.Supervisor;
import llamada.Llamada;


public class DispatcherTest {
	ArrayList<Empleado> empleados = new ArrayList<>();
	ArrayList<Llamada> llamadas = new ArrayList<>();
	
	@Before
	public void setUp() {
		

		empleados.add(new Operador("Luis", true));
		empleados.add(new Operador("Ines", true));
		empleados.add(new Operador("Omar", true));
		empleados.add(new Supervisor("Ana", true));
		empleados.add(new Director("Pablo", true));
		
		
		llamadas.add(new Llamada("llamada1"));
		llamadas.add(new Llamada("llamada2"));
		llamadas.add(new Llamada("llamada3"));
		llamadas.add(new Llamada("llamada4"));
		llamadas.add(new Llamada("llamada5"));
		llamadas.add(new Llamada("llamada6"));
		llamadas.add(new Llamada("llamada7"));
		llamadas.add(new Llamada("llamada8"));
		llamadas.add(new Llamada("llamada9"));
		llamadas.add(new Llamada("llamada10"));

	}
	
	@Test(timeout = 2000000)
	public void testDiezLlamadas() {

		ExecutorService executor = Executors.newFixedThreadPool(5);

		
		for (Llamada llamada : llamadas) {
			Runnable dispatcher = new Dispatcher(llamada,empleados);
			executor.execute(dispatcher);
		}

		executor.shutdown();
		while (!executor.isTerminated()) {

		}
		Assert.assertTrue(llamadas.size()==10);
	}


}
