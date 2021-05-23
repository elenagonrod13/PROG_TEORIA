package metodos_parte1;
import java.util.*;
public class Ejercicio3 {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		empezar();			
	}
	public static void empezar(){
			double cateto1,cateto2; 			
			cateto1=meterCateto();
			cateto2=meterCateto();
			System.out.printf("La hipotenusa de los catetos "+ cateto1+" "+cateto2+ " es: "+String.format("%1.2f",calcularHipotenusa(cateto1,cateto2)));			
	}
	public static double meterCateto(){
			System.out.print ("Ingresar cateto:  ");
			return (teclado.nextDouble());		
	}
		
	public static double calcularHipotenusa(double cat1,double cat2){
			double auxiliar;
			auxiliar=Math.pow(cat1,2)+ Math.pow(cat2,2);
			return (Math.sqrt(auxiliar));
	}
}


