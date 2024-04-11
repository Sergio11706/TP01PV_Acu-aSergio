package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio6.model.*;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		Scanner scanner = new Scanner(System.in);
			System.out.println("Ingrese DNI de Persona1: ");
			String dni = scanner.nextLine();
				persona1.setDni(dni);
			System.out.println("Ingrese Nombre de Persona1: ");
			String nombre = scanner.nextLine();
				persona1.setNombre(nombre);
			System.out.println("Ingrese Fecha de Nacimiento(yyyy-mm-dd) de Persona1: ");
			String fec_nacString = scanner.nextLine();
			LocalDate fec_nac = LocalDate.parse(fec_nacString);
				persona1.setFec_nac(fec_nac);
			System.out.println("Ingrese Provincia de Persona1: ");
			String provincia = scanner.nextLine();
				persona1.setProvincia(provincia);
		
			System.out.println("\nIngrese DNI de Persona2: ");
				dni = scanner.nextLine();
			System.out.println("Ingrese Nombre de Persona2: ");
				nombre = scanner.nextLine();
			System.out.println("Ingrese Fecha de Nacimiento(yyyy-mm-dd) de Persona2: ");
				fec_nacString = scanner.nextLine();
				fec_nac = LocalDate.parse(fec_nacString);
			System.out.println("Ingrese Provincia de Persona2: ");
				provincia = scanner.nextLine();
			Persona persona2 = new Persona(dni, nombre, fec_nac, provincia);
			
			System.out.println("\nIngrese DNI de Persona3: ");
				dni = scanner.nextLine();
			System.out.println("Ingrese Nombre de Persona3: ");
				nombre = scanner.nextLine();
			System.out.println("Ingrese Fecha de Nacimiento(yyyy-mm-dd) de Persona3: ");
				fec_nacString = scanner.nextLine();
				fec_nac = LocalDate.parse(fec_nacString);
			Persona persona3 = new Persona(dni, nombre, fec_nac);
			
			System.out.println("\n\n*DATOS PERSONA 1*");
			persona1.MostrarDatos();
			System.out.println("\n*DATOS PERSONA 2*");
			persona2.MostrarDatos();
			System.out.println("\n*DATOS PERSONA 3*");
			persona3.MostrarDatos();
			
			scanner.close();
	}

}
