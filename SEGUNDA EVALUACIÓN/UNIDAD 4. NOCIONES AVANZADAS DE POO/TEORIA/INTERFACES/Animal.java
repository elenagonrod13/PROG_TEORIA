package interfaces_animales;

public class Animal {
	protected String tipo;

	protected String comportamiento;
	
	public Animal(String tipo,String comportamiento) {
		this.tipo=tipo;
		this.comportamiento=comportamiento;
	}
	
	public Animal() {
		this(null,null);
	}
	
	public String toString() {
		return "El "+ tipo+" es "+comportamiento;
	}

}
