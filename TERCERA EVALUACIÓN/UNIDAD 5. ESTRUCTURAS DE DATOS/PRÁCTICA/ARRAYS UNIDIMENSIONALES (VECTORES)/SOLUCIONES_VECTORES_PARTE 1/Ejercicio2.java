package vectores_parte1;
import java.util.*;
public class Ejercicio2 {
	Scanner src=new Scanner (System.in);
	public Ejercicio2() {
		int tama�o;
		int []vec;
		int []vecFinal;
		tama�o=leerTama�o();
		vec=cargarVector(tama�o);
		vecFinal=crearVector(vec,tama�o);
		System.out.println("El primer vector es: ");
		visualizarVector(vec);
		System.out.println("El vector resultado es: ");
		visualizarVector(vecFinal);
	}

	public int leerTama�o() {
		int tam;
		do {
			System.out.println("Meter tama�o del vector");
			tam=src.nextInt();
		} while(tam % 2!=0);
		return tam;
	}
	
	public int[] cargarVector (int tama�o){		
		int[] vec=new int[tama�o];
		for ( int cont=0;cont<vec.length;cont++){
			System.out.println("Meter un n�mero");
			vec[cont]=src.nextInt();
		}
		return vec;
	}
	
	public int[] crearVector(int[] vec,int tama�o){
		int[] vecFinal=new int[tama�o];
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
