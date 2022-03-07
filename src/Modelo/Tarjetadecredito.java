package Modelo;

import java.util.Date;

public class Tarjetadecredito {

private String numero;
private Date fechacaducidad;
private Entidad entidad;
private double saldo; 


public Tarjetadecredito(String numero, Entidad entidad, Date fechacaducidad,double saldo) {
	this.numero = numero;
	this.entidad = entidad;
	this.fechacaducidad = fechacaducidad;
	this.saldo=saldo;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public Entidad getEntidad() {
	return entidad;
}

public void setEntidad(Entidad entidad) {
	this.entidad = entidad;
}

public Date getFechacaducidad() {
	return fechacaducidad;
}

public void setFechacaducidad(Date fechacaducidad) {
	this.fechacaducidad = fechacaducidad;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}


	
	
	
	
}
