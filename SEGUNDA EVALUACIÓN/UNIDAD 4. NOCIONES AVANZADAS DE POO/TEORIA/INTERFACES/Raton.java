package interfaces_animales;

public class Raton extends Animal implements Presa {
	public Raton (String tipo,String comportamiento) {

		super(tipo,comportamiento);
	}	
	public void visualizar_costumbres(Animal raton,Animal gato) {
		System.out.println(toString());
		huir(raton,gato);
	}

}
