package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	
	private String nombre;
	private String codigo;
	private float precio;
	private float descuento;
	private static int cont=1;
	
	
	public Producto() {
		super();
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	

	public float CalcularDescuento() {
		float precio_des = precio-descuento;
		return precio_des;
	}
	
	public void MostrarDatos() {
		System.out.println("\n*DATOS DEL PRODUCTO "+cont+"*");
		cont++;
		System.out.println("Nombre del Producto: "+nombre);
		System.out.println("Codigo del Producto: "+codigo);
		System.out.println("Precio del Producto: $"+precio);
		System.out.println("Precion con descuento: $"+CalcularDescuento());
	}
}
