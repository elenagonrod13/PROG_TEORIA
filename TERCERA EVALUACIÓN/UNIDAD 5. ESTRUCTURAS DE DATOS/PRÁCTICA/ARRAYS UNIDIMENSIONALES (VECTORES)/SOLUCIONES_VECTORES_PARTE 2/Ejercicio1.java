package vectores_parte2;
import java.util.*;
public class Ejercicio1 {
	private Scanner src=new Scanner(System.in);
	private final int TAMAÑO=7;
	public Ejercicio1() {
		int num=0;
		int []vec1;
		vec1=cargar();
		ordenar(vec1);
		visualizar(vec1);
		num=meter_numero();
		buscar(num,vec1);
	}
	
	public int[] cargar(){
		int[] vector=new int[TAMAÑO];
		for(int i=0;i<vector.length;i++){
			System.out.println("Meter número");
			vector[i]=src.nextInt();
		}
		return vector;
	}
		
	public void ordenar(int[]vec1){
		Arrays.sort(vec1);
	}

	public int meter_numero(){
		int num;
		do{
			System.out.println("Meter número entre 3 y 10 ");
			num=src.nextInt();	
		}while(num<3 || num >10);
		return num;
	}
	
	public void buscar(int num, int[] vec1){
		int indice=0, sw=0;
		while(indice<vec1.length && sw==0) {
            if (vec1[indice] >= num) 
               sw=1;
            else
            	indice++;
		}
         //Analiza el resultado de la búsqueda
           if ((sw==1) && (vec1[indice] == num))
              System.out.println(num+" está en la posición "+ indice);
                        
            else 
              System.out.println (num+" no existe en el vector");
       }

	
	public void visualizar (int []vec1){
			for ( int elemento:vec1)
				System.out.print(elemento+" ");
			System.out.println();
	}

	public static void main(String[] args){

		Ejercicio1 interfaz=new Ejercicio1();
	}
}
