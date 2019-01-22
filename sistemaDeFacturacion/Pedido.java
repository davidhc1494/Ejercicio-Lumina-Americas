package sistemaDeFacturacion;

import java.util.ArrayList;

public class Pedido {
	
	//Atributos de clase
	
	private String NroPedido;
	private Cliente Cliente;
	private ArrayList<Producto> productos;
	
	//Costructores
	public Pedido(String NroPedido, Cliente cliente) {		
		
		this.NroPedido = NroPedido;
		this.Cliente = cliente;	
		this.productos = new ArrayList<Producto>() ;
		
	}
	
	//Getters y Setters
	
	public String getNroPedido() {
		return NroPedido;
	}
	
	public void setNroPedido(String NroPedido) {
		this.NroPedido=NroPedido;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}		

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public ArrayList<Producto> dameProductos() {
		return productos;
	}
	
	public String mostrarProductos() {
		String aux = "";
		for (Producto a : productos) {
			aux= aux +"\n "+ a.toString();
		}
		return aux;
	}
	
	public String toString() {
		String aux = "";
		for (Producto a : productos) {
			aux= aux +"\n "+ a.toString();
			
		}		
		return aux+"\n "+" Nro. de pedido: "+this.NroPedido+" "+this.Cliente.toString();
	}
}
