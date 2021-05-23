/*Especifica qué resultados imprimiría por pantalla cada uno de los for que tenemos escritos en el siguiente programa*/
package tema2;

public class Adivina3 {
	public static void main(String[] args) {

		for(int i=0; i!=9;i=i+2)
			System.out.println(i);

		for (int i=1; i<21;i++)
			System.out.print(i+" ");

		for (int i=-1; i>-20;i=i-2)
			System.out.print(i+" ");
	
	}
}
