package telefono;
import java.util.*;
public class Principal {
	private final int TAM=3;
	private Scanner teclado=new Scanner (System.in);
	public Principal() {
		int numLLamadas,posicion=0;
		String llamada;
		String tipoTelefono;
		Tipo claseTelefono;
		do { //Solo puedo meter un tipo de teléfono fijo o móvil
		System.out.println("meter tipo del teléfono:fijo o móvil");
		tipoTelefono=teclado.next();								
		}while(!tipoTelefono.equalsIgnoreCase("fijo")&&!tipoTelefono.equalsIgnoreCase("movil"));

		if(tipoTelefono.equalsIgnoreCase("fijo")) 
			claseTelefono=Tipo.FIJO;
		else
		claseTelefono=Tipo.MOVIL;		
		Telefono tel=new Telefono(claseTelefono,TAM);		
		System.out.println("meter número de llamadas a realizar");
		numLLamadas=teclado.nextInt();
		for(int cont=1;cont<=numLLamadas;cont++) {
			System.out.println("Meter una llamada");	
			llamada=teclado.next();			
			tel.apuntarLLamada(llamada,posicion);
			posicion++;
			if (posicion==TAM)
				posicion=0;
		}
		if(numLLamadas!=0)//por si no meto ninguna llamada
			tel.visualizar();		
	}

	public static void main(String[] args) {
		
		Principal interfaz=new Principal();		
	}

}
