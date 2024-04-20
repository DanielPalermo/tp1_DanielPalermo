package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] arreglo = new String[5];
		String dato;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arreglo.length;i++) {
			System.out.println("Ingrese nombre");
			dato = sc.next();
			arreglo[i]=dato;
		}
		
		int k = 0;
		
		
		while(k < arreglo.length) {
			System.out.println("Posicion: " + k + ", nombre: " + arreglo[k]);
			k++;
		}
		
		System.out.println("Longitud del arreglo: " + arreglo.length);
		
		byte indice;

		int z = 5;
				
	
			do {
				System.out.println("Ingrese indice a eliminar: [0-5]");
				indice = sc.nextByte();
			}while(indice < 0 || indice > 5);
			int p=0;
			while(indice<arreglo.length-1) {
				arreglo[indice] = arreglo[indice+1];
			}
			arreglo[arreglo.length-1] = "";
			
			int q=0;
			while(q < arreglo.length) {
				System.out.println("Posicion [" + q + "]: " + arreglo[q]);
				q++;
			}
			z--;
		
	}

}
