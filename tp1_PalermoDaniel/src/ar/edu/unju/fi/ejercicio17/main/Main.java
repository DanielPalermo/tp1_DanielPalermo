package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Jugador jug = new Jugador();
		List<Jugador> jugadores = new ArrayList();
		
		int op=0;
		
		do {
			//menu(op);
			System.out.println("1) Dar de alta un jugador");
			System.out.println("2) Mostrar los datos del jugador");
			System.out.println("3) Mostrar todos los jugadores ordenados por apellido");
			System.out.println("4) Modificar los datos del jugador");
			System.out.println("5) Eliminar un jugador");
			System.out.println("6) Mostrar la cantidad de jugadores que tienen el arreglo");
			System.out.println("7) Mostrar la cantidad de jugadores que tiene una nacionalidad");
			System.out.println("8) Salir");
			System.out.println("Ingrese opcion");
			
			op = sc.nextInt();
			switch(op) {
			case 1:
				alta(jug,jugadores);
				break;
			case 2:
				mostar_datos(jugadores);
				break;
			case 3:
				mostrar_ordenados_apellidos(jugadores);
				break;
			case 4:
				modificar_datos(jugadores);
				break;
			case 5:
				eliminar(jugadores);
				break;
			case 6:
				contar(jugadores);
				break;
			case 7:
				contar_nacionalidad(jugadores);
				break;
			case 8:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opcion incorrecta");	
			}
		}while(op != 8);

	}
	
	
	/*public static void menu(int op) {
		Scanner sc = new Scanner(System.in);
		
	
	}*/
	
	public static void contar_nacionalidad(List<Jugador> jugadores) {
		int cont=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nacionalidad que busca: ");
		String nac;
		nac = sc.next();
		for(Jugador j: jugadores) {
			if(j.getNacionalidad().equals(nac)){
				cont++;
			}
		}
		System.out.println("Cantidad total de jugadores de " + nac + " es: " + cont);
	}
	
	public static void contar(List<Jugador> jugadores) {
		System.out.println("La cantidad de jugadores es: " + jugadores.size());
	}
	
	public static void eliminar(List<Jugador> jugadores) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		String nombre;
		nombre = sc.next();
		
		System.out.println("Ingrese apellido");
		String apellido;
		apellido = sc.next();
		
		Iterator iterator = jugadores.iterator();
		while(iterator.hasNext()) {
			Jugador j = (Jugador)iterator.next();
			if(j.getNombre().equals(nombre) && j.getApellido().equals(apellido)) {
				iterator.remove();
			}
		}
	}
	
	
	public static void modificar_datos(List<Jugador> jugadores) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		String nombre;
		nombre = sc.next();
		
		System.out.println("Ingrese apellido");
		String apellido;
		apellido = sc.next();
		
		for(Jugador j:jugadores) {
			if(j.getNombre().equals(nombre) && j.getApellido().equals(apellido)) {
				alta(j, jugadores);
			}
		}
	}
	
	
	
	public static void mostrar_ordenados_apellidos(List<Jugador> jugadores) {
		jugadores.sort(Comparator.comparing(Jugador::getApellido));
		jugadores.forEach(jug -> System.out.println(jug));
	}
	
	public static void mostar_datos(List<Jugador> jugadores) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre");
		String nombre;
		nombre = sc.next();
		
		System.out.println("Ingrese apellido");
		String apellido;
		apellido = sc.next();
		
		for(Jugador j: jugadores) {
			if(j.getNombre().equals(nombre) && j.getApellido().equals(apellido)) {
				System.out.println(j.toString());
			}
		}
	}
	
	public static void alta(Jugador jug, List<Jugador> jugadores) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre:");
		String nombre;
		nombre = sc.next();
		jug.setNombre(nombre);
		
		
		System.out.println("Ingrese apellido:");
		String apellido;
		apellido = sc.next();
		jug.setApellido(apellido);
		
		
		System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy)");
		String fechaActual = sc.next();
		LocalDate fechaNacimiento = null;
		try {
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			fechaNacimiento = LocalDate.parse(fechaActual,formato);
		}catch(Exception e){
			System.err.println("Cadena de fecha inválida");
			System.err.println("Volviendo al menu principal");
		}
		jug.setFecha(fechaNacimiento);
		
		System.out.println("Ingrese nacionalidad");
		String nacionalidad; 
		nacionalidad = sc.next();
		jug.setNacionalidad(nacionalidad);
		
		
		System.out.println("Ingrese estatura");
		double estatura;
		estatura = sc.nextDouble();
		jug.setEstatura(estatura);
		
		System.out.println("Ingrese peso");
		double peso;
		peso = sc.nextDouble();
		jug.setPeso(peso);
		
		System.out.println("Ingrese posicion: ");
		String pos;
		pos = sc.next();
		jug.setPosicion(pos);
		
		jugadores.add(jug);
	}
}
