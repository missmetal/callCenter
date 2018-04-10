package empleados;

public interface Empleado {
	
	public boolean isEstaDisponible();
	public void setEstaDisponible(boolean estaDisponible);
	public Empleado getSiguiente();
	public void setSiguiente(Empleado empleado);
	public String getNombre();
	public void setNombre(String nombre);
	public void atender(boolean disponible);
	

}
