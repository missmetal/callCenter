package llamada;

import empleados.Empleado;

public class Llamada {
	private String nombreLlamada;
	Empleado empleado;
	
	public Llamada(String nombreLlamada) {
		this.nombreLlamada = nombreLlamada;
	}
	
	public String getNombreLlamada() {
		return nombreLlamada;
	}
	public void setNombreLlamada(String nombreLlamada) {
		this.nombreLlamada = nombreLlamada;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
}
