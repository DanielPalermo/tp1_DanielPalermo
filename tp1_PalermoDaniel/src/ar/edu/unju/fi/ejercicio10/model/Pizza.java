package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	
	private float diametro;
	private float precio;
	private float area;
	private boolean ingredientes_especiales;
	private final float ingrediente_especial_20 = 500;
	private final float ingrediente_especial_30 = 750;
	private final float ingrediente_especial_40 = 1000;
	
	public Pizza() {
		
	}
	
	public void calcularPrecio(float diametro, boolean ingredientes_especiales) {
		if(this.diametro == 20 && !this.ingredientes_especiales) {
			this.precio = 4500;
		}else {
			if(this.diametro == 20 && this.ingredientes_especiales) {
				this.precio = 4500 + this.ingrediente_especial_20;
			}else {
				if(this.diametro == 30 && !this.ingredientes_especiales) {
					this.precio = 4800;
				}else {
					if(this.diametro == 30 && this.ingredientes_especiales) {
						this.precio = 4800 + this.ingrediente_especial_30; 
					}else {
						if(this.diametro == 40 && !this.ingredientes_especiales) {
							this.precio = 5500;
						}else {
							if(this.diametro == 40 && this.ingredientes_especiales) {
								this.precio = 5500 + ingrediente_especial_40;
							}
						}
					}
				}
			}
		}
			
	}
	
	public void calcularArea() {
		this.area = (float) (1/(double)4 *  (Math.PI * Math.pow(this.diametro, 2.0)));
	}
	
	public float getDiametro() {
		return diametro;
	}
	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public boolean isIngredientes_especiales() {
		return ingredientes_especiales;
	}
	public void setIngredientes_especiales(boolean ingredientes_especiales) {
		this.ingredientes_especiales = ingredientes_especiales;
	}
	public float getIngrediente_especial_20() {
		return ingrediente_especial_20;
	}
	public float getIngrediente_especial_30() {
		return ingrediente_especial_30;
	}
	public float getIngrediente_especial_40() {
		return ingrediente_especial_40;
	}
	
	
}
