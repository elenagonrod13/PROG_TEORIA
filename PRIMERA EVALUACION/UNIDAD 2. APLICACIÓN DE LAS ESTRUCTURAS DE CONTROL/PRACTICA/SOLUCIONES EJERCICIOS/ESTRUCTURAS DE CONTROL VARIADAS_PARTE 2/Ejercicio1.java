package EstructurasControlParte2;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		int nPiezas,cont=1,pAptas=0;
		float longitudPieza;
		Scanner teclado=new Scanner(System.in);
		System.out.print ("Ingresar número de piezas a procesar: ");
		nPiezas=teclado.nextInt();
		while (cont<=nPiezas) {			
		     System.out.print ("Ingresar la longitud de la pieza "+cont+": ");
			longitudPieza=teclado.nextFloat();
			if (longitudPieza<=1.30f && longitudPieza>=1.20f)
			pAptas= pAptas+1;
		     cont=cont+1; 
		 }
		    System.out.println ("El Numero de Piezas aptas fueron: "+pAptas);
	}


}


