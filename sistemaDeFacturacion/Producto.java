package sistemaDeFacturacion;

public class Producto {
	//Atributos
	private String Codigo;
	private String Nombre;
	private double Precio;
	private int cantidad;
	
	//Constructores
	public Producto(){
	 this.Codigo="";
	 this.Nombre="";
	 this.Precio=0;	
	 this.setCantidad(0);
	}
	
	public Producto(String Codigo, String Nombre, double Precio,int cantidad) {
		this.Codigo=Codigo;
		this.Nombre=Nombre;
		this.Precio=Precio;
		this.setCantidad(cantidad);
	}
	
	//Getters y Setters
	
	public String getCodigo() {
		return Codigo;
	}
	
	public void setCodigo(String Codigo) {
		this.Codigo=Codigo;
	}

	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre=Nombre;
	}
	
	public double getPrecio() {
		return Precio;
	}
	
	public void setPrecio(double Precio) {
		this.Precio=Precio;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String toString() {
		return "Codigo: "+this.Codigo+"  Cantidad: "+this.cantidad+"  Nombre: "+this.Nombre+"  Precio: "+this.Precio;
	}
}
