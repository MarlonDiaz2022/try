package Modelo;

public class Efectivo {

	private String divisa;
	private double monto;
	
public Efectivo() {}
	
	public Efectivo(String divisa) {
		this.divisa=divisa;	
	}

	public String getDivisa() {
		return divisa;
	}

	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
	
	
}
