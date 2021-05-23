package interfaces_Puertas_Parte2;
public class VentanaAutomatica implements Automatico{
	private int numVentana;
	private boolean bloqueada = false;	
	public VentanaAutomatica(int numVentana) {
		super();
		this.numVentana = numVentana;
	}

	public boolean isBloqueada() {
		return bloqueada;
	}

	public void bloquear() {
		bloqueada = true;
	}

	public void desbloquear() {
		bloqueada = false;
	}

	public void bloquear_desbloquear() {
		if (isBloqueada())
			desbloquear();
		else
			bloquear();
	}

	public String toString() {
		return "Ventana: " + numVentana + " estado: " + bloqueada;
	}

}
