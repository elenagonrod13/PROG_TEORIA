package clasesAbstractas_Empleados;

public class Administrativo extends Empleado {
	private int horasExtra;
	
	public Administrativo (int codigo, String nombre,int sueldo,Empresa enlace,int hExtra){
		super(codigo,nombre,sueldo,enlace);		
		horasExtra=hExtra;	
		enlace.incrementarNumEmpleados();	
	}
	
	public Administrativo() {
		this(0,null,0,null,0);
	}
	public float calcularSueldoMensual(){
		final int PRECIO_HORA=30;
		float sueldoMes=sueldo_fijo+(horasExtra*PRECIO_HORA);
		enlace.calcularGastoEmpresa(sueldoMes);
		return sueldoMes;
	}
	
	public String toString(){

		return super.toString()+ " horas Extra: " +horasExtra;

	}

}
