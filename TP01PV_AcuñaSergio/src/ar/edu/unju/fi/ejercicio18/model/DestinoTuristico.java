package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico implements Comparable<DestinoTuristico>{
	private int codigo;
	private String nombre;
	private float precio;
	private Pais pais;
	private int dias;
	
	
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
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	
	public void MostrarDatos() {
		System.out.println("\nCodigo: "+codigo);
		System.out.println("Nombre: "+nombre);
		System.out.println("Precio: "+precio);
		System.out.println("Cantidad de dias: "+dias);
		System.out.println("Codigo del Pais: "+pais.getCodigo());
		System.out.println("Nombre del Pais: "+pais.getNombre());
	}
	
	@Override
	public int compareTo(DestinoTuristico otroDestino) {
		 return this.nombre.compareTo(otroDestino.getNombre());
	}
}
