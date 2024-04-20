package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {
	
	private String nombre;
	private String apellido;
	private LocalDate fecha;
	private String Nacionalidad;
	private double estatura;
	private double peso;
	private String posicion; // 1=delantero, 2=medio, 3=defensa, 4=arquero
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}

	public Jugador(String nombre, String apellido, LocalDate fecha, String nacionalidad, double estatura, double peso,
			String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha = fecha;
		Nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", fecha=" + fecha + ", Nacionalidad="
				+ Nacionalidad + ", estatura=" + estatura + ", peso=" + peso + ", posicion=" + posicion + "]";
	}
	
	public int calcularEdad() {
		int edad;
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(this.fecha, hoy);
		return periodo.getYears();
	}
	
}
