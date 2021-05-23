package Poli_Animales;
public class Delfin extends Mamifero {
	private float tama�o;	 
	 public Delfin (Tipo especie,float tama�o){
				super(especie);
				this.tama�o=tama�o;
	}
	 
	 public Delfin() {
		this(null,0.0f);
	}
	 @Override

	public void moverse(){

			super.moverse();
			System.out.println(" nadando");
	}

	public String toString(){

		return "Su tama�o es: " +tama�o+" metros";
	}
	
	public String verCualidadesDelfin() {
		return"Inteligentes\nCuriosos\nAmigables";
	}
}
