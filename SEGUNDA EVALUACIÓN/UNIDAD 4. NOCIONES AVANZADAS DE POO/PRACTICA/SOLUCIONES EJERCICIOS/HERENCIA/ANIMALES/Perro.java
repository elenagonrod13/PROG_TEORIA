package animales_Herencia;

public class Perro extends Animal{
private String raza;	

	public Perro(float peso, String tipo, String raza) {
		super(peso,tipo);
		this.raza=raza;
	}
	
	public Perro() {
		super();
		raza=null;
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	@Override
	public void emitirSonido() {
		super.emitirSonido();
		System.out.println("Guau, guau");
	}

	public String toString(){

		return super.toString()+" raza: "+raza;

	}

}
