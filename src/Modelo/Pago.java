package Modelo;

import javax.swing.JOptionPane;

public class Pago {
	
private Pedido pedido;




public Pago() {
	
}

public Pago(Pedido pedido) {
	this.pedido = pedido;
}

public void pagarPedido(Tarjetadecredito tarjeta, int cuotas) {
	
	int numcuotasP=0;
		
	if(tarjeta.getSaldo()-pedido.calcularPrecioT()>=0 && cuotas==0) {

System.out.println("el pedido ha sido pagado con exito");	
	pedido.setEstado(Estado.PAGADO);
}
else {
	
	if(tarjeta.getSaldo()-pedido.calcularPrecioT()<0 || cuotas>=1) {

	
		 
	double x=(double)(pedido.calcularPrecioT()/(double)cuotas);
	
	numcuotasP=Integer.parseInt(JOptionPane.showInputDialog("cuantas cuotas desea pagar"));
     
	double pagot= (double)(x*numcuotasP);
	 
	double z= tarjeta.getSaldo()-pagot;
	 
	System.out.println("se ha pagado "+numcuotasP+" de "+pedido.getProductos().getClass().getName()+
			" cuotas y quedan por pagar por pagar "+(cuotas-numcuotasP));
	     pedido.setEstado(Estado.PENDIENTE);
   }		
}
	
}

public void pagarpedido(Cheque cheque , int cuotas ) {
	
	int numcuotasP=0;	
	
if(cheque.getMonto()-pedido.getValor()>0 && cuotas==0) {
	
	pedido.setEstado(Estado.PAGADO);
	
System.out.println("el pedido ha sido pagado con exito");	
	
}
else {
	
	if(cheque.getMonto()-pedido.calcularPrecioT()<0 || cuotas>=1) {

		pedido.setEstado(Estado.PENDIENTE);
			 
		double x=(double)(pedido.calcularPrecioT()/(double)cuotas);
		
		numcuotasP=Integer.parseInt(JOptionPane.showInputDialog("cuantas cuotas desea pagar"));
	     
		double pagot= (double)(x*numcuotasP);
		 
		double z= cheque.getMonto()-pagot;
		 
			
		System.out.println("se ha pagado "+numcuotasP+" de "+pedido.getProductos().getClass().getName()+
				" cuotas y quedan por pagar por pagar "+(cuotas-numcuotasP));
			
	   	
       }
     }  
}

public void pagarpedido(Efectivo efectivo, int cuotas) {

	int numcuotasP=0;
	
efectivo.setMonto(pedido.calcularPrecioT());	
	

if(efectivo.getMonto()-pedido.calcularPrecioT()>0 && cuotas==0) {
pedido.setEstado(Estado.PAGADO);
	
System.out.println("el pedido ha sido pagado con exito");	

}else {
	
	if(efectivo.getMonto()-pedido.calcularPrecioT()<0 || cuotas>=1) {

		pedido.setEstado(Estado.PENDIENTE);
			 
		double x=(double)(pedido.calcularPrecioT()/(double)cuotas);
		
		numcuotasP=Integer.parseInt(JOptionPane.showInputDialog("cuantas cuotas desea pagar"));
	     
		double pagot= (double)(x*numcuotasP);
		 
		double z= efectivo.getMonto()-pagot;
		 
		System.out.println("se ha pagado "+numcuotasP+" de "+pedido.getProductos().getClass().getName()+
				" cuotas y quedan por pagar por pagar "+(cuotas-numcuotasP));
			
	   }		
	}

}
	
	

}
