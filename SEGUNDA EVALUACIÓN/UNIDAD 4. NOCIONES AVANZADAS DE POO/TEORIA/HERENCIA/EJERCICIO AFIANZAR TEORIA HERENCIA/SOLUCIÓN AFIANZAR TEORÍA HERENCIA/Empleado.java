package tema4_herencia_afianzar_teoria;

public class Empleado {
	protected String nombre;
	protected int edad;
	protected double salario;

	public Empleado (String nomb, int edad, double sal) {
		nombre=nomb;
		this.edad=edad;
		salario=sal;
	}

	public Empleado() {
		this(null,0,0.0);		
	}
	
	public double cobrarFinMes() {
		return salario;
	}

}
