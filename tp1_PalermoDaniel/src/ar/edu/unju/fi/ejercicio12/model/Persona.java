package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fecha;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public Persona(String nombre, Calendar fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public long calcularEdad() {
		Calendar dia = Calendar.getInstance();
		long milisegundos = dia.getTimeInMillis() - this.fecha.getTimeInMillis();
		long nac = milisegundos/1000/60/60/24/365;
		return nac;
	}
	
	public String calcularSigno() {
		String sig = "";
		int mes = this.fecha.get(Calendar.MONTH);
		int dia = this.fecha.get(Calendar.DAY_OF_MONTH);
		
		if(mes == 3 && dia >= 21 || mes == 3 && dia<=19) {
			sig = "Aries";
		}else{
			if(mes==3 && dia >= 20 || mes == 4 && dia<=20) {
				sig = "Tauro";
			}else {
				if(mes == 4 && dia >= 21 || mes == 5 && dia <= 20) {
					sig = "Geminis";
				}else {
					if(mes == 5 && dia >= 21 || mes == 6 && dia <= 22) {
						sig = "Cancer";
					}else {
						if(mes == 6 && dia >= 23 || mes == 7 && dia <= 22){
							sig = "Leo";
						}else {
							if(mes == 7 && dia >= 23 || mes == 8 && dia <= 22) {
								sig = "Virgo";
							}else {
								if(mes == 8 && dia >= 23 || mes == 9 && dia <= 22) {
									sig = "Libra";
								}else {
									if(mes == 9 && dia >= 23 || mes == 10 && dia <= 21) {
										sig = "Escorpio";
									}else {
										if(mes == 10 && dia >= 22 || mes == 11 && dia <= 21) {
											sig = "Sagitario";
										}else {
											if(mes == 11 && dia >= 22 || mes ==0 && dia <= 19) {
												sig = "Capricornio";
											}else {
												if(mes == 0 && dia >= 20 || mes == 1 && dia <= 18) {
													sig = "Acuario";
												}else {
													if(mes == 1 && dia >= 19 || mes == 2 && dia <= 20) {
														sig = "Piscis";
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return sig;
	}
	
	
	public String estacionAnio() {
		String est = "";
		int m = this.fecha.get(Calendar.MONTH);
		int d = this.fecha.get(Calendar.DAY_OF_MONTH);
		if(m >= 2 && d >= 20 || m <= 5 && d <= 20) {
			est = "Otoño";
		}else {
			if(m >= 5 && d >= 21 || m <= 8 && d<=22 ) {
				est = "Invierno";
			}else {
				if(m >= 8 && d >= 23 || m <= 11 && d <= 21) {
					est = "Primavera";
				}else {
					est = "Verano";
				}
			}
		}
		return est;
	}
	
	public void mostrarDatos() {
		int mes = this.fecha.get(Calendar.MONTH)+1;
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Fecha de nacimiento: " + this.fecha.get(Calendar.DAY_OF_MONTH));
		System.out.println("Edad: " + this.calcularEdad());
		System.out.println("Signo del zodiaco: " + this.calcularSigno());
		System.out.println("Estacion: " + this.estacionAnio());
	}
}
