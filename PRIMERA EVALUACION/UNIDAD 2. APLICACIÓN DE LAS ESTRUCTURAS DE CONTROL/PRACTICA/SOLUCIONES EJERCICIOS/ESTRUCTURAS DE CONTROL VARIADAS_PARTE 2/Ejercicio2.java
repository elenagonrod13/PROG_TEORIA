package EstructurasControlParte2;
import java.util.*;
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero;
		System.out.print ("Ingresar n�mero:  ");
		numero=teclado.nextInt();	
	    while(numero!=0){
	    	System.out.println("El n�mero es: "+ numero);
	    	if (numero>8)
	    		System.out.println("El doble de "+numero+" es "+numero*2);
	    	else
	    		System.out.println("El triple de "+numero+" es "+numero*3);
	    	System.out.print ("Ingresar n�mero:  ");
	    	numero=teclado.nextInt();	
		}
		System.out.println ("Fin");
		teclado.close();
	}
}
