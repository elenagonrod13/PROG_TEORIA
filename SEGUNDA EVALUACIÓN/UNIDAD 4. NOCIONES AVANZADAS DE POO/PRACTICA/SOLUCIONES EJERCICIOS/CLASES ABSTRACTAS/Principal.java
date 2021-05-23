package clasesAbstractas_Empleados;

public class Principal {
	final int SUEL_VEN=1200;
	final int SUEL_ADMIN=1300;
	 Empresa company;
	 Empleado vendedor1;
	 Empleado admin1;
	 Caracteristicas obj;

	public Principal() {
		obj=new Caracteristicas();
		company=new Empresa("Siglo XXI","3478F");
		vendedor1=new Vendedor(1,"Juan",SUEL_VEN,company,800);
		obj.imprimir(vendedor1);
		admin1=new Administrativo(2,"Pedro",SUEL_ADMIN,company,20);
		obj.imprimir(admin1);
		System.out.println("El total gastado por  la empresa es: "+ company.getGastoEmpresa());
		System.out.println("El total de empleados que tiene la empresa es:"+ company.getNumEmpleados());
		company.controlarGasto();	
	}
	public static void main(String[] args){
		Principal interfaz=new Principal();
	}

}
