package tema4_herencia_afianzar_teoria;

public class Jefatura extends Empleado {
	private double incentivo;

	public Jefatura (String nomb, int edad, double sal,double incentivo) {
		super(nomb,edad,sal);
		this.incentivo=incentivo;		
	}
	
	@Override
	public double cobrarFinMes() {

		return super.cobrarFinMes()+incentivo;
	}

}
