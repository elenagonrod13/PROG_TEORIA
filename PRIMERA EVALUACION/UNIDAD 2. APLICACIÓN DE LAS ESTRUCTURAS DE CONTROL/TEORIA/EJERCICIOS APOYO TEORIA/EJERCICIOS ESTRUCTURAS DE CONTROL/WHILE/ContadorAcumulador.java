/*Hacer un programa que nos permita meter una serie de números hasta teclear el número 7. Al final el programa debe decirnos cuántos números se han metido y la suma total de todos ellos*/

package tema2;

import java.util.Scanner;

public class ContadorAcumulador {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);	
		int suma=0,cuantosNumeros=0;
		System.out.println("Mete un numero");		
		int numero=teclado.nextInt();				
		while (numero!=7){
			cuantosNumeros=cuantosNumeros+1;
			suma=suma+numero;
			System.out.println("Mete un numero");		
			numero=teclado.nextInt();
		}
		System.out.println("Suma: "+suma+" Numeros:"+cuantosNumeros);

	}

}
