package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int anio,mes,dia, edad;
		String dni;
		String nombre;
		String provincia;
		
//		LocalDate fechaNacimiento = LocalDate.of(2004, 1, 22);
		Scanner sc = new Scanner(System.in);
		LocalDateTime fechaConHorario = LocalDateTime.now();
		LocalDate fechaActual = LocalDate.from(fechaConHorario);
		
		//Construccion del objeto persona por defecto
		
		
		System.out.println("Ingrese nombre");
		nombre = sc.next();
		
		
		System.out.println("Ingrese dni");
		dni = sc.next();
		
		
		System.out.println("Ingrese provincia: ");
		provincia = sc.next();
		
		
		do {
			System.out.println("Ingrese anio: ");
			anio = sc.nextInt();
		}while(anio >= fechaActual.getYear());
		
		do {
			System.out.println("Ingrese mes: ");
			mes = sc.nextInt();
		}while(mes <= 0 || mes >12);
		
		do {
			System.out.println("Ingrese dia: ");
			dia = sc.nextInt();			
		}while(dia <= 0 || dia > 31);
		
		LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
		
		Persona per1 = new Persona();
		per1.setNombre(nombre);
		per1.setDni(dni);
		per1.setProvincia(provincia);
		per1.setFechaNacimiento(fechaNacimiento);
		edad = per1.calcularEdad(fechaNacimiento, fechaActual);
		per1.mostrarDatos(dni, nombre, fechaNacimiento, fechaActual, provincia, edad);
		
		//Construccion del objeto con el constructor parametizado
		
		System.out.println("Ingrese nombre");
		nombre = sc.next();
		
		System.out.println("Ingrese dni");
		dni = sc.next();
		
		System.out.println("Ingrese provincia: ");
		provincia = sc.next();
		
		
		do {
			System.out.println("Ingrese anio: ");
			anio = sc.nextInt();
		}while(anio >= fechaActual.getYear());
		
		do {
			System.out.println("Ingrese mes: ");
			mes = sc.nextInt();
		}while(mes <= 0 || mes >12);
		
		do {
			System.out.println("Ingrese dia: ");
			dia = sc.nextInt();			
		}while(dia <= 0 || dia > 31);
		
		
		LocalDate fecha2 = LocalDate.of(anio, mes, dia);
		
		Persona per2 = new Persona(nombre, nombre, fecha2, provincia);
		
		per2.mostrarDatos(dni, nombre, fechaNacimiento, fechaActual, provincia, edad);
		
		//Construccion del constructor que lleva como parámetros el dni, nombre y fecha de nacimiento
		
		System.out.println("Ingrese nombre");
		nombre = sc.next();
		
		System.out.println("Ingrese dni");
		dni = sc.next();
		
		do {
			System.out.println("Ingrese anio: ");
			anio = sc.nextInt();
		}while(anio >= fechaActual.getYear());
		
		do {
			System.out.println("Ingrese mes: ");
			mes = sc.nextInt();
		}while(mes <= 0 || mes >12);
		
		do {
			System.out.println("Ingrese dia: ");
			dia = sc.nextInt();			
		}while(dia <= 0 || dia > 31);
		
		
		LocalDate fecha3 = LocalDate.of(anio, mes, dia);
		
		Persona per3 = new Persona(dni, nombre, fecha3);
		
		System.out.println("Nombre: " + per3.getNombre());
		System.out.println("Dni: " + per3.getDni());
		System.out.println("Provincia: " + per3.getProvincia());
		System.out.println("Fecha de nacimiento: " + per3.getFechaNacimiento());
	}
	
	
}
