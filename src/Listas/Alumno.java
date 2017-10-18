package Listas;

public class Alumno implements Comparable {
	private String numeroControl;
	private String nombre;
	private String direccion;
	
	public String getNumeroControl() {
		return numeroControl;
	}
	public void setNumeroControl(String numeroControl) {
		this.numeroControl = numeroControl;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
				
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Número de control:"+this.numeroControl+" Nombre del alumno:"+this.nombre+" Dirección del alumno:"+this.direccion;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Alumno alumno=(Alumno) o;
		return this.getNumeroControl().compareTo(alumno.getNumeroControl());
		
	}
	
}
