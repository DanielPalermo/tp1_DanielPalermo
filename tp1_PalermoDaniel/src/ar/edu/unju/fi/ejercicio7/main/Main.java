package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		String nombre,legajo;
		float salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre del empleado: ");
		nombre = sc.next();
		
		System.out.println("Ingrese su legajo: ");
		legajo = sc.next();
		
		System.out.println("Ingrese el salario del empleado: ");
		salario = sc.nextFloat();
		
		Empleado emp = new Empleado(nombre, legajo, salario);
		
		emp.MostrarDatos();
		
		System.out.println();
		System.out.println("Aumento de salario: ");
		System.out.println();
		
		emp.aumentoSalario();
		
		emp.MostrarDatos();
		
	}
	
	
	

}

