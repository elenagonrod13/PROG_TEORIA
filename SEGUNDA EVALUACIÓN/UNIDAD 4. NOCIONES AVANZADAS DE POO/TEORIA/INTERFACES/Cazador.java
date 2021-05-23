package interfaces_animales;

public interface Cazador {	
	public default void perseguir(Animal perseguidor, Animal perseguido) {

		System.out.println("El "+perseguidor.tipo+" persigue al "+perseguido.tipo);
	}	
}
