package vectores_objetos_parte2_almacen;
import java.util.*;
public class Almacen {
	Scanner tecla=new Scanner(System.in);
	private int capacidad;
	private Producto[]existencias;
	
	public Almacen(int espacio){
		capacidad=espacio;
		existencias=new Producto[capacidad];
	}
	
	public void llenarAlmacen(){		
	  char resp;
	  int id;
	  float precio; 
	  String descripcion;
	  for(int pos=0;pos<existencias.length;pos++){
		System.out.println("Meter id");
		id=tecla.nextInt();
		tecla.nextLine();
		System.out.println("Meter descripción");
		descripcion=tecla.nextLine();
		System.out.println("Meter precio");
		precio=tecla.nextFloat();
		System.out.println("¿Es un producto en oferta (S/N)?");
		resp=tecla.next().charAt(0);
		if((resp=='S')||(resp=='s')){
		  System.out.println("Meter descuento para el producto");
		  float descuento=tecla.nextFloat();
	 	  existencias[pos]= new  ProdOferta(id,precio,descripcion,descuento);
		}
		else
		  existencias[pos]=new Producto(id,precio,descripcion);
	  }
	}
	
	public void buscarProducto(int id){       
        int indice = 0; 
        boolean encontrado=false;
        while((indice<existencias.length)&&(!encontrado))
         if (existencias[indice].idProd == id) 								
             encontrado=true;
         else
        	 indice++;

      //Analiza el resultado de la búsqueda
        
        if (encontrado)
          visualizar(existencias[indice]);
        else
        	System.out.println("El producto no existe");
	}	
	

	public void visualizar(Producto obj) {
		 System.out.println("Por el producto "+obj.toString()+" tengo que pagar "+obj.calcularPrecio()+" euros");
	}

}
