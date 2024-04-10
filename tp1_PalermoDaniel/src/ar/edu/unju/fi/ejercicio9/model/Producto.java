package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private int codigo;
	private float precio;
	private float descuento;
	
	public Producto() {

	}
	
	public float calcularDescuento(float precio, float descuento) {
		return this.precio - (this.precio * (this.descuento/100));
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	
	

}
