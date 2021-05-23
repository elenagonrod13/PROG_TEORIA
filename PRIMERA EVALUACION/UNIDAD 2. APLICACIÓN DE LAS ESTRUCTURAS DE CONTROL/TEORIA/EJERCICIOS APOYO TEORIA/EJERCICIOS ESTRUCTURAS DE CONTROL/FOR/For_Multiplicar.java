/*Hacer un programa que nos imprima por pantalla la tabla de multiplicar del 7. La salida debe tener el siguiente formato:
7 * 1 = 7*/

package tema2;

public class For_Multiplicar {

	public static void main(String[] args) {
		final int MAX=10,NUMERO=7;
		int contador;
		System.out.println("Tabla de multiplicar del 7");
		for(contador=1;contador<=MAX;contador++)
			System.out.println(NUMERO+" * "+contador+" = "+(NUMERO*contador));

	}

}
