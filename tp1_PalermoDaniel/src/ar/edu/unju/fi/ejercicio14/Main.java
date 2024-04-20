package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, suma = 0, dato;
		do {
			System.out.println("Ingrese longitud del arreglo: [3-10]");
			n = sc.nextInt();
		}while(n<3 || n >10);
		
		int [] arreglo = new int[n];
		
		for(int i= 0; i<arreglo.length;i++) {
			System.out.println("Ingrese numero: " + i );
			dato = sc.nextInt();
			arreglo[i] = dato;
			suma +=dato;
		}
		
		for(int i=0;i<arreglo.length;i++) {
			System.out.println("Posicion: " + i + " valor: " + arreglo[i]);
		}
		System.out.println("Suma: " + suma);
		
	}

}
