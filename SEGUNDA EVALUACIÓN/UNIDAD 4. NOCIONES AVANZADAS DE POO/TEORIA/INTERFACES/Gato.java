package interfaces_animales;

public class Gato extends Animal implements Cazador,Presa {
	public Gato (String tipo,String comportamiento) {
		super(tipo,comportamiento);
	}	
	public void visualizar_costumbres(Animal perro,Animal gato,Animal raton) {
		System.out.println(toString());
		perseguir(gato,raton);
		huir(gato,perro);
	}
	
	
}
