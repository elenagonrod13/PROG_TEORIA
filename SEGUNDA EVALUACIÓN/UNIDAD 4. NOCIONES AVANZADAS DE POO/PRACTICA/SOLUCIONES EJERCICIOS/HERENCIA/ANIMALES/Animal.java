package animales_Herencia;

public class Animal {
	protected float peso;
	protected String tipo;
	
	public Animal (float peso, String tipo) {
		this.peso=peso;
		this.tipo=tipo;
	}
	
	public Animal () {
		this (0.0f,null);
		
	}
	
	public void emitirSonido() {

		System.out.print("El sonido que hace es: " );
	}
	
	public String toString() {

		return "Animal: "+tipo+"\nPeso: "+ peso;
	}

}
