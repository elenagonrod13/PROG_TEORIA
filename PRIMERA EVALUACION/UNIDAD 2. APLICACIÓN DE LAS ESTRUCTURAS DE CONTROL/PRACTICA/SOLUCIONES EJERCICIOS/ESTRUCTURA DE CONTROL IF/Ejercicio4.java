package estructuraIF;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {

		final int VALOR=20;
		int temperaturaHoy=0, temperaturaAyer = 0;
		String tiempo = "";

		Scanner teclado=new Scanner(System.in);

		System.out.println("Meter la temperatura de ayer y hoy\n");
		temperaturaHoy=teclado.nextInt();
		temperaturaAyer=teclado.nextInt();

		System.out.println("Meter el tiempo, si llueve o luce el sol\n");
		teclado.nextLine();

		tiempo=teclado.nextLine();
		 
	       if (temperaturaHoy > VALOR && tiempo.equals("llueve")){
	         System.out.println ("Hace calor pero está lloviendo");
	         System.out.println ("Entre ayer y hoy la temperatura fue de "+  (temperaturaHoy+temperaturaAyer));
	         System.out.println ("Mañana habrá  "+ (temperaturaHoy+5));
		}  
		  else
			  if (temperaturaHoy <= VALOR){
				  System.out.println ("Parece que llega el otoño");  
				  if (tiempo.equals("luce el sol"))
				       System.out.println ("Pero "+tiempo);
				  else
					  System.out.println (" y llueve");
			  }
	}

}
