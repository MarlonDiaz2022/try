package Modelo;

public class Cheque {
	
	private String nombre;
	private String entidadbanc;
	private double monto;
	
	public Cheque() {
		}
	
	public Cheque(String nombre, String entidadbanc,double monto) {
		this.nombre = nombre;
		this.entidadbanc = entidadbanc;
		this.monto=monto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEntidadbanc() {
		return entidadbanc;
	}

	public void setEntidadbanc(String entidadbanc) {
		this.entidadbanc = entidadbanc;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(short monto) {
		this.monto = monto;
	}	
	
    
	
	
	
}
