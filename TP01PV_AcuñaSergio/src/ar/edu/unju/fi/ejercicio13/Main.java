package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[8];
		for(int i=0;i<8;i++) {
			System.out.println("Ingrese un valor para el arreglo: ");
			int n = scanner.nextInt();
			array[i] = n;
		}
		for(int i=0;i<8;i++) {
			System.out.println("Elemento en la posicion "+i+" : "+array[i]);
		}
		scanner.close();
	}

}
