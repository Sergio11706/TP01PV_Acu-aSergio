package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private String legajo;
	private float salario;
	private int salario_min = 210000, aumento = 20000;
	
	public Empleado(String nombre, String legajo, float salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario;
		if(salario<salario_min) this.salario = salario_min;
	}
	
	
	public float AumentarSalaio() {
		salario += aumento;
		System.out.println("\nSe acredito el aumento de salario\n");
		return salario;
	}
	
	public void MostarDatos() {
		System.out.println("\n*DATOS DEL EMPLEADO*");
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("Legajo del empleado: "+legajo);
		System.out.println("Salario del empleado: $"+salario);
	}
	
}
