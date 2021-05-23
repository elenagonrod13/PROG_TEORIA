package estructuras_de_control_variadas_parte1;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero,res,suma=0,sumap=0,sumai=0,sumac=0;
		
		 do {
			 System.out.println("Introduce número entero positivo");		
			 numero=teclado.nextInt();
		 }while ((numero<0)||(numero>20));

		 for(int contador=1;contador<=numero;contador++){
			 suma=suma+contador;
			 res=contador%2;
			 if(res==0)
				 sumap=sumap+contador;
			 else
				 sumai=sumai+contador;		 
			 sumac=sumac+(contador*contador);			
		 }
		 System.out.println("La suma de los "+numero +" primeros números naturales es:" + suma);
		 System.out.println("La suma de los pares: " + sumap);
		 System.out.println("La suma de los impares es:"+ sumai);
		 System.out.println("La suma de los cuadrados es:" +sumac);
		 teclado.close();
	 }
	
}


