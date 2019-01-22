package sistemaDeFacturacion;

public class Cliente {
	//Atributos de clase
	private String	 NroCliente;
	private String Domicilio;
	private String CondicionImpositiva;
	private String TipoDocumento;
	private int NroDocumento;
	
	//Constructores
	public Cliente() {
		this.NroCliente="";
		this.Domicilio="";
		this.CondicionImpositiva="";
		this.TipoDocumento="";
		this.NroDocumento=0;		
	}
	
	public Cliente(String NroCliente, String Domicilio, String CondicionImpositiva, String TipoDocumento, int NroDocumento) {
		this.NroCliente=NroCliente;
		this.Domicilio=Domicilio;
		this.CondicionImpositiva=CondicionImpositiva;
		this.TipoDocumento=TipoDocumento;
		this.NroDocumento=NroDocumento;		
	}
	
	//Getters y setters
	
	public String getNroCliente() {
		return NroCliente;
	}
	
	public void setNroCliente(String NroCliente) {
		this.NroCliente=NroCliente;
	}
	
	public String getDomicilio() {
		return Domicilio;
	}
	
	public void setDomicilio(String Domicilio) {
		this.Domicilio=Domicilio;
	}

	public String getCondidcionImposistiva() {
		return CondicionImpositiva;
	}
	
	public void setCondicionImposistiva(String CondicionImpositiva) {
		this.CondicionImpositiva=CondicionImpositiva;
	}
	
	public String getTipoDomcumento() {
		return TipoDocumento;
	}
	
	public void setTipoDocumento(String TipoDocumento) {
		this.TipoDocumento=TipoDocumento;
	}
	
	public int getNroDocumento() {
		return NroDocumento;
	}
	
	public void setNroDocuemnto(int NroDocumento) {
		this.NroDocumento=NroDocumento;
	}	
	
	//metodo toString
	public String toString() {
		return "Nro. de Cliente: "+this.NroCliente+" Domicilio: "+this.Domicilio+" Condicíon impositiva: "+this.CondicionImpositiva+
				" Tipo de documento: "+this.TipoDocumento+" Nro. de documento: "+this.NroDocumento;
	}
	
}
