package tema2;
import java.util.*;
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nroDivisores=0;
		System.out.println("Introduce numero para calcular divisores y decir si es primo o no");
		int numero=teclado.nextInt();
		System.out.print("Los divisores de "+numero+" son: ");
		for (int contador=1;contador<=numero;contador++){
			if (numero%contador==0){
				System.out.print(contador+" ");
				nroDivisores++;			
			}
		}
		if(nroDivisores==2) 
			System.out.println("\n"+numero+ " es primo" );
	}
}
