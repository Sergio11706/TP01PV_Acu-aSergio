package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fec_nac;
	private String provincia;
	
	
	
	public Persona() {
		System.out.println("Se genero una nueva clase persona");
	}
	
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFec_nac() {
		return fec_nac;
	}

	public void setFec_nac(LocalDate fec_nac) {
		this.fec_nac = fec_nac;
	}


	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	
	public Persona(String dni, String nombre, LocalDate fec_nac, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fec_nac = fec_nac;
		this.provincia = provincia;
	}


	
	public Persona(String dni, String nombre, LocalDate fec_nac) {
		this.dni = dni;
		this.nombre = nombre;
		this.fec_nac = fec_nac;
		provincia = "Jujuy";
	}
	
	
	
	public int CalcularEdad() {
		LocalDate fec_now = LocalDate.now();
		Period edad = Period.between(fec_nac, fec_now);
		return edad.getYears();
	}
	
	public boolean MayorDeEdad() {
		int edad = CalcularEdad();
		if(edad > 18) return true;
		return false;
	}
	
	public void MostrarDatos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("DNI: "+dni);
		System.out.println("Fecha de Nacimiento: "+fec_nac);
		System.out.println("Provincia: "+provincia);
		if(MayorDeEdad()) System.out.println("La persona es mayor de edad");
		else System.out.println("La persona no es mayor de edad");
	}
}
