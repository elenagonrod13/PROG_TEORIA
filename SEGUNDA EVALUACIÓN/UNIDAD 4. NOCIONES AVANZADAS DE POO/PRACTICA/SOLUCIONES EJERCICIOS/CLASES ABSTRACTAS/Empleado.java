package clasesAbstractas_Empleados;

public abstract class Empleado {
	protected int codigo_empleado;
	protected String nombre;
	protected int sueldo_fijo;
	protected Empresa enlace;
	
	public Empleado(int codigo, String nombre, int sueldo, Empresa 	enlace) {
		codigo_empleado=codigo;
		this.nombre=nombre;
		sueldo_fijo=sueldo;
		this.enlace=enlace;
	}
	
	public Empleado() {
		this(0,null,0,null);
	}

	public abstract float calcularSueldoMensual();
	
	public String toString(){
		return "Código: "+codigo_empleado+" Nombre: "+nombre+" Sueldo fijo: "+sueldo_fijo+" Empresa: "+enlace.getDenominacion();
	}

}
