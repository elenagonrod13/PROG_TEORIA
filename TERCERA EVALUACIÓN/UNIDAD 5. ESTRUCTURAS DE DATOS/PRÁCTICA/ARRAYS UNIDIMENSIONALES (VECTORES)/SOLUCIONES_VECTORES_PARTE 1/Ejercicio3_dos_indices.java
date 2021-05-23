package vectores_parte1;
import java.util.*;
public class Ejercicio3 {
	Scanner tecla = new Scanner (System.in);
	  private final int TAMAÑO=5;	 	
	public Ejercicio3(){		
	 int []vec1;
	 int []vec2;
	 int []vecFinal=new int[TAMAÑO];
	 System.out.println("Vamos a cargar el primer vector ");
	 vec1=cargar();
	 System.out.println("Vamos a cargar el segundo vector ");
	 vec2=cargar();
	 for(int rec1=0,rec2=(vec2.length)-1;rec1<vec1.length;rec1++,rec2--){
			vecFinal[rec1]=multiplicar(vec1[rec1],vec2[rec2]);
	}
	 System.out.println("El primer vector es: ");
	 visualizar(vec1);
	 System.out.println("El segundo vector es: ");
	 visualizar(vec2);
	 System.out.println("El vector resultado es: ");
	 visualizar(vecFinal);
	}
		
	public int[] cargar(){
		int[] vector=new int[TAMAÑO];
	 for ( int cont=0;cont<vector.length;cont++){
		System.out.println("Meter un número");
		vector[cont]=tecla.nextInt();
	 }
	 return vector;
	}

	public int multiplicar (int num, int num1){
		return num*num1;
	}
		


	public void visualizar (int [] vec){
		for (int cont=0;cont<vec.length;cont++)
			 System.out.print(vec[cont]+" ");
		System.out.println();
	}

	public static void main(String[] args){
		new Ejercicio3();
	}
}
