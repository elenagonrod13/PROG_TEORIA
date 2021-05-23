package interfaces_animales;

public class Perro extends Animal implements Cazador{
	public Perro (String tipo,String comportamiento) {
		super(tipo,comportamiento);	
	}	
	public void visualizar_costumbres(Animal perro,Animal gato) {
		System.out.println(toString());
		perseguir(perro,gato);
	}
	
}
