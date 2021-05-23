package vectores_parte2;
import java.util.*;
public class Urnas {
	Scanner tecla = new Scanner (System.in);
	final int TAMA�O=49;
	public Urnas() {
		int [] vec1=new int[TAMA�O];
		int bola;
		System.out.println("�Sacamos una bola?");
		String resp=tecla.next();
		while(!resp.equalsIgnoreCase("NO")){
			bola=sacar_bola(vec1);
			vec1[bola]=vec1[bola]+1;
			System.out.println("�Sacamos una bola?");
			 resp=tecla.next();
		}
		visualizar(vec1);
	}
public int sacar_bola(int [] vec1){
		
		return (int)(Math.random()*vec1.length);
		
	}
	
	
	public void visualizar (int[]vec1){
			for ( int cont=0; cont<vec1.length;cont++)	
				System.out.println(" La bola n�mero "+cont+" sali� "+vec1[cont]+" veces");
		
	}

	public static void main(String[] args){
		
		Urnas interfaz=new Urnas();		
	}
}
