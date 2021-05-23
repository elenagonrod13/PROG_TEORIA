/*Hacer un programa que nos permita meter un número que represente un mes (meter del uno al cuatro). Si el número de mes introducido es 1, se debe visualizar: "ENERO", si es el 2, visualizar: "FEBRERO" y así sucesivamente hasta el 4. Para cualquier otro número introducido, visualizar: "No es ninguno de los cuatro primeros meses". Realizar el ejercicio con if anidados*/

package mesesIF;
import java.util.*;
public class Meses_IF {	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);			
		System.out.println("Mete un numero de mes");		
		int mes=teclado.nextInt();		
		if (mes==1) {		
			System.out.println("ENERO");
		}
		else 
			if (mes==2) {		
				System.out.println("FEBRERO");
			}
			else
			   if(mes==3) {
				   System.out.println("MARZO");
			   }
			   else
				   if(mes==4) {
					   System.out.println("ABRIL");
				   }
				   else {		
					   System.out.println("No es ninguno de los 						   cuatro primeros meses");
				   }
		}
}
