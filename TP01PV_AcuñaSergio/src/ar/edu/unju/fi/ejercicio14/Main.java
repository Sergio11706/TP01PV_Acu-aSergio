package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = -1, suma=0;
		while(n<3 || n>10) {
			System.out.print("Ingrese un valor entre 3 y 10: ");
			n = scanner.nextInt();
		}
		
		int[] array = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Ingrese un valor para el arreglo: ");
			array[i] = scanner.nextInt();
			suma += array[i];
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("Elemento en la posicion "+i+": "+array[i]);
		}
		
		System.out.println("Suma: "+suma);
		
		scanner.close();
	}

}
