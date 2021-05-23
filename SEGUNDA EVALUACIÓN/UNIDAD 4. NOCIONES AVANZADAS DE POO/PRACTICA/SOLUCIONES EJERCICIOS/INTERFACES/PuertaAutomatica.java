package interfaces_Puertas_Parte2;
public class PuertaAutomatica extends Puerta implements Automatico{
	public PuertaAutomatica(int numPuerta) {
		super(numPuerta); 		
	}	
	public void bloquear_desbloquear(){
		if (isBloqueada())
				desbloquear();
		else
				bloquear();
	}
}
