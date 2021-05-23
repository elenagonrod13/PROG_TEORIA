package Poli_Animales;
public class Delfin extends Mamifero {
	private float tamaño;	 
	 public Delfin (Tipo especie,float tamaño){
				super(especie);
				this.tamaño=tamaño;
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

		return "Su tamaño es: " +tamaño+" metros";
	}
	
	public String verCualidadesDelfin() {
		return"Inteligentes\nCuriosos\nAmigables";
	}
}
