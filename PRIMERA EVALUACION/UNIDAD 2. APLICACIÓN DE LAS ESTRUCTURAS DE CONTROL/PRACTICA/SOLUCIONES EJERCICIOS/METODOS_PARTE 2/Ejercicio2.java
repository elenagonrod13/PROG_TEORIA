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
		
		//Nos permite leer un n�mero entero
		
		public static int leerEntero() {
			Scanner teclado = new Scanner(System.in);			
			return teclado.nextInt();			
		}
		
		/* Nos permite comprobar si el n�mero que metemos tiene o no cuatro d�gitos e imprime si los d�gitos son pares o no*/
			
		public static void comprobarNumero(int numero) {
			final int DIGITOS=4;		
			//validar numero
			while (numero<1000 ||numero>9999) {
				System.out.println("N�mero inv�lido. Introduce numero");
				numero=leerEntero();
			}			
			 int contador= determinarParImpar(numero);
			 if (contador==DIGITOS)
				  System.out.println("Los d�gitos son pares");
			 else
				System.out.println("Hay d�gitos que son  impares");
		}
		
		// Determina si todos los d�gitos del n�mero son pares o no
		
		public static int determinarParImpar(int num){
			int resto=0;
			int contarPares=0;
			while(num>0){//Paramos cuando no se pueda dividir m�s el n�mero
				resto=num%10;//Cogemos el resto de dividir entre 10 el n�mero para ir sacando los d�gitos
				if (resto%2==0)//Comprueba que el d�gito es impar
					contarPares++;				
				num=num/10;//Cogemos el resto del n�mero sin el d�gito ya calculado
			}
			return contarPares;    
	     }
		
		
		


}
