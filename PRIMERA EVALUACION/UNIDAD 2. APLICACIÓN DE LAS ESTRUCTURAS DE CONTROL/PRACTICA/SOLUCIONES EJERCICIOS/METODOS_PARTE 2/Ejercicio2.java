package metodos_parte2;
import java.util.*;
public class Ejercicio2 {
	public static void main(String[] args) {
		   int n=0;
		   System.out.println("Introduce numero");
		    n=leerEntero();
		    while (n!=0) {
		      comprobarNumero(n);
		      System.out.println("Introduce numero");
		      n=leerEntero();
		    }
		}
		
		//Nos permite leer un número entero
		
		public static int leerEntero() {
			Scanner teclado = new Scanner(System.in);			
			return teclado.nextInt();			
		}
		
		/* Nos permite comprobar si el número que metemos tiene o no cuatro dígitos e imprime si los dígitos son pares o no*/
			
		public static void comprobarNumero(int numero) {
			final int DIGITOS=4;		
			//validar numero
			while (numero<1000 ||numero>9999) {
				System.out.println("Número inválido. Introduce numero");
				numero=leerEntero();
			}			
			 int contador= determinarParImpar(numero);
			 if (contador==DIGITOS)
				  System.out.println("Los dígitos son pares");
			 else
				System.out.println("Hay dígitos que son  impares");
		}
		
		// Determina si todos los dígitos del número son pares o no
		
		public static int determinarParImpar(int num){
			int resto=0;
			int contarPares=0;
			while(num>0){//Paramos cuando no se pueda dividir más el número
				resto=num%10;//Cogemos el resto de dividir entre 10 el número para ir sacando los dígitos
				if (resto%2==0)//Comprueba que el dígito es impar
					contarPares++;				
				num=num/10;//Cogemos el resto del número sin el dígito ya calculado
			}
			return contarPares;    
	     }
		
		
		


}
