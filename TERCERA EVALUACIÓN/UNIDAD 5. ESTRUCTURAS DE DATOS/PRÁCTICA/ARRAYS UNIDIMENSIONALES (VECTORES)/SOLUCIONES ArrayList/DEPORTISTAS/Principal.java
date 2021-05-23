package ArrayList_deportes;
import java.util.*;
public class Principal {	
GestorDeporte gestor = new GestorDeporte();
	public Principal() {
		Deporte [] vectorNormal=null;
		int tamano;
		tamano=gestor.crearDeportistas();
		gestor.visualizarDeportistas();
		gestor.crearSitio(tamano);
		gestor.visualizarSitio();
		gestor.cargarDatos();
	    vectorNormal=gestor.copiar();
		gestor.visualizarNormal (vectorNormal);
		
	}
	public static void main(String[] args) {		
	Principal interfaz =new Principal();			
	}
	
	
	
	
	
	

	
	
	
	
	

	

}
