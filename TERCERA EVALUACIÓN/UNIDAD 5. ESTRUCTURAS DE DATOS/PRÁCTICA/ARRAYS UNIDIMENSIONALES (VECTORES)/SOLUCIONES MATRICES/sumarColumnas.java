package matrices;
import java.util.*;
public class sumarColumnas {
	Scanner tecla=new Scanner(System.in);
	final int FILAS =4;
	final int COLUMNAS=3;
	final int LONG=2;
		
	public sumarColumnas() {
		int[][]primera=new int[FILAS][COLUMNAS];
		int[] vec;
		cargar(primera);
		vec=sumar(primera);
		visualizar(primera,vec);
	}
	
	public void cargar (int[][]primera){
		for (int infil=0; infil< primera.length; infil++)
			for (int incol=0; incol<primera[infil].length;incol++){
				System.out.print("\n [ "+infil+","+incol+" ]: ");
				primera[infil][incol]=tecla.nextInt();
			}
	}	
		
	public int[] sumar(int[][] primera){
		int[] vec=new int[LONG];
		int suma;		
		for (int incol=0; incol<primera[0].length;incol++){				
			suma=0;
			for (int infil=0; infil< primera.length; infil++)
				suma=suma+primera[infil][incol];
			if(suma>20)
				vec[0]=vec[0]+1;
			else
				if(suma<20)
					vec[1]=vec[1]+1;
		}			
			return vec;
	}
	

	public void visualizar(int[][]primera,int[]vec){
		System.out.println("Matriz");
		for (int infil=0; infil< primera.length; infil++){		
			for (int incol=0; incol<primera[infil].length;incol++)
				System.out.print(primera[infil][incol]+" ");
			System.out.println();
		}
		System.out.println("Número de columnas que sumaron más de 20: "+vec[0]);
		System.out.println("Número de columnas que sumaron menos de 20: "+vec[1]);
	}

	public static void main(String[] args) {
	
		sumarColumnas interfaz=new sumarColumnas();
	}

}
