package dispatcher;

import java.util.concurrent.ThreadLocalRandom;

import empleados.Empleado;

public class Dispatcher extends Thread{
	
	public void callDispatch(Empleado empleado) {
		if (empleado.isEstaDisponible()) {
			atender(empleado);
			run();
		}
		else
			System.out.println("El empleado no está disponible");
			
		
	}
	public void atender (Empleado empleado) {
		empleado.setEstaDisponible(false);
	}
	public void cortar(Empleado empleado) {
		empleado.setEstaDisponible(true);
	}
	
	public int generarSegundos() {
		return ThreadLocalRandom.current().nextInt(1, 10);
	}

	public void run() {
		int segundos = generarSegundos();
        while(System.currentTimeMillis()<segundos) {
            System.out.println("Llamada " + segundos);
        }
	}
	
}