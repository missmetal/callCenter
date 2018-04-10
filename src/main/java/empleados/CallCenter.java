package empleados;

public class CallCenter implements Empleado{
	
	private Empleado empleado;

	@Override
	public boolean isEstaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setEstaDisponible(boolean estaDisponible) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empleado getSiguiente() {
		return empleado;
	}

	@Override
	public void setSiguiente(Empleado empleado) {
		this.empleado = empleado;
		
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atender(boolean disponible) {
		Operador operador = new Operador();
		operador.setSiguiente(operador);
		
		Supervisor supervisor = new Supervisor();
		supervisor.setSiguiente(supervisor);
		
		Director director = new Director();
		director.setSiguiente(director);
		
		empleado.atender(disponible);
	}

}
