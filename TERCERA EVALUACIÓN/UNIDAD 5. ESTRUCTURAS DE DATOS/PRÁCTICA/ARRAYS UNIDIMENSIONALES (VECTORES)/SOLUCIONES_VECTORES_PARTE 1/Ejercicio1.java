package vectores_parte1;
import java.util.*;
public class Ejercicio1 {
	Scanner src=new Scanner (System.in);
	final int TAMAÑO= 5;
	public Ejercicio1() {
		int [] v1;
		int [] v2;
		int [] v3;
		System.out.println("Vamos a cargar el primer vector");
		v1=cargarVector();
		System.out.println("Vamos a cargar el segundo vector");
		v2=cargarVector();
		v3=sumarVectores (v1,v2);
		System.out.println("Primer vector");
		visualizarVector(v1);
		System.out.println("\nSegundo vector");
		visualizarVector(v2);
		System.out.println("\nVector suma");
		visualizarVector(v3);
	}
	
	public int[]cargarVector(){
	 int[]vector=new int[TAMAÑO];
	 for(int indice=0; indice<vector.length;indice++){
		System.out.println("Meter número en posición [ "+indice+" ]");
		vector[indice]=src.nextInt();
	  }
	 return(vector);
	}
	
	public int[] sumarVectores (int[]v1,int[]v2){
	   int[]v3=new int[TAMAÑO];
	   for(int indice=0;indice<v3.length;indice++)
		v3[indice]=v1[indice]+v2[indice];
	   return(v3);
	}
	


	public void visualizarVector(int[]v3){
		for(int indice=0;indice<v3.length;indice++)
		System.out.print(v3[indice]+" ");		
	}
	
	public static void main(String[] args){
		
		new Ejercicio1();
	}

}
