package vectores_objetos_parte2_aeropuerto;
import java.util.*;
public class Aeropuerto {
	static Scanner tecla=new Scanner(System.in);
	private String ciudad;
	private int numVuelos;
	private Vuelos[] vec;
	private int posicion;//Donde se va a colocar cada vuelo
	
	public Aeropuerto (String ciudad, int num){
		this.ciudad=ciudad;
		numVuelos=num;
		vec=new Vuelos[numVuelos];
		posicion=0;
	}
	
	public void a�adirVuelo(){		
		if(posicion <vec.length){
			vec[posicion]=leerDatos();
			posicion++;
		}
		else
			System.out.println("Aeropuerto lleno. No se pueden gestionar m�s vuelos");
	 }
	
	public Vuelos leerDatos() {
		String nvuelo,dest,comp;
		System.out.println("Meter n�mero de vuelo");
		nvuelo=tecla.next();
		System.out.println("Meter destino");
		tecla.nextLine();
		dest=tecla.nextLine();
		System.out.println("Meter compa��a");
		comp=tecla.nextLine();
		Vuelos plane = new Vuelos(nvuelo,dest,comp);
		return plane;
	}

	public void borrarVuelo(){
		String numVuelo;
		String resp;
		int posEncontrado;
		if(posicion==0)
			System.out.println("No existe ning�n vuelo");
		else {
		   System.out.println("Meter vuelo a eliminar");
		   numVuelo=tecla.next();
		   posEncontrado=buscarVuelo(numVuelo);		 
		   if(posEncontrado < posicion) {
			   System.out.println("�Est� seguro de que quiere elminar?(SI/NO)");
			   resp=tecla.next();
			   if(resp.equalsIgnoreCase("si")){
			   for(int cont=posEncontrado;cont<posicion-1;cont++)
				   vec[cont]=vec[cont+1];			      
			   	posicion--;
			    vec[posicion]=null;/*No ser�a necesario poner la instrucci�n, porque nunca se 
			    visualizar�a el �ltimo vuelo. Se puede poner si se quiere que el �ltimo vuelo 
			    no est� apuntado por dos punteros*/
			  }
		   }
 	  	  else
			System.out.println("No existe vuelo");
		}
	}
	
	public int buscarVuelo(String numVuelo){
		boolean encontrado=false;
		int cont=0;	
		while ((cont<posicion) && (!encontrado)){
		  if (vec[cont].getNvuelo().equals(numVuelo)){
			encontrado=true;			
			System.out.println("Vuelo: "+vec[cont].getNvuelo()+" Compa�ia: "+vec[cont].getCompania()+" Destino: "
			+vec[cont].getDestino());
		  }
		  else
			cont++;
		}
	
		return cont;
	}
	
	public void visualizarDatos() {
		if(posicion==0)
		  System.out.println("No hay ning�n vuelo registrado");
		else
		  for(int indice=0;indice<posicion;indice++){
		     System.out.println(vec[indice].getNvuelo()+" 	"
                +vec[indice].getDestino()+" "+vec[indice].getCompania());
		}
	}

}
