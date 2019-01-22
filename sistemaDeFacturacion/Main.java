package sistemaDeFacturacion;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		//ArrayList que guardan las facturas y notas de credito
		ArrayList<Factura> facturas = new ArrayList<Factura>();
		ArrayList<NotaDeCredito> notasDeCredito = new ArrayList<NotaDeCredito>();
		
		//instanciar objetos cliente
		Cliente c1 = new Cliente("0001","Uspallata 2155","X","DNI",376439868);
		Cliente c2 = new Cliente("0002","Calle falsa 123","A","DNI",326839268);
		Cliente c3 = new Cliente("0003","AV.caseros 2467","B","DNI",302334867);
		Cliente c4 = new Cliente("0004","Matheu 1540","X","DNI",376439868);
		
		//instanciar objetos producto
		Producto p1 = new Producto("1654","Smart TV LG 49´",21000.00,1);
		Producto p2 = new Producto("6543","Notebook Acer i5",15000.00,4);
		Producto p3 = new Producto("7842","SmartPhone Samsung S9",28000.00,7);
		Producto p4 = new Producto("1245","Horno Microondas Atma 20 Litros ",4300.00,8);
		Producto p5 = new Producto("8734","Pava Electrica Ultracomb 1.8 Litr",1500.00,2);
		Producto p6 = new Producto("8434","Camara Deportiva 4k Go Action Pro 16mpx",1400.00,1);
		Producto p7 = new Producto("0984","Memoria Micro Sd 32gb Clase 10 Kingston",300.00,2);
		
		
		
		//instancio objeto pedidos
		Pedido pedido1 = new Pedido("01",c1);
		Pedido pedido2 = new Pedido("02",c2);
		Pedido pedido3 = new Pedido("03",c3);
		Pedido pedido4 = new Pedido("04",c4);
		Pedido pedido5 = new Pedido("05",c2);
		
				
		//realizo pedido de productos
		pedido1.agregarProducto(p2);
		pedido1.agregarProducto(p3);
		pedido1.agregarProducto(p1);
		pedido2.agregarProducto(p7);
		pedido2.agregarProducto(p1);
		pedido2.agregarProducto(p4);
		pedido2.agregarProducto(p2);
		pedido2.agregarProducto(p5);
		pedido2.agregarProducto(p3);
		pedido3.agregarProducto(p3);
		pedido3.agregarProducto(p4);
		pedido3.agregarProducto(p1);
		pedido3.agregarProducto(p6);
		pedido4.agregarProducto(p2);
		pedido4.agregarProducto(p7);
		pedido5.agregarProducto(p1);
		pedido5.agregarProducto(p2);
		pedido5.agregarProducto(p3);
		pedido5.agregarProducto(p4);
		pedido5.agregarProducto(p5);
		pedido5.agregarProducto(p6);
		pedido5.agregarProducto(p7);	
		
		//instancio objeto factura
		Factura f1 = new Factura(pedido1,"19/01/2019","01");
		Factura f2 = new Factura(pedido2,"12/01/2019","02");
		Factura f3 = new Factura(pedido3,"09/01/2019","03");
		Factura f4 = new Factura(pedido4,"01/01/2019","04");
		Factura f5 = new Factura(pedido5,"20/01/2019","05");
		Factura f6 = new Factura(pedido2,"08/01/2019","06");
		Factura f7 = new Factura(pedido3,"10/01/2019","07");
		Factura f8 = new Factura(pedido2,"07/01/2019","08");
		Factura f9 = new Factura(pedido4,"06/01/2019","09");
		Factura f10 = new Factura(pedido5,"17/01/2019","10");
		
		
		//Agrego factura a arraylist
		facturas.add(f1);
		facturas.add(f2);
		facturas.add(f3);
		facturas.add(f4);
		facturas.add(f5);
		facturas.add(f6);
		facturas.add(f7);
		facturas.add(f8);
		facturas.add(f9);
		facturas.add(f10);		
		
		//imprimo factura 
		
		for (Factura a : facturas) {
			a.imprimirFactura();
		}
		
		//operacion del dia
		for (Factura a : facturas) {
			a.operacionDelDia();
		}
		
		//instancio objeto Nota de credito			
		NotaDeCredito notacred1= new NotaDeCredito(pedido1,"22/01/2019","01","254");
		NotaDeCredito notacred2= new NotaDeCredito(pedido2,"02/01/2019","01","002");
		NotaDeCredito notacred3= new NotaDeCredito(pedido3,"12/01/2019","01","154");
		NotaDeCredito notacred4= new NotaDeCredito(pedido4,"07/01/2019","01","789");
		NotaDeCredito notacred5= new NotaDeCredito(pedido5,"15/01/2019","01","067");
		notasDeCredito.add(notacred1);
		notasDeCredito.add(notacred2);
		notasDeCredito.add(notacred3);
		notasDeCredito.add(notacred4);
		notasDeCredito.add(notacred5);
		
		//imprimo notas de credito
		
		for ( NotaDeCredito a : notasDeCredito) {
			a.imprimirNotaDeCredito();
		}
		
		//elimino facturas y notas de credito
		
		facturas.remove(f2);
		notasDeCredito.remove(notacred3);
		
		//imprimo factura 
		
		for (Factura a : facturas) {
			a.imprimirFactura();
		}
				
		//operacion del dia
		for (Factura a : facturas) {
			a.operacionDelDia();
			}
		
		//imprimo notas de credito
				
		for ( NotaDeCredito a : notasDeCredito) {
			a.imprimirNotaDeCredito();
		}
		
		}
	}



