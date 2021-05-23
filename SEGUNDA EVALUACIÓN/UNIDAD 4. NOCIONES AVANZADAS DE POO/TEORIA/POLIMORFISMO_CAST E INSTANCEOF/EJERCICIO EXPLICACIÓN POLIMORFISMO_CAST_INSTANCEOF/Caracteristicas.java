package Poli_Animales;

public class Caracteristicas {
	public void imprimir(Mamifero animal){

		animal.moverse();
		System.out.println(animal.toString());
		if(animal instanceof Perro) {
			System.out.println("Cualidades del perro:");
			Perro objPerro=(Perro)animal;
			objPerro.verCualidadesPerro();
		}
		else if(animal instanceof Delfin) {
			System.out.println("Cualidades del delfin:\n"+((Delfin)animal).verCualidadesDelfin());
		}		
	}
}
