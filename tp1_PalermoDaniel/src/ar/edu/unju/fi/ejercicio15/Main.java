package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		String cad;
		
		do {
			System.out.println("Ingrese rango del vector [5-10]");
			n = sc.nextInt();
		}while(n<5 || n>10);
		
		String [] arreglo = new String[n];
		
		for(int i=0; i<arreglo.length;i++) {
			System.out.println("Ingrese nombre de una persona en la poscion: " + i);
			cad = sc.next();
			arreglo[i] = cad;
			
		}
		int k=0;
		for(int j=arreglo.length-1;j>=0;j--) {
			System.out.println("Posicion: " + k );
			System.out.println("Nombre de persona: " + arreglo[j]);
		}
		
	}

}
