package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	
private ArrayList<Producto> productos;	
private Estado estado;
private Date fechadelpedido;
private Date fecha;
private double valor;

public Pedido() {}

public Pedido(Producto productos, Estado estado, Date fechadelpedido) {
	this.productos= new ArrayList<>();
	this.estado = estado;
	this.fechadelpedido = fechadelpedido;
}

public ArrayList<Producto> getProductos() {
	return productos;
}

public void setProductos(ArrayList<Producto> productos) {
	this.productos = productos;
}

public Estado getEstado() {
	return estado;
}

public void setEstado(Estado estado) {
	this.estado = estado;
}

public Date getFechadelpedido() {
	return fechadelpedido;
}

public void setFechadelpedido(Date fechadelpedido) {
	this.fechadelpedido = fechadelpedido;
}
	
public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}

public void realizarPedido(Producto pro , Date fecha , Estado estado) {

productos.add(pro);

		
if(productos.size()>=1) {	
System.out.println("se ha realizo un pedido ");
}
else {
System.out.println("un pedido debe tener al menos un producto");
}
	
}

public void cantidadProducto() {
	
	for(int i=0; i<productos.size(); i++) {
		
		productos.get(i).setCantidad((short)(productos.get(i).getCantidad()-1));
	}
	
}

public void mostrarPedido(){
	
	for(int i=0; i<productos.size(); i++) {
		
		System.out.println("el pedido "+i+" tiene "+productos.get(i).getNombre()+" con un precio de "+productos.get(i).getPrecio()+
				" y su estado es "+Estado.PROCESANDO);	
	 	
	}
		
}

public double calcularPrecioT() {	
	
for(int i=0; i<productos.size(); i++) {	
	
valor=(double)productos.get(i).getPrecio();

double iva= (double)(productos.get(i).iva/100) ;

if(productos.get(i).getOrigen()=="extranjero") {	

	valor=(double)(valor+(valor*0.1)+(valor*iva));
}

else {
	
if(productos.get(i).getOrigen()=="nacional") {
	
	valor=(double)(valor+(valor*0.05)+(valor*iva));	
	
    }
  }
}

return valor;
}


}
