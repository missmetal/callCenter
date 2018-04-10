package empleados;

public class Supervisor implements Empleado {
	private Empleado siguiente;
	private String nombre;
	private boolean disponible;
	
	public Supervisor(){}

	
	public Supervisor(String nombre, boolean disponible) {
		super();
		this.nombre = nombre;
		this.disponible = disponible;
	}

	public boolean isEstaDisponible() {
		return disponible;
	}

	public void setEstaDisponible(boolean estaDisponible) {
		this.disponible = estaDisponible;

	}

	public Empleado getSiguiente() {
		return siguiente;

	}

	public void setSiguiente(Empleado empleado) {
		// TODO Auto-generated method stub
		siguiente = empleado;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void atender(boolean disponible) {
		// TODO Auto-generated method stub
		if(disponible) {
			System.out.println("Atiende supervisor " + this.getNombre());
		}
		else {
			siguiente.atender(disponible);
		}
		
	}

}
