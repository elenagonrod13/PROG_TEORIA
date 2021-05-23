package metodos_parte2;
import java.util.*;
public class Ejercicio1 {
	public static void main(String[] args){       
       int posicion= meterPosicion();
       calcularNumero(posicion);	     
  }

  public static int meterPosicion() {
     Scanner src = new Scanner (System.in);
     int pos=0;
     do {
     System.out.println("Meter posición mayor o igual a 0");
     pos=src.nextInt();
     }while (pos<=0);
     return pos; 
   }
       
  public static void calcularNumero (int posicion) {	 
	   if (posicion==1)
		   System.out.println("El numero que está en la posición "+ posicion+" es 0");
	   else
		   if(posicion==2)
			   System.out.println("El numero que está en la posición "+ posicion+" es 1");	
		   else {	
			   int anterior1=0, anterior2=1;
			   int  contador=3;
			   int siguiente=0;
			   while (contador<=posicion) {
				   siguiente=anterior1+anterior2;  	        
				   anterior1=anterior2;
				   anterior2=siguiente;	       
				   contador++;
			   }
			   System.out.println("El número que ocupa la posición "+posicion+" es: "+siguiente);
		   }
   }

}
