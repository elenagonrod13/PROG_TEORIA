package operadores;

public class Ejercicio2 {

	public static void main(String[] args) {
		boolean frio=false; 
		System.out.println(!frio);
		boolean oportunidad, bueno = true, bonito=true, barato = true, mojado = true, llueve = true, riego = false;				
		oportunidad = bueno && bonito && barato;
		System.out.println(oportunidad);		
		mojado=llueve||riego;								
		System.out.println(mojado);
	}
}
