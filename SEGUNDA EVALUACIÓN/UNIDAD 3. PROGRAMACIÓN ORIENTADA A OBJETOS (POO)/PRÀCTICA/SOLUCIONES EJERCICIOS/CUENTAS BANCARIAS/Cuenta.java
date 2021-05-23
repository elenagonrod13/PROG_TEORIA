package poo_cuentasBancarias_Ejercicio2;

public class Cuenta {
	  private String nombre;
	  private String numeroCuenta;
	  private String clave;
	  private double saldo;
	
 public Cuenta() {
		nombre=null;
		numeroCuenta=null;
		clave=null;
		saldo=0.0;
}
			
public Cuenta(String nombre,String numeroCuenta, String clave){
		saldo=0.0;
		setNombre(nombre);
		setNumeroCuenta(numeroCuenta);
		setClave(clave);	      
}

public void setNombre(String nombre) {
		this.nombre=nombre;
}

public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta=numeroCuenta;
}

public void setSaldo(double saldo) {
	if (saldo>=0)
		this.saldo = saldo;
}

public void setClave(String clave) {
	
	this.clave = clave;
}

//getters 

public String getNombre(){

	return nombre;
}


public String getNumeroCuenta() {
	
	return numeroCuenta;
}


public String getClave() {
	
	return clave;
}

public double getSaldo(){
		  
	 return saldo;
}

public String toString() {

	return (" \n Nombre: "+nombre+"\n Nº Cta: "+numeroCuenta+"\n Clave: 	"+clave+"\n Saldo: "+saldo);
}


private static double validarCantidad() {

	double cantidad;
	
	do{
		System.out.println("Meter cantidad, debe ser mayor a 0");

		cantidad=Principal.sc.nextDouble();

	}while(cantidad<=0);
				
	return cantidad;	
}

//método ingreso
	  
public void ingresar(){
  
	saldo = saldo + validarCantidad();	   
}

	     
public void reintegrar (){

	double dinero;
	dinero=validarCantidad();
	if(saldo >=dinero)
		saldo=saldo-dinero;
	else
		System.out.println("No tenemos suficiente saldo");
}

//método transferencia
	  
public void transferir(Cuenta cliente) {
	double dinero;
	dinero=validarCantidad();			
	if (saldo>=dinero){ 
		saldo-=dinero; //saldo=saldo-dinero; 
	  	cliente.setSaldo(cliente.getSaldo()+dinero);	
	}

	else

		System.out.println("No tenemos suficiente saldo para hacer la transferencia");
}

public void cambiarClave(){

	String claveActual,nuevaClave="";
	do {
		System.out.println("Meter clave actual");
		claveActual=Principal.sc.next();
	}while (!claveActual.equals(clave));
	System.out.println("Meter nueva clave");
	nuevaClave=Principal.sc.next();
	setClave(nuevaClave);
}

}
