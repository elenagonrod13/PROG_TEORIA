/* Pon un enunciado al siguiente programa sin introducirlo en el Eclipse para saber que hace*/
package tema2;
import java.util.*;
public class Adivina1 {
	public static void main(String[] args) {
		int numero=0;
		boolean comprobar=false;
		int verdad=0;
		Scanner tecla=new Scanner(System.in);
		System.out.println("Meter número");
		numero=tecla.nextInt();
		while(numero!=0) {
			comprobar=(numero==5);
			if(comprobar)
				verdad=verdad+1;
			System.out.println("Meter número");
			numero=tecla.nextInt();
		}
		System.out.println(verdad);
	}
}
