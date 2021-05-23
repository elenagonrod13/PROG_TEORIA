package vectores_objetos_parte2_almacen;
import java.util.*;
public class Producto {
	protected int idProd;
	protected float precio;
	protected String descripcion;
	
	public Producto (int id, float precio, String descrip){
		idProd=id;
		this.precio=precio;
		descripcion=descrip;
	}
	
	public float calcularPrecio(){

		return precio;
	}
	
	public String toString(){

		return "Id:"+idProd+" Descripción: "+descripcion;
	}

}
