package interfaces_Puertas_Parte2;

public class Puerta {
	private int numPuerta;
	private boolean bloqueada;		
	public Puerta(int numPuerta) {
		this.numPuerta = numPuerta;
		bloqueada=false; //Puerta desbloqueada
	}	
	public Puerta() {
		this(0);
	}
	public boolean isBloqueada() {
		return bloqueada;
	}
	public int getNumPuerta() {
		return numPuerta;
	}
	public void bloquear(){
		bloqueada=true;
	}
	public void desbloquear(){
		bloqueada=false;
	}
	@Override
	public String toString() {
			return "Puerta: "+numPuerta+" estado: "+bloqueada;
	}
}
