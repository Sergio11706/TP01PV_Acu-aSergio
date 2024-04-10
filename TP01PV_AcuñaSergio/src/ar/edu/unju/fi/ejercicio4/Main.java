package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor entre 0 y 10: ");
		int n = scanner.nextInt();
		if(n>-1 && n<11) {
			int i=1;
			while(n>1) {
				i*=n;
				n--;
			}
			System.out.println("El factorial es: "+i);
		}
		else System.out.println("El valor ingresado esta fuera de rango");
	}

}
