package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

 

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona persona = new Persona();
		Calendar fecha = Calendar.getInstance();
		
		String nombre;
		int dia,mes,anio;
		
		System.out.println("Ingrese el nombre");
		nombre = sc.next();
		persona.setNombre(nombre);
		
		System.out.println("Ingrese dia de nacimiento: ");
		dia = sc.nextInt();
		
		System.out.println("Ingrese mes de nacimiento: ");
		mes = sc.nextInt();
		
		System.out.println("Ingrese anio de nacimiento:");
		anio = sc.nextInt();
		
		
		fecha.set(anio,mes,dia);
		
		persona.setFecha(fecha);
		
		persona.mostrarDatos();
		
		sc.close();
		
	}
}
