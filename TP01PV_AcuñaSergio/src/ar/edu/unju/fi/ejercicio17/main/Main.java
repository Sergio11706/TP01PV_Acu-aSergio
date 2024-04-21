package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Jugador> jugadores =new ArrayList<>();
		Menu menu = new Menu();
		Scanner scanner = new Scanner(System.in);
		int op = -1;
		
		do {
			op = menu.MostrarMenu();
			switch(op){
			
			case 1: {
				
				int id = menu.IngresarId();
				
				System.out.print("Ingrese nombre del jugador: ");
				String nombre = scanner.nextLine();
				
				System.out.print("Ingrese apelldio del jugador: ");
				String apellido = scanner.nextLine();
				
				System.out.print("Ingrese nacionalidad del jugador: ");
				String nacionalidad = scanner.nextLine();
				
				System.out.print("Ingrese estatura del jugador: ");
				float estatura = scanner.nextFloat();
				scanner.nextLine();
				
				System.out.print("Ingrese peso del jugador: ");
				byte peso = scanner.nextByte();
				scanner.nextLine();
				
				System.out.println("Ingrese fecha de nacimiento del jugador");
				System.out.print("Dia: ");
				int dia = scanner.nextInt();
				System.out.print("Mes: ");
				int mes = scanner.nextInt();
				System.out.print("Año: ");
				int anio = scanner.nextInt();
				scanner.nextLine();
				LocalDate fec_nac = LocalDate.of(anio, mes-1, dia);
				
				String posicion = menu.PosicionJugador();
				
				
				jugadores.add(new Jugador(id,nombre,apellido,fec_nac,nacionalidad,estatura,peso,posicion));
			
			
				System.out.println("\nSe añadio un jugador correctamente\n");
			}
			break;
			
			case 2: {
				
				System.out.print("\nIngresar id para mostrar los datos: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				
				for(Jugador i : jugadores) {
					if(i.getId() == id) {
						i.MostrarDatos();
						break;
					}
				}
				
			}
			break;
			
			case 3: {
				
				Collections.sort(jugadores);
				
				for(Jugador i : jugadores) {
					i.MostrarDatos();
				}
				
			}
			break;
			
			case 4: {
				
				System.out.print("\nIngresar id para modificar los datos: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				
				for(Jugador i : jugadores) {
					if(i.getId() == id) {
						
						System.out.print("Ingrese nombre del jugador: ");
						String nombre = scanner.nextLine();
						
						System.out.print("Ingrese apelldio del jugador: ");
						String apellido = scanner.nextLine();
						
						System.out.print("Ingrese nacionalidad del jugador: ");
						String nacionalidad = scanner.nextLine();
						
						System.out.print("Ingrese estatura del jugador: ");
						float estatura = scanner.nextFloat();
						scanner.nextLine();
						
						System.out.print("Ingrese peso del jugador: ");
						byte peso = scanner.nextByte();
						scanner.nextLine();
						
						System.out.println("Ingrese fecha de nacimiento del jugador");
						System.out.print("Dia: ");
						int dia = scanner.nextInt();
						System.out.print("Mes: ");
						int mes = scanner.nextInt();
						System.out.print("Año: ");
						int anio = scanner.nextInt();
						LocalDate fec_nac = LocalDate.of(anio, mes, dia);
						
						String posicion = menu.PosicionJugador();
						
						i.setNombre(nombre);
						i.setApellido(apellido);
						i.setEstatura(estatura);
						i.setFec_nac(fec_nac);
						i.setNacionalidad(nacionalidad);
						i.setPeso(peso);
						i.setPosicion(posicion);
						
						break;
					}
				}
				
			}
			break;
			
			case 5: {
				
				System.out.print("\nIngresar id para eliminar jugador: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				
				for(Jugador i : jugadores) {
					if(i.getId() == id) {
						menu.EliminarId(id);
						jugadores.remove(i);
						System.out.println("\nSe elimino el jugador de ID: "+id);
						break;
					}
				}
				
			}
			break;
			
			case 6: {
				System.out.println("\nCantidad de jugadores en la lista: "+jugadores.size());
			}
			break;
			
			case 7: {
				
				System.out.print("\nBuscar por nacionalidad: ");
			    String nacionalidad = scanner.nextLine();
				
			    for(Jugador i : jugadores) {
			    	if(i.getNacionalidad().equals(nacionalidad)) {
			    		i.MostrarDatos();
			    	}
			    }
			}
			break;
			
			case 8: {
				System.out.println("\n**FIN DEL PROGRAMA**\n");
			}
			break;
			
			default: System.out.println("OPCION NO DISPONIBLE");
			}
			
		}while(op!=8);
		
		scanner.close();
	}

}
