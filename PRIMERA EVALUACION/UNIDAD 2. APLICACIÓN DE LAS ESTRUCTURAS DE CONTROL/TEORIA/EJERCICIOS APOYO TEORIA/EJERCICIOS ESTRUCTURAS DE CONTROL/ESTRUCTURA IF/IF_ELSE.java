
/*Introducir por el teclado dos números y sumarlos. Si la suma es mayor a 5,sacar por pantalla el resultado de la suma, en caso contrario sacar el mensaje: La suma es menor a 5.Al final del programa sacar el mensaje: Fin de programa */

package entradaDatos;
import java.util.Scanner;
public class Entrada {

	public static void main(String[] args) {
			
		Scanner teclado=new Scanner(System.in);	
		System.out.println("Meter dos números");
		int numero1=teclado.nextInt();		
		int numero2=teclado.nextInt();	
		int resultado=numero1+numero2;
		if(resultado>5) {
			
			System.out.println("La suma es: "+resultado);
		}
		else {
			System.out.println("La suma es menor a 5 ");
		}
		System.out.println("Fin de programa");	
		}
	}
	

