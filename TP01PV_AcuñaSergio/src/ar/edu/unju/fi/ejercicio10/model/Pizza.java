package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private int precio;
	private double area;
	private boolean ingred_esp;
	private int ingred_esp20 = 500;
	private int ingred_esp30 = 750;
	private int ingred_esp40 = 1000;
	private static int cont=1;
	
	
	
	public Pizza() {
		super();
	}
	
	
	
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
	public boolean isIngred_esp() {
		return ingred_esp;
	}
	public void setIngred_esp(boolean ingred_esp) {
		this.ingred_esp = ingred_esp;
	}
	
	
	
	public int CalcularPrecio() {
		switch (diametro) {
		case 20: {
			precio = 4500;
			if(ingred_esp) precio = 4500+ingred_esp20;
			break;
		}
		case 30: {
			precio = 4800;
			if(ingred_esp) precio += ingred_esp30;
			break;
		}
		case 40: {
			precio = 5500;
			if(ingred_esp) precio += ingred_esp40;
			break;
		}
		}
		return precio;
	}
	
	public double CalcularArea() {
		return area = Math.PI * Math.pow((double)diametro/2,2);
	}
	
	public void MostrarDatos() {
		System.out.println("\n** PIZZA "+cont+" **");
		cont++;
		System.out.println("Diametro = "+diametro);
		System.out.println("Ingredientes especiales = "+ingred_esp);
		System.out.println("Precio Pizza = $"+CalcularPrecio());
		System.out.println("Area de la piza = "+CalcularArea());	
	}
	
}
