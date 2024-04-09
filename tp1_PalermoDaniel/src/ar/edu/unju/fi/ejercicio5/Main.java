package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num, prod;
		
		do {
			System.out.println("Ingrese numero: ");
			num = sc.nextInt();
		}while(num <= 0 || num > 9);
		
		for(int i = 0; i<=10;i++) {
			prod = num * i;
			System.out.println(num + " X " + i + " = " + prod);
		}
	}

}
