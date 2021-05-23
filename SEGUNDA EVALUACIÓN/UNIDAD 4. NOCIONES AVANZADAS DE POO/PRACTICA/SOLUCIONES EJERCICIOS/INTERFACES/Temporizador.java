package interfaces_Puertas_Parte2;

public class Temporizador {
	public void control(Automatico p){
		p.bloquear_desbloquear();
		System.out.println(p.toString());
	}
}
