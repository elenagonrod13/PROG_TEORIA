/*Introducir por el teclado dos números y sumarlos. Si la suma es mayor a 5,sacar por pantalla el resultado de la suma. Al final del programa sacar el mensaje: Fin de programa*/

package entrada;
import java.util.Scanner;
public class Teoria_If_Simple {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);		
		int numero1,numero2,resultado;		
		System.out.println("Meter numero");
		numero1=teclado.nextInt();
		System.out.println("Meter numero");
		numero2=teclado.nextInt();
		resultado=numero1+numero2;
		if (resultado>5) {
			System.out.println("El resultado es: "+resultado);
		}
		System.out.println("Fin de programa");
	}
}
