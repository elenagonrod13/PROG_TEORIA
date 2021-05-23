package vectores_parte1;
import java.util.*;
public class Ejercicio2 {
	Scanner src=new Scanner (System.in);
	public Ejercicio2() {
		int tamaño;
		int []vec;
		int []vecFinal;
		tamaño=leerTamaño();
		vec=cargarVector(tamaño);
		vecFinal=crearVector(vec,tamaño);
		System.out.println("El primer vector es: ");
		visualizarVector(vec);
		System.out.println("El vector resultado es: ");
		visualizarVector(vecFinal);
	}

	public int leerTamaño() {
		int tam;
		do {
			System.out.println("Meter tamaño del vector");
			tam=src.nextInt();
		} while(tam % 2!=0);
		return tam;
	}
	
	public int[] cargarVector (int tamaño){		
		int[] vec=new int[tamaño];
		for ( int cont=0;cont<vec.length;cont++){
			System.out.println("Meter un número");
			vec[cont]=src.nextInt();
		}
		return vec;
	}
	
	public int[] crearVector(int[] vec,int tamaño){
		int[] vecFinal=new int[tamaño];
		for (int rec1=0;rec1<vec.length;rec1++){
			if(rec1%2==0)
				vecFinal[rec1+1]=vec[rec1]*6;
			else
				vecFinal[rec1-1]=vec[rec1]+2;
		}
		return vecFinal;
	}
	
	public void visualizarVector (int [] vec){
			for ( int cont=0;cont<vec.length;cont++)
				System.out.print(vec[cont]+" ");
			
		System.out.println();
	}
	
	public static void main(String[] args){
		new Ejercicio2();		
	}

}
