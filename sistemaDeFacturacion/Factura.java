package sistemaDeFacturacion;

import javax.swing.JOptionPane;

public class Factura {
	
	private Pedido pedido;
	private String fechaEmision;
	private String nroFactura;

	//Contructor
	public Factura(Pedido pedido, String fecha, String nroFactura) {
		
		this.pedido=pedido;
		this.setFechaEmision(fecha);
		this.setNroFactura(nroFactura);
		
	}
	
	//Getters y Setters
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public String getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	public String getNroFactura() {
		return nroFactura;
	}
	
	public void setNroFactura(String nroFactura) {
		this.nroFactura = nroFactura;
	}
	
	//calcula y muestra en un Joptionpane la factura con los datos pedidos
	public void imprimirFactura() {
		double iva=0;
		double precioNeto=0;
		double precioVenta=0;
		String productosPedidos="";
		double montoIVA=0;
		
		//Mostrar productos en factura
		productosPedidos=this.pedido.mostrarProductos();
		
		//Porcentaje de iva segun categoria
		if (pedido.getCliente().getCondidcionImposistiva().equals("A")) {
			iva=10.05;
		}
		else if(pedido.getCliente().getCondidcionImposistiva().equals("B")) {
			iva=21;
		}
		else if(pedido.getCliente().getCondidcionImposistiva().equals("X")) {
			iva=70;
		}
		
		//Precio Neto
		double cantidadP=0;
		double precioP=0;
		for (Producto p : pedido.getProductos()) {
			cantidadP=p.getCantidad();
			precioP=p.getPrecio();
			precioNeto=precioNeto+(cantidadP*precioP);
		}
		
		//Precio de venta
		precioVenta=precioNeto+((precioNeto*iva)/100);
		
		//Monto de IVA
		montoIVA=(precioNeto*iva)/100;
		
		
		String cabecera = "Fecha de emision: "+ this.fechaEmision+ "\n"
						+"Nro. de factura: "+this.nroFactura+ "\n"
						+pedido.getCliente().getCondidcionImposistiva()+"\n "
						+pedido.getCliente().toString()+"\n "
						+"-----------------------------------------------------------------------------------------"
						+ "----------------------------------------------------------------------------------------"
						+ "-------------------------";
		
		String detalle = "- Productos" 
						+productosPedidos
						+"\n"
						+"\n"
						+"   % de IVA correspondiente según Categoría de IVA del cliente: "+iva+" %"+ "\n"
						+"   Precio de Venta:                                             "+"$"+precioVenta+"\n"
						+"   Precio NETO:                                                 "+"$"+precioNeto+ "\n"
						+"   Monto de IVA:                                                "+"$"+montoIVA+ "\n"
						+"-----------------------------------------------------------------------------------------"
						+ "----------------------------------------------------------------------------------------"
						+ "-------------------------";
		
		String pieFactura ="Totol:   "+"$"+precioVenta+ "\n"
						+"Total IVA:   "+"$"+montoIVA;
								
		
		JOptionPane.showMessageDialog(null,cabecera+ "\n"+detalle+ "\n"+pieFactura,"Factura", 1);
	}
	
	
	//calcula y muestra en un Joptionpane la operacion de dia con los datos pedidos
	public void operacionDelDia() {
		String opDelDia;
		
		double iva=0;
		double precioNeto=0;
		double precioVenta=0;
		String productosPedidos="";
		double montoIVA=0;
		
		//Mostrar productos en factura
		productosPedidos=this.pedido.mostrarProductos();
		
		//Porcentaje de iva segun categoria
		if (pedido.getCliente().getCondidcionImposistiva().equals("A")) {
			iva=10.05;
		}
		else if(pedido.getCliente().getCondidcionImposistiva().equals("B")) {
			iva=21;
		}
		else if(pedido.getCliente().getCondidcionImposistiva().equals("X")) {
			iva=70;
		}
		
		//Precio Neto
		double cantidadP=0;
		double precioP=0;
		for (Producto p : pedido.getProductos()) {
			cantidadP=p.getCantidad();
			precioP=p.getPrecio();
			precioNeto=precioNeto+(cantidadP*precioP);
		}
		
		//Precio de venta
		precioVenta=precioNeto+((precioNeto*iva)/100);
		
		//Monto de IVA
		montoIVA=(precioNeto*iva)/100;
		
		opDelDia = pedido.getCliente().toString()+"  "+ this.fechaEmision + "   Monto: $"+	precioVenta;
		
		JOptionPane.showMessageDialog(null, opDelDia,"Operacion del dia", 1);
	}
	

}
