package EstructurasControlParte2;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);		
		double a, b, c, auxiliar, raiz1, raiz2;
		System.out.print("Introduce el valor de a:");
		a = teclado.nextDouble();
		System.out.print("Introduce el valor de b:");
		b = teclado.nextDouble();
		System.out.print("Introduce el valor de c:");
		c = teclado.nextDouble();
		auxiliar = b*b-4*a*c;
		if (auxiliar<0)
		  System.out.println("No existen raíces reales");
		else 
		  if (auxiliar == 0) {
		    System.out.print("Solo existe una raíz: "+ (-b/(2*a)));		   
		  } 
		  else { // Auxiliar mayor que cero
		    auxiliar = Math.sqrt(auxiliar);
		    raiz1 = (-b + auxiliar) / (2 * a);
		    raiz2 = (-b - auxiliar) / (2 * a);
		    System.out.println("Raíces: " + raiz1 + ", "+ raiz2);
		  }
	}
}
