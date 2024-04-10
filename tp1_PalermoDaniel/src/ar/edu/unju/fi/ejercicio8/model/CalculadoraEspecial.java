package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int calcularSumatoria(int n) {
		int calculo,cuadrado=0;
		for(int k = 1; k <= n ;k++) {
			cuadrado = (int) Math.pow(k * (k + 1) / 2, 2);
		}
		return cuadrado;
	}
	
	public int calcularProductoria(int n) {
		int calc=0;
		for(int k=1; k <=n;k ++) {
			calc = k *(k + 4);
		}
		return calc;
	}
}
