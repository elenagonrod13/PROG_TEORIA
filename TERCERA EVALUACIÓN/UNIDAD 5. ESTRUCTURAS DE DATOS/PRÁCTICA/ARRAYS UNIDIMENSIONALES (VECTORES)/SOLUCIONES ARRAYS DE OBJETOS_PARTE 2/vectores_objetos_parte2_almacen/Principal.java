package vectores_objetos_parte2_almacen;
import java.util.*;
public class Principal {
	  Scanner tecla=new Scanner (System.in);
	  public Principal() {
		int id, capacidad;
		System.out.println("Capacidad del almacén");
		capacidad=tecla.nextInt();
	    Almacen miAlmacen =new Almacen(capacidad);
	    miAlmacen.llenarAlmacen();
	    System.out.println("¿Quieres buscar un producto? (SI/NO)");
	    String resp=tecla.next();
	    while(resp.equalsIgnoreCase("SI")){
			System.out.println("Meter el identificador del producto");
			id=tecla.nextInt();
			miAlmacen.buscarProducto(id);
			System.out.println("¿Quieres buscar un producto? (SI/NO)");
			resp=tecla.next();
		}
			
	  }

	 public static void main(String[] args){			
	  Principal interfaz=new Principal();			
	}
}
