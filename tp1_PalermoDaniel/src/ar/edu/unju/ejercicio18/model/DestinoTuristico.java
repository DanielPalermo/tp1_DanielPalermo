package ar.edu.unju.ejercicio18.model;

public class DestinoTuristico {
	private int codigo;
	private String nombre;
	private double precio;
	private Pais pais;
	private int cant_dias;
	
	public DestinoTuristico() {
		// TODO Auto-generated constructor stub
	}

	public DestinoTuristico(int codigo, String nombre, double precio, Pais pais, int cant_dias) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.cant_dias = cant_dias;
	}

	@Override
	public String toString() {
		return "DestinoTuristico [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", pais=" + pais
				+ ", cant_dias=" + cant_dias + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getCant_dias() {
		return cant_dias;
	}

	public void setCant_dias(int cant_dias) {
		this.cant_dias = cant_dias;
	}
	
	
	
}
