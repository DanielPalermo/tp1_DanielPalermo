package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 float diametro;
		 float precio;
		 boolean ingredientes_especiales=true;
		 String ing;
		 int cont=1;
		 
		 do {
			 Pizza pz = new Pizza();
			 
			 do {
				 System.out.println("Ingrese el diametro:");
				 diametro = sc.nextFloat();				 
			 }while(diametro != 20 && diametro != 30 && diametro != 40);
			 
			 cont++;
			 do {
 				 System.out.println("¿Desea agregarle ingredientes especiales? S/N");
				 ing = sc.next();
			 }while((!ing.equalsIgnoreCase("S")) && (!ing.equalsIgnoreCase("N")));
			 
			 if(ing.equalsIgnoreCase("S")) {
				ingredientes_especiales = true;

			 }else {
				 if(ing.equalsIgnoreCase("N")) {
					ingredientes_especiales = false;
				 }
			}
			 
			pz.setDiametro(diametro);
			pz.setIngredientes_especiales(ingredientes_especiales);
			pz.calcularPrecio(pz.getDiametro(), pz.isIngredientes_especiales());
			pz.calcularArea();
			
			System.out.println("***PIZZA 1***");
			System.out.println("Diametro: " + pz.getDiametro());
			System.out.println("Ingredientes especiales: " + pz.isIngredientes_especiales());
			System.out.println("Precio: " + pz.getPrecio());
			System.out.println("Area: " + pz.getArea());
			
		 }while(cont <= 3);
		 
		 
	}

}
