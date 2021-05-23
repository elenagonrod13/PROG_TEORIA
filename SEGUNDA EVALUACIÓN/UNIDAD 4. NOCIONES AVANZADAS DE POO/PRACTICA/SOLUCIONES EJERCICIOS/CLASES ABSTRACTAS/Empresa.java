package clasesAbstractas_Empleados;
import java.util.*;
public class Empresa {
	private String denominacion;
	private String cif;
	private float gastoEmpresa;
	private int numEmpleados;
		
	public Empresa(String den, String cif){
		denominacion=den;
		this.setCif(cif);
		this.gastoEmpresa=0;
		this.numEmpleados=0;
	}
	
	public Empresa() {
		this(null,null);
	}
	
	public String getDenominacion(){

		return denominacion;
	}
	
	public void setDenominacion(String denominacion) {
		
		this.denominacion=denominacion;
	}
	
	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}
	
	public float  getGastoEmpresa(){

		return gastoEmpresa;
	}
	
	public void setGastoEmpresa(float gastoEmpresa) {
		
		this.gastoEmpresa=gastoEmpresa;
	}
	
	public int getNumEmpleados() {
		
		return numEmpleados;
	}
	
	 public void setNumEmpleados(int numEmpleados) {

			this.numEmpleados=numEmpleados;
	}
	 
	public void calcularGastoEmpresa(float sueldoMes) {
		
		gastoEmpresa=gastoEmpresa+sueldoMes;
	}
	
	public void incrementarNumEmpleados(){

		numEmpleados++;
	}     
    	
     public char elegirOpcion(){
		Scanner src =new Scanner (System.in);
		return src.next().charAt(0);
	}

    public void controlarGasto(){
    	final int GASTO=10000;
		char opcion=' ';
		if(gastoEmpresa>=GASTO)
			System.out.println("La empresa tiene que recortar gastos");
		else
			do{
			   System.out.println("Elegir si contratamos a un (V) vendedor o a un (A) administrativo");
			   opcion=elegirOpcion();
			}while(opcion!='V'&& opcion!='A'&& opcion!='v'&& opcion!='a');
		
		switch (opcion){
		case 'A': 
		case'a':
			System.out.println("prefieres un administrativo");
			break;
		case 'V':
		case'v':
			System.out.println("prefieres un vendedor");
			break;
		}
			
	}
}
