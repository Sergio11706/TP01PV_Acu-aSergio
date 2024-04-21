package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
	private int codigo;
	private String nombre;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Pais(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	
	public void MostrarDatos() {
		System.out.println("\nCodigo del pais: "+codigo);
		System.out.println("Nombre del pais: "+nombre);
	}
	
}
