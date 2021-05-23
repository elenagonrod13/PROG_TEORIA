package tema2;

import java.util.Scanner;

public class Ejercicio3Bis {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		byte mes=0; ;
		int numDias=0;
		do {
			System.out.println("Introduce el número que represente un mes (1..12)");
			mes=teclado.nextByte();
		}while((mes<1)||(mes>12));
		 
		
		  	if(mes== 2) {
		  		System.out.println("Introduce un año");
				int anno=teclado.nextInt();
				if((anno%4==0 && anno%100!=0)||(anno%400==0))
				  numDias=29;
			  else
				  numDias=28;
		  	}
		  	else
		  		if(mes==4||mes==6||mes==9||mes==11)		  	
		  			numDias=30;
		  		else
		  			numDias=31; 

		    System.out.println("El número de dias es: "+numDias);
		    teclado.close();
	}
}
