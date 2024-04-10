package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor entre 1 y 9: ");
		int n = scanner.nextInt();
		if(n>0 && n<10) {
			System.out.println("TABLA DE MULTIPLICAR DEL "+n);
			for(int i=0;i<11;i++) {
				System.out.println(n+" x "+i+" = "+i*n);
			}
		}
		else System.out.println("El valor ingresado esta fuera de rango");
		scanner.close();
	}

}
