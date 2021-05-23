package telefono;

public class Telefono {
	private Tipo tipo;
	private String[] memoria;
	
	public Telefono(Tipo tipo,int TAM) {
		this.tipo = tipo;
		memoria = new String [TAM];
	}
	
	public void apuntarLLamada(String llamada, int posicion) {
		memoria [posicion] = llamada;
	}
	
	public void visualizar() {
		System.out.println("Los últimos números del teléfono "+tipo+" son ");
		for(int cont=0; cont<memoria.length; cont++)
			if (memoria [cont] !=null)
			System.out.println(memoria [cont]);
	}
}
