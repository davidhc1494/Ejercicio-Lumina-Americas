package sistemaDeFacturacion;

import javax.swing.JOptionPane;

public class NotaDeCredito {
	
	private Pedido pedido;
	private String fechaEmision;
	private String nroNotaCredito;
	private String codEmision;	
	
	//Constructor
	public NotaDeCredito(Pedido pedido,String fecha,String nroNotaCredito,String codEmision) {
		
		this.setPedido(pedido);
		this.setFechaEmision(fecha);
		this.setNroNotaCredito(nroNotaCredito);
		this.setCodEmision(codEmision);		
		
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

	public String getNroNotaCredito() {
		return nroNotaCredito;
	}

	public void setNroNotaCredito(String nroNotaCredito) {
		this.nroNotaCredito = nroNotaCredito;
	}

	public String getCodEmision() {
		return codEmision;
	}

	public void setCodEmision(String codEmision) {
		this.codEmision = codEmision;
	}
	
	//calcula y muestra en un Joptionpane la nota de credito con los datos pedidos
	public void imprimirNotaDeCredito() {
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
						+"Nro. de Nota de crédito: "+this.nroNotaCredito+ "\n"
						+"Código de emisión "+this.codEmision+ "\n"
						+pedido.getCliente().getCondidcionImposistiva()+"\n "
						+pedido.getCliente().toString()+"\n "
						+"-----------------------------------------------------------------------------------------"
						+ "----------------------------------------------------------------------------------------"
						+ "-------------------------";
		
		String detalle = "- Productos" 
						+productosPedidos+"\n "						
						+"-----------------------------------------------------------------------------------------"
						+ "----------------------------------------------------------------------------------------"
						+ "-------------------------";
		
		String pieFactura ="Totol:   "+"$"+precioVenta;
								
		
		JOptionPane.showMessageDialog(null,cabecera+ "\n"+detalle+ "\n"+pieFactura,"Nota de credito", 1);
	}
	
	
	
	
}
