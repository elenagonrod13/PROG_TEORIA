package clasesAbstractas_Empleados;

public class Vendedor extends Empleado {
	private float ventasMes;
	public Vendedor( int codigo, String nombre,int sueldo,Empresa enlace,float ventas){
		super(codigo,nombre,sueldo,enlace);
		ventasMes=ventas;
		enlace.incrementarNumEmpleados();
	}
	public Vendedor() {
		this(0,null,0,null,0f);
	}

	public float calcularSueldoMensual(){
		final float COMISION=0.10f;
		float sueldoMes=sueldo_fijo+(ventasMes*COMISION);
		enlace.calcularGastoEmpresa(sueldoMes);
		return sueldoMes;
	}
	
	public String toString() {
		return super.toString()+ " ventas mes: " +ventasMes;
	}

}
