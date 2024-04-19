package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] array = new String[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Ingrese el nombre de una persona: ");
			array[i] = scanner.nextLine();
		}
		
		int cont = 0;
		while(cont<5) {
			System.out.println("Nombre de la posicion "+cont+": "+array[cont]);
			cont++;
		}
		System.out.println("Tamaño del arreglo: "+array.length+"\n");
		
		byte n;
		do {
			System.out.print("Ingrse el indice de un elemento a eliminar(entre 0 y 4): ");
			n = scanner.nextByte();
		}while(n<0 || n>4);
		
		array[n] = " ";
		if(n<4) {
			do {
				array[n] = array[n+1];
				n++;
			}while(n<4);
		}
		array[4] = " ";
		
		cont = 0;
		while(cont<5) {
			System.out.println("Nombre de la posicion "+cont+": "+array[cont]);
			cont++;
		}
	}

}
