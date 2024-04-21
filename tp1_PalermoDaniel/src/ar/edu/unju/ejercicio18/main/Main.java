package ar.edu.unju.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Pais> paises = new ArrayList();
		
		Pais p1 = new Pais(111,"Argentina");
		Pais p2 = new Pais(222,"España");
		Pais p3 = new Pais(333,"Italia");
		Pais p4 = new Pais(444,"Alemania");
		
		paises.add(p1);
		paises.add(p2);
		paises.add(p3);
		paises.add(p4);
		
		int op;
		
		DestinoTuristico destino = new DestinoTuristico();
		
		List<DestinoTuristico> destinos = new ArrayList<>();
		
		
		System.out.println("1) Dar de alta a un pais");
		System.out.println("2) Mostrar los destinos turisticos");
		System.out.println("3) Modificar el pais de destinos");
		System.out.println("4) Limpiar el ArrayList de destinos");
		System.out.println("5) Eliminar un destino turistico");
		System.out.println("6) Mostrar los destinos turisticos, ordenados");
		System.out.println("7) Mostrar los paises");
		System.out.println("8) Mostrar los destinos turisticos que pertenezcan a un pais seleccionado");
		System.out.println("9) Salir");
		System.out.println("Ingrese opcion");
		
		op = sc.nextInt();
		
		do {
			switch(op) {
			case 1:
				alta(destino, paises, destinos);
				break;
			case 2:
				mostrar(destinos);
				break;
			case 3:
				modificar(paises, destinos);
				break;
			case 4:
				limpiar(destinos);
				break;
			case 5:
				eliminar_dest(destinos);
				break;
			case 6:
				mostrar_destino(destinos);
				break;
			case 7:
				mostrar_paises(paises);
				break;
			case 8:
				destinos_pais(destinos);
				break;
			case 9:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opcion incorrecta");	
			}
		}while(op != 9);

		
	}
	
	public static void destinos_pais(List<DestinoTuristico> destinos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese codigo del pais que quiera ver los paises");
		int codigo = sc.nextInt();
		for(DestinoTuristico d: destinos) {
			if(d.getPais().getCodigo() == codigo) {
				System.out.println(d);
			}
		}
	}
	
	public static void mostrar_paises(List<Pais> paises) {
		paises.forEach(p -> System.out.println(p));
	}
	
	public static void mostrar_destino(List<DestinoTuristico> destinos) {
		destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
		destinos.forEach(d -> System.out.println(d));
	}
	
	public static void eliminar_dest(List<DestinoTuristico> destinos) {
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		Iterator iterator = destinos.iterator();
		while(iterator.hasNext()) {
			DestinoTuristico d = (DestinoTuristico)iterator.next();
			if(codigo == d.getCodigo()) {
				iterator.remove();
			}
		}
	}
	
	
	public static void limpiar(List<DestinoTuristico> destinos) {
		destinos.clear();
	}
	
	
	public static void modificar(List<Pais> paises, List<DestinoTuristico> destinos) {
		System.out.println("Ingrese el codigo de destino a modificar");
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		for(DestinoTuristico d: destinos) {
			if(codigo == d.getCodigo()) {
				System.out.println("Ingrese el codigo de pais nuevo");
				int Ncodigo = sc.nextInt();
				for(Pais p: paises) {
					if(Ncodigo == p.getCodigo()) {
						d.setPais(p);
					}
				}
			}
		}
	}
	
	public static void alta(DestinoTuristico destino, List<Pais> paises, List<DestinoTuristico> destinos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese codigo de destino");
		int codigo;
		codigo = sc.nextInt();
		destino.setCodigo(codigo);
		System.out.println("Ingrese nombre de destino");
		String nombre;
		nombre = sc.next();
		destino.setNombre(nombre);
		System.out.println("Ingrese precio ");
		double precio;
		precio = sc.nextDouble();
		destino.setPrecio(precio);
		System.out.println("Ingrese codigo del pais");
		int codPais;
		codPais = sc.nextInt();
		for(Pais p: paises) {
			if(codPais == p.getCodigo()) {
				destino.setPais(p);
			}
		}
		
		System.out.println("Ingrese cantidad de dias: ");
		int cant_dias = sc.nextInt();
		destino.setCant_dias(cant_dias);
		
	}
	
	public static void mostrar(List<DestinoTuristico> destinos) {
		for(DestinoTuristico d: destinos) {
			System.out.println(d.toString());
		}
	}

}
