package clasesAbstractas_Empleados;

public class Caracteristicas {
	public void imprimir (Empleado emp){
		System.out.println(emp.toString()+" Sueldo mensual "+emp.calcularSueldoMensual());
	}
}
