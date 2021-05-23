package tema2;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int puesto;
		System.out.print ("Ingresar puesto en el que quedaste:  ");
		puesto=teclado.nextInt();	
		switch (puesto) {
			 case 1:
			   System.out.println("Medalla de oro");
				break;
			  case 2:
				System.out.println("Medalla de plata");
				break;
			   case 3:
			    System.out.println("Medalla de bronce");
				 break;
			    default:
				 System.out.println("Gracias por participar");
				 break;
			}
				teclado.close();

	}
}
