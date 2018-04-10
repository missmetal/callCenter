package dispatcher;

import java.util.ArrayList;

import empleados.CallCenter;
import empleados.Empleado;
import llamada.Llamada;

public class Dispatcher implements Runnable {

	private int segundos;
	private Llamada llamada;
	private ArrayList<Empleado> empleados = new ArrayList<>();
	CallCenter callCenter = new CallCenter();

	public Dispatcher(Llamada llamada, ArrayList<Empleado> empleados) {
		this.llamada = llamada;
		this.empleados = empleados;
		this.segundos = generarSegundos();
	}

	public Empleado dispatchCall(ArrayList<Empleado> empleados) {

		for (Empleado e : empleados) {
			if (e.isEstaDisponible()) {
				e.setEstaDisponible(false);
				return e;
			} else {
				continue;
			}

		}
		return null;

	}

	public int generarSegundos() {
		// return ThreadLocalRandom.current().nextInt(1, 10);
		return (int) (5 + (Math.random() * (10 - 5)));
	}

	public void run() {
		for (Empleado empleado : empleados) {
			empleado = dispatchCall(empleados);
			llamada.setEmpleado(empleado);
				llamada.getEmpleado().setEstaDisponible(false);
				System.out.println("El empleado " + Thread.currentThread().getName() + " " + empleado.getNombre()
						+ " comienza a procesar la llamada  " + this.llamada.getNombreLlamada() + " y tarda "
						+ this.segundos + " segundos.");

				try {
					Thread.sleep(getSegundos() * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Llamada " + llamada.getNombreLlamada() + " finalizada.");
				llamada.getEmpleado().setEstaDisponible(true);
			}
			try {
				Thread.sleep(getSegundos() * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public Llamada getLlamada() {
		return llamada;
	}

	public void setLlamada(Llamada llamada) {
		this.llamada = llamada;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

}