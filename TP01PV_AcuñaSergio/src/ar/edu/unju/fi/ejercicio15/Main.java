package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = -1;
		while(n<5 || n>10) {
			System.out.print("Ingrese un valor entre 5 y 10: ");
			n = scanner.nextInt();
		}
		
		String[] array = new String[n];
		scanner.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.println("Ingresar nombre para el registro: ");
			array[i] = scanner.nextLine();
		}
		
		System.out.println("**REGRISTRO DE PERSONAS**");
		for(int i=0;i<n;i++) {
			System.out.println("Persona "+i+": "+array[i]);
		}
		
		System.out.println("\n**REGRISTRO DE PERSONAS (ORDEN INVERSO)**");
		for(int i=n-1;i>-1;i--) {
			System.out.println("Persona "+i+": "+array[i]);
		}
		
		scanner.close();
	}

}
