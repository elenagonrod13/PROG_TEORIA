package Polimorfismo_Trabajadores;

public class Mensajero extends Trabajadores {
	static final double DIETA=48;//Dieta mensual
	private int edad;	
	public Mensajero(String dni, String nombre,int edad) {
		super(dni, nombre);
		this.edad = edad;	
	}
	public Mensajero() {
		this(null,null,0);
	}
	@Override
	public String toString() {	
		return super.toString()+" Edad: "+edad;
	}
	@Override	
	public double cobrarFinMes() {
		return SUELDO_BASE+DIETA;
	}
}
