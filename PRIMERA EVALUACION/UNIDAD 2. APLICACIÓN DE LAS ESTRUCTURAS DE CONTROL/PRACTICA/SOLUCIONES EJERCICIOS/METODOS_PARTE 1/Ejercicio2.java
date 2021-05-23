package metodos_parte1;
import java.util.*;
public class Ejercicio2 {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		final float IVA=0.21f;
		float precio, nuevoPrecio;		
		precio=leerNumero();
		nuevoPrecio=calcularPrecio(precio,IVA);
		imprimir(precio,nuevoPrecio);
	}
	 public static float leerNumero() {
		 System.out.println("Meter el precio");
		 return (teclado.nextFloat());
	 }

	 public static float calcularPrecio (float numero, float incremento) {
		 float precioIva;
		 precioIva=numero+ (numero*incremento);
		 return precioIva;
	 }

	 public static void imprimir(float precio, float nuevoPrecio) {
		 System.out.println("El precio es: "+precio+" con el IVA es "+nuevoPrecio);
	 }  
	 
}


