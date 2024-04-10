package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private String legajo;
	private float salario;
	private final float SALARIO_MINIMO = 210000.00f;
	private final float AUMENTO_SALARIO = 20000.00f;
	
	
	public Empleado(String nombre, String legajo, float salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		
		if(salario < SALARIO_MINIMO ) {
			this.salario = SALARIO_MINIMO;
		}else {
			this.salario = salario;
		}
		
	}
	
	public void MostrarDatos() {
		System.out.println("Nombre del empleado: " + this.nombre);
		System.out.println("Legajo: " + this.legajo);
		System.out.println("Salario: " + this.salario);
	}
	
	public float sumarSalario(float salario) {
		return salario +  AUMENTO_SALARIO;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		if(salario >= SALARIO_MINIMO ) {
			this.salario = salario;
		}else {
			this.salario = SALARIO_MINIMO;
		}
	}

	public float getSALARIO_MINIMO() {
		return SALARIO_MINIMO;
	}

	public float getAUMENTO_SALARIO() {
		return AUMENTO_SALARIO;
	}
	
	
	public void aumentoSalario() {
		this.salario += this.AUMENTO_SALARIO;
	}
}
