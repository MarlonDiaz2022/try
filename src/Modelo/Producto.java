package Modelo;

import java.util.ArrayList;

public class Producto{
	
private String nombre;
private short cantidad;
private double precio;
private String origen;
public double iva;
	
public Producto() {}

public Producto(String nombre, short cantidad,double precio,String origen,double iva) {	
this.nombre=nombre;
this.cantidad=cantidad;
this.precio=precio;
this.origen=origen;
this.iva=iva;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public short getCantidad() {
	return cantidad;
}


public void setCantidad(short cantidad) {
	this.cantidad = cantidad;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


public String getOrigen() {
	return origen;
}


public void setOrigen(String origen) {
	this.origen = origen;
}


public double getIva() {
	return iva;
}


public void setIva(double iva) {
	this.iva = iva;
};	
		
	
}