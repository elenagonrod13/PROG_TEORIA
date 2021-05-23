package poo_generales_Ejercicio1_bis;
public class Empleado {
	private String nombre;
	private String apellidos;
	private int edad;
	private double salario;

	public Empleado (String nombre, String apellidos, int edad, double salario){
		setNombre(nombre);
		setApellidos(apellidos);
		setEdad(edad);
		setSalario(salario);
	}	
	public Empleado() {
		this(null,null,0,0.0);
	}
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nomb){
		nombre=nomb;
	}
	
	public String getApellidos(){
		return apellidos;
	}

	public void setApellidos(String apell){
		apellidos=apell;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int ed){
		if (ed>0)
			edad=ed;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double sal){
		if(sal>0)
			salario=sal;
	}

	public void incrementarSalario(){
		
		if (edad>=18 && edad<=30)
			salario=salario+100;
		else
			if (edad>=31 && edad<=50)
				salario=salario+150;
			else
				if (edad>50)
					salario=salario+200;
	}

	public String toString(){
		String cadena="El empledado D."+nombre+" "+apellidos+" de "+edad+" años de edad, tiene un salario de "+salario+" euros";
		return cadena;
	}

}
