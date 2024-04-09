package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fact, num;
		do {
		System.out.println("Ingres valor ");
		num = sc.nextInt();
		}while(num<=0 || num > 10);
		fact = 1;
		while(num > 0 ) {
			fact= fact * num;
			num--;
		}
		System.out.println("Factorial: " + fact);

	}

}
