package Poli_Animales;
import java.util.*;

public class Principal {
	Mamifero dog,dolphin;

	public Principal(){
		Caracteristicas obj=new Caracteristicas();
			dog=new Perro(Tipo.PERRO,"labrador");		
			dolphin=new Delfin(Tipo.DELFIN,2.3f);
			obj.imprimir(dog);
			obj.imprimir(dolphin);
		}
				
	public static void main(String[] args) {

		Principal interfaz=new Principal();
	}
}
