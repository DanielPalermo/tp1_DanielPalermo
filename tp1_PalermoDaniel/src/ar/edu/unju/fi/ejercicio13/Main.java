package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dato;
		int [] arreglo = new int[8];
		
		for(int i=0; i<arreglo.length;i++) {
			System.out.println("Ingrese el valor del elemento: " + i);
			dato = sc.nextInt();
			arreglo[i] = dato;
		}
		
		for(int i=0;i<arreglo.length;i++) {
			System.out.println("Posicion: " + i + "valor: " + arreglo[i]);
		}
	}

}
