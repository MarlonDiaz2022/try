package Fachada;

import java.sql.Date;

import Modelo.Entidad;
import Modelo.Estado;
import Modelo.Pago;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Tarjetadecredito;

public class fachada{
	
private fachada() {}

	
	
public static void main(String[] args) {

	
	
Producto pro = new 	Producto("camisa",(short)3,12300d,"nacional",10d);
Producto pro2 = new Producto("nevera",(short)6,476300d,"extranjero",10d);
	
	
Pedido ob = new Pedido(pro,Estado.PROCESANDO, new Date(12/02/2020));
Pedido ob2 = new Pedido(pro,Estado.PROCESANDO, new Date(12/02/2020));

ob.realizarPedido(pro,  new Date(12/02/2020), Estado.PROCESANDO);
ob.realizarPedido(pro2, new Date(12/02/2022), Estado.PROCESANDO);

Pago pa = new Pago(ob);


Tarjetadecredito tar = new Tarjetadecredito("1234567",Entidad.VISA, new Date(12/02/2022),1345678d);

ob.mostrarPedido();

pa.pagarPedido(tar, 4);
pa.pagarPedido(tar, 3);

ob.setEstado(Estado.PAGADO);



}
	



}




