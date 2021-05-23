package matrices;
import java.util.*;
public class Asignaturas {
	Scanner tecla=new Scanner(System.in);
	final int FILAS =3;
	final int COLUMNAS=5;
	
	public Asignaturas() {
		String[] modulos;
		float [][] notas=new float[FILAS][COLUMNAS];
		modulos=cargarVector();
		cargarMatriz(notas,modulos);		
		visualizar(modulos,notas);
	}
	public void cargarMatriz(float[][]notas,String[]modulos){
		for (int infil=0; infil< notas.length; infil++) {			
			System.out.println("\n"+modulos[infil]);
			for (int incol=0; incol< notas[infil].length;incol++){
				System.out.print("\n Introduce nota: ");
				notas[infil][incol]=tecla.nextFloat();					
			}
		}
	}
	
	public String[] cargarVector(){
		String[] asig= new String[FILAS];		
		for (int infil=0; infil< asig.length; infil++){
			System.out.println("Meter módulo "+(infil+1));
			asig[infil]=tecla.nextLine();
		}
		return asig;
	}
	
	public void visualizar(String [] asig,float[][]notas) {
		int aprob;
		for (int infil=0; infil< notas.length; infil++){
			aprob=0;
			for (int incol=0; incol< notas[infil].length;incol++)
				if(notas[infil][incol]>=5)
					aprob++;
			System.out.println("\n Del módulo "+asig[infil]+ " aprobaron "+aprob);					
		}
	}
	public static void main(String[] args){
		
		Asignaturas interfaz=new Asignaturas();
		
	}

}
