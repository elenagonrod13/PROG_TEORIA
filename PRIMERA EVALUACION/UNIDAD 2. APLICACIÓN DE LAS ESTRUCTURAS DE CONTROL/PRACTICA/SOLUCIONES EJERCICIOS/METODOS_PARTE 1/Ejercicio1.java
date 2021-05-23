package metodos_parte1;
import java.util.*;
public class Ejercicio1 {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("¿Quieres cambiar dinero?. Fin para salir");
		String respuesta=teclado.next();
		while(!respuesta.equalsIgnoreCase("fin")) {
		float euros=introducirEuros();
		String monedaCambiar=introducirMoneda();
		float cantidadObtenida=cambiarMoneda(euros,monedaCambiar);
		imprimir(cantidadObtenida,monedaCambiar);
		System.out.println("¿Quieres cambiar dinero?. Fin para salir");
		respuesta=teclado.next();
		}
	}
	
	public static float introducirEuros() {
		System.out.println("Meter cantidad de euros que se quieren cambiar");
		return teclado.nextFloat();
	}
	
	public static String introducirMoneda() {
		System.out.println("Meter la moneda a la que se quiera cambiar");
		return teclado.next().toLowerCase(); //convierte cadenas de caracteres a minúsculas
	}
	
	public static float cambiarMoneda(float euros,String moneda) {
		final float LIBRAS=0.87f, DOLARES=1.11f, YENES=120.63f;		
		float cantidadObtenida=0f;
		switch(moneda) {
		case"libras":
			cantidadObtenida=euros*LIBRAS;
			break;
		case"dolares":
			cantidadObtenida=euros*DOLARES;
			break;
		case"yenes":
			cantidadObtenida=euros*YENES;
			break;
		default:
			System.out.println("No has introducido una moneda correcta");
		}
		return cantidadObtenida;
	}
	public static void imprimir(float cantidad,String moneda) {
		System.out.println("La cantidad obtenida es "+cantidad+" "+moneda);
	}

}
