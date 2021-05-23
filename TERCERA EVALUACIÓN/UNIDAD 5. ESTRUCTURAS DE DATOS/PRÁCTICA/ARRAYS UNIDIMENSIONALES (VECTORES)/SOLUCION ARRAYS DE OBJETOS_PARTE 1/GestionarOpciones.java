package vectores_objetos_parte1;
import java.util.Scanner;
public class GestionarOpciones {
	Scanner tecla=new Scanner (System.in);
	final int TAMAÑO=4;
	InfGeneral[] vec1=new InfGeneral[TAMAÑO]; //Reservamos memoria para el segundo vector
	public InfoGeneralOpcion[] cargar() {		
		//Reservamos memoria para el primer vector
		InfoGeneralOpcion[] vec =new InfoGeneralOpcion[TAMAÑO]; 
		// Cargamos todas las posiciones del primer vector
		for(int indice=0; indice<vec.length; indice++){
			vec [indice]=leerDatos();			
		}
		return vec;
	}	
	public InfoGeneralOpcion leerDatos() {
		String matri,nomb;
		char opc;
		System.out.println("Meter nombre");
		nomb=tecla.next();
		System.out.println("Meter matrícula");
		matri=tecla.next();
		do {
			System.out.println("Meter opción");
			opc=tecla.next().charAt(0);
		} while ((opc!='a')&&(opc!='A')&&(opc!='b')&&(opc!='B')
		 &&(opc!='m')&&(opc!='M'));
		InfoGeneralOpcion dato =new InfoGeneralOpcion(nomb,matri,opc);
		return(dato);
	}	
	public int pasar (InfoGeneralOpcion[] vec) {		
		  int indVec1=0;
		  //Recorremos el primer vector 
		  for(int indVec=0; indVec<vec.length; indVec++) {
			// Si la opción es una A
			if(vec[indVec].getOpc()=='A'||vec[indVec].getOpc()=='a') {
			//Cargamos en el segundo vector el nombre y la matrícula
			  vec1[indVec1]=new InfGeneral(vec[indVec].getNombre(),vec[indVec].getMatricula());
			  indVec1++;
			}
			else													 
				
				if(vec[indVec].getOpc()=='M'||vec[indVec].getOpc()=='m') {
				//Si la opción es una M, modificamos el nombre y cargamos en el segundo vector el nombre modificado y la matrícula
				System.out.println("Meter nuevo nombre");
				String nuevoNombre=tecla.next();	
		   		vec1[indVec1]=new InfGeneral (nuevoNombre,vec[indVec].getMatricula());
				indVec1++;
			}
		}
		return (indVec1);		
	   }
			
	public void visualizar(int tamRealVec1,InfoGeneralOpcion[] vec) {
		System.out.println("Primer vector ");
		for(InfoGeneralOpcion elemento:vec)
			System.out.println(elemento.getNombre()+" "+elemento.getMatricula()+" "+elemento.getOpc());
		System.out.println("Vector resultado ");
		for(int indice=0;indice<tamRealVec1;indice++)
			 System.out.println(vec1[indice].getNombre()+" "+vec1[indice].getnMatricula());
	}
}
