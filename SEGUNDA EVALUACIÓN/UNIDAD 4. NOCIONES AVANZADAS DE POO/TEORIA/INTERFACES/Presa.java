package interfaces_animales;

public interface Presa {	
	public default void huir(Animal debil, Animal fuerte) {
		System.out.println("El "+debil.tipo+" huye del "+fuerte.tipo);
	}	
}
