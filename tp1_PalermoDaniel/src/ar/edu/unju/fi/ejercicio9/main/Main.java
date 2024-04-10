package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		String nombre;
		int codigo, cont = 1;
		float precio;
		float descuento;
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("Registrando producto nro: " + cont);
			
			System.out.println();
			
			System.out.println("Ingrese nombre del producto: ");
			nombre = sc.next();
			
			System.out.println("Ingrese codigo del producto: ");
			codigo = sc.nextInt();
			
			System.out.println("Ingrese precio del producto: ");
			precio = sc.nextFloat();
			
			do {
				System.out.println("Ingrese descuento que se le va a agregar al producto: ");
				descuento = sc.nextFloat();
			}while(descuento < 0 || descuento > 50);
			
			Producto prod = new Producto();
			
			prod.setCodigo(codigo);
			
			System.out.println("Codigo del producto: " + prod.getCodigo());
			
			prod.setNombre(nombre);
			
			System.out.println("Nombre del producto: " + prod.getNombre());
			
			prod.setPrecio(precio);
			
			System.out.println("Precio del produto: " + prod.getPrecio());
			
			prod.setDescuento(descuento);
			
			System.out.println("Descuento aplicado");
			
			System.out.println("Nuevo precio: " + prod.calcularDescuento(precio, descuento));
			
			cont++;
			
			System.out.println();
		}while(cont <= 3);
		
	}

}
