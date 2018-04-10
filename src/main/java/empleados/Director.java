package empleados;

public class Director implements Empleado {
	private Empleado siguiente;
	private String nombre;
	private boolean disponible;
	
	
	public Director() {}
	public Director(String nombre, boolean disponible) {
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
	
	@Override
	public void atender(boolean disponible) {
		// TODO Auto-generated method stub
		if(disponible) {
			System.out.println("Atiende director " + this.getNombre());
		}
		else {
			siguiente.atender(disponible);
		}
		
	}


	public Empleado getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Empleado empleado) {
		siguiente = empleado;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

}
