package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public int calcularEdad(LocalDate fechaNacimiento, LocalDate fechaActual) {
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		return periodo.getYears();
	}

	
	public boolean mayorEdad(int edad) {
		return edad >= 18;
	}
	
	
	public void mostrarDatos(String dni, String nombre, LocalDate fechaNacimiento,LocalDate fechaActual, String provincia, int edad) {
		edad = calcularEdad(fechaNacimiento, fechaActual);
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Provincia: " + provincia);
		System.out.println("Fecha de nacimiento: " + fechaNacimiento);
		if(mayorEdad(edad))
			System.out.println("El usuario es mayor de edad, y  su edad es de: " + edad);
		else
			System.out.println("El usuario no es mayor de edad, y su edad es de: " + edad);
	}
	
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia="Jujuy";
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getDni() {
		return dni;
	}
	
	public void pedirFechas(int anio, int mes , int dia) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese anio: ");
		anio = sc.nextInt();
		
		do {
			System.out.println("Ingrese mes: ");
			mes = sc.nextInt();
		}while(mes <= 0 || mes >12);
		
		do {
			System.out.println("Ingrese mes: ");
			mes = sc.nextInt();			
		}while(dia <= 0 || dia > 31);
	}
}
