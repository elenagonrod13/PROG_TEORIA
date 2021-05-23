package matrices;
import java.util.*;
public class Diagonales {
	Scanner tecla=new Scanner(System.in);
	final int N =3;
	final int M=2;
		
	public Diagonales() {
		int [][] primera;
		int [][] segunda;
		primera=cargar();
		segunda=crear(primera);
		System.out.println("Matriz inicial");
		visualizar(primera);
		System.out.println("Matriz resultado");
		visualizar(segunda);
	}
	
	public int[][] cargar() {	
		int [][] primera=new int[N][N];
		System.out.println("Cargar los elementos de la matriz");
		for (int infil=0; infil< primera.length; infil++)
			for (int incol=0; incol<primera[infil].length;incol++){
				System.out.print("\n [ "+infil+","+incol+" ]: ");
				primera[infil][incol]=tecla.nextInt();			
			}
		return primera;
	}
	
		
	public int[][] crear(int[][]primera) {			
		int [][] segunda=new int[M][N];
		for (int incol=0; incol<primera[0].length;incol++) {
			segunda[0][incol]=primera[incol][incol];		
			segunda[1][incol]=primera[incol][primera.length-1-incol];			
		}
		return segunda;		
	}
	
	public void visualizar(int [][]matriz){
		for (int infil=0; infil< matriz.length; infil++){	
			for (int incol=0; incol<matriz[infil].length;incol++)
				System.out.print(matriz[infil][incol]+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Diagonales interfaz=new Diagonales();			
	}

}
