package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fact, num;
		System.out.println("Ingres valor ");
		num = sc.nextInt();
		fact = 1;
		while(num > 0 ) {
			System.out.println("Num: " + num);
			fact= fact * num;
			num--;
		}
		System.out.println("Factorial: " + fact);

	}

}
