/* Pon un enunciado al siguiente programa sin introducirlo en el Eclipse para saber que hace*/

package tema2;

public class Adivina2 {

	public static void main(String[] args) {
		int suma=0,c=0;
		do {
			c=c+1;
			suma=suma+c;
		}while(suma<1000);
		System.out.println(c);
	}

}
