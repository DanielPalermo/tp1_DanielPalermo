package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,doble,triple; 
		
		System.out.println("Ingrese un numero: ");
		
		n = sc.nextInt();
		
		if(n % 2 != 0) {
			doble = n * 2;
			System.out.println("El doble del numero es: " + doble);
		}else {
			triple = n * 3;
			System.out.println("El triple del numero es: " + triple);
		}
		
		

	}

}
