package vectores_parte1;
import java.util.*;
public class Ejercicio4 {
	Scanner tecla = new Scanner (System.in);
	  private final int TAMA�O1=5;
	  private final int TAMA�O2=3;	 			
	  public Ejercicio4(){
		int[] vec1=new int[TAMA�O1];
		int[] vec2=new int[TAMA�O2];
		System.out.println("Vamos a cargar el primer vector ");
		cargar(vec1);
		System.out.println("Vamos a cargar el segundo vector ");
		cargar(vec2);
		System.out.println("El primer vector es: ");
		visualizar(vec1);
		System.out.println("El segundo vector es: ");
		visualizar(vec2);
		buscar(vec1,vec2);
	 }
	 public void cargar (int [] vec){
		for ( int cont=0;cont<vec.length;cont++){
			System.out.println("Meter el n�mero de la posici�n "+cont);
			vec[cont]=tecla.nextInt();
		}
	}
		
	public void buscar (int[] vec1,int []vec2){
		int sw;
		int recorr1,recorr2;
		for (recorr1=0;recorr1<vec1.length;recorr1++){
			recorr2=0;
			sw=0;//si est� a 0 significar� que no existe
			while((recorr2<vec2.length)&&(sw==0)){
				if(vec1[recorr1]==vec2[recorr2]){
				  sw=1;
				  System.out.println("El n�mero "+vec1[recorr1]+" est� en la posici�n "+recorr2);
				}
				else
				  recorr2++;
			}
			if (sw==0)
				System.out.println("El n�mero "+vec1[recorr1]+" no existe"); 
		} 
	}
	
	public void visualizar (int [] vec){
			for ( int valor:vec)
				System.out.print(valor+" ");
			System.out.println();
		}

	public static void main(String[] args){
			Ejercicio4 interfaz=new Ejercicio4();
	}
}
