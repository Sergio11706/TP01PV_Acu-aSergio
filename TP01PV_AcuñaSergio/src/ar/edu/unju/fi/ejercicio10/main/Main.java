package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Pizza[] pizza = new Pizza[3];
		Scanner scanner = new Scanner(System.in);
		int diametro;
		boolean ingred_esp;
		for(int i=0;i<3;i++) {
			pizza[i] = new Pizza();
			System.out.println("Tamaño de la Pizza?(20cm, 30cm o 40cm) ");
				diametro = scanner.nextInt();
				scanner.nextLine();
			System.out.println("Ingredientes especiales?(true/false) ");
				ingred_esp = scanner.nextBoolean();
			pizza[i].setDiametro(diametro);
			pizza[i].setIngred_esp(ingred_esp);
		}
		
		for(int i=0;i<3;i++) {
			pizza[i].MostrarDatos();
		}
		scanner.close();
	}
	
}
