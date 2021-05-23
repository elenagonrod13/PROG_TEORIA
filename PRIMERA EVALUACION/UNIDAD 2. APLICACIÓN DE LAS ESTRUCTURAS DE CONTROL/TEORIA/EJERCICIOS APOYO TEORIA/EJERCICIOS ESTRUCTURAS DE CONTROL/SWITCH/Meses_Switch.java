/*Hacer un programa que nos permita meter un número que represente un mes (meter del uno al cuatro). Si el número de mes introducido es 1, se debe visualizar: "ENERO", si es el 2, visualizar: "FEBRERO" y así sucesivamente hasta el 4. Para cualquier otro número introducido, visualizar: "No es ninguno de los cuatro primeros meses". Realizar el ejercicio con switch*/

package tema2;
import java.util.*;
public class Meses_Switch {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);	
		
		System.out.println("Mete un numero de mes");
		
		int mes=teclado.nextInt();
		
		switch(mes) {
		case 1:
			System.out.println("ENERO");
			break;
		case 2:
			System.out.println("FEBRERO");
			break;
		case 3:
			System.out.println("MARZO");
			break;
		case 4:
			System.out.println("ABRIL");
			break;
		default:
			System.out.println("No es ninguno de los cuatro primeros 			meses");
			
		}				
		
	}
}

