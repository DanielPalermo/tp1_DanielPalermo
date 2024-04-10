package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numero: ");
		n = sc.nextInt();
		
		CalculadoraEspecial calc = new CalculadoraEspecial();
		
		calc.setN(calc.calcularProductoria(n)); 
		
		System.out.println("Resultado del producto: " + calc.getN());
		
		calc.setN(calc.calcularSumatoria(n)); 
		
		System.out.println("Resultado de la sumatoria: " + calc.getN());
	}

}
