package animales_Herencia;

public class Serpiente extends Animal {
private boolean esVenenosa;	

	public Serpiente (float peso, String tipo, boolean venenosa) {
		super(peso,tipo);
		esVenenosa=venenosa;
	}
	
	public Serpiente () {
		super();
		esVenenosa=false;
	}
	
	public boolean isEsVenenosa() {
		return esVenenosa;
	}

	public void setEsVenenosa(boolean esVenenosa) {
		this.esVenenosa = esVenenosa;
	}
	@Override
	public void emitirSonido() {
		super.emitirSonido();
		System.out.println("Sssss");
	}

	private String confirmarVeneno() {
		String veneno;
		if(esVenenosa)
			veneno="Si";
		else
			veneno="No";
		return veneno;
	}

	public String toString(){
		
		return super.toString()+" Venenosa: " +confirmarVeneno();

	}

}
