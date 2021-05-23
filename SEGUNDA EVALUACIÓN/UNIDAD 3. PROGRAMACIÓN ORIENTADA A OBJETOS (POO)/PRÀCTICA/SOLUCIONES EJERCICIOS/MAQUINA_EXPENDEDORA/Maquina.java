package poo_maquinaExpendedora;
import java.util.*;
public class Maquina {
	final String PRODUCTO="pañuelos";
	final int PRECIO=90;
	private int monedero;
	private int existencias;	
	private float ganancias;
          
     public Maquina() {
    	 monedero=0;
    	 setExistencias(0);
    	 ganancias=0;
     }
	
	public Maquina(int existencias) {	
		this();
		setExistencias(existencias);			
	}

	public int getMonedero() {

		return monedero;
	}
	
	public int getExistencias() {

		return existencias;
	}
	public int getPrecio() {

		return PRECIO;
	}	
	
	public String getProducto() {
		return PRODUCTO;
	}
	public float getGanancias() {

		return ganancias;
	}	
	
	public void setMonedero (int valor) {
		monedero=valor;
	}
	public void setGanancias (float ganancias) {
		this.ganancias=ganancias;
	}
	public void setExistencias(int existencias) {
		
		this.existencias=Math.abs(existencias);
	}

	public void tragarMoneda(){		
			int moneda=0;	
			System.out.println("Se aceptan monedas de 10, 20 y 50 céntimos");
			while(monedero < PRECIO) {
				System.out.println("Faltan "+(PRECIO-monedero)+" céntimos");
				do {
					System.out.println("Meter moneda");
					moneda=teclado.nextInt();
				} while(moneda!=10 && moneda!=20 && moneda!=50);
			monedero=monedero+moneda;
			}		
	}	
	
	public void vender() {
		//Si no hay existencias devuelve las monedas tragadas
		if(existencias>0) {
			System.out.println("Recoger paquetes de pañuelos");
			existencias--;	
			monedero=monedero-PRECIO; //monedero-=PRECIO;
			ganancias=ganancias+PRECIO;	// ganancias+=PRECIO;
			
		}
	}
	
	public void devolverMonedas() {		
		System.out.println("Recoger: "+monedero+" céntimos");
		monedero=0;
			
	}
	
	public String toString() {
		return(" Estado actual de la máquina: "+"\n Producto: "+PRODUCTO+"\n Existencias: "+existencias+"\n Precio: "+PRECIO+" céntimos\n Ganancias:"+ganancias/100);
	}


}
