package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int num = scanner.nextInt();
		if(num%2==0) System.out.println(num*3);
		else System.out.println(num*2);
	}

}
