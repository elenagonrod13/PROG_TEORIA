package interfaces_Puertas_Parte2;

public class PuertaManual extends Puerta {
	public PuertaManual(int numPuerta) {
		super(numPuerta);		
	}
	
	public void bloquear() {
		super.bloquear();
		System.out.println("Puerta: "+getNumPuerta()+" se bloqueó manualmente");		
	}
	
	public void desbloquear() {
		super.desbloquear();
		System.out.println("Puerta: "+getNumPuerta()+" se desbloqueó manualmente" );		
	}
}
