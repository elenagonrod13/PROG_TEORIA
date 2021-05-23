package interfaces_animales;

public class Principal {
	 Perro perro;
	 Gato gato;
	 Raton raton;	
	public Principal() {		
		perro=new Perro("perro","fiel");
		gato=new Gato("gato","independiente");
		raton=new Raton("ratón","activo");		
		perro.visualizar_costumbres(perro,gato);
		gato.visualizar_costumbres(perro,gato,raton);
		raton.visualizar_costumbres(raton,gato);
	}

	public static void main(String[] args) {
		Principal entorno=new Principal();
	}
}
