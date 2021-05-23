package matrices;
import java.util.*;
public class Ejercicio1 {
	private Scanner tecla=new Scanner(System.in);
	final int FILAS =2;
	final int COLUMNAS=3;
		
	public Ejercicio1() {
		int [][] matriz;
		int [] vec;
		matriz=cargar();
		vec=sumar(matriz);
		visualizar(matriz,vec);
	}
	
	public int[][] cargar (){
		int [][] matriz=new int[FILAS][COLUMNAS];
		System.out.println("Cargar los elementos de la matriz");
		for (int infil=0; infil< matriz.length; infil++)
			for (int incol=0; incol<matriz[infil].length;incol++){
				System.out.print("\n [ "+infil+","+incol+" ]: ");
				matriz[infil][incol]=tecla.nextInt();
									
			}
		return matriz;
	}
	
	public int [] sumar(int[][]matriz){
		int [] vec=new int [FILAS];
		for (int infil=0; infil< matriz.length; infil++)			
			for (int incol=0; incol<matriz[infil].length;incol++)
				vec[infil]=vec[infil]+matriz[infil][incol];		
		return vec;
	}
	
	public void visualizar(int[][]matriz,int[]vec){
		System.out.println("Matriz");
		for (int infil=0; infil< matriz.length; infil++){						
			for (int incol=0; incol<matriz[infil].length;incol++)
				System.out.print(matriz[infil][incol]+" ");
			System.out.println();
		}
		System.out.println("Suma de las filas");
		for (int infil=0; infil< matriz.length; infil++)
			System.out.print(vec[infil]+" ");
	}


	public static void main(String[] args){
		
		Ejercicio1 interfaz=new Ejercicio1();
		
	}
}
