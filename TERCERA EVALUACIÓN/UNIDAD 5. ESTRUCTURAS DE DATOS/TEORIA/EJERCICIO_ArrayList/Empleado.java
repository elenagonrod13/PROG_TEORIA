package tema5_colecciones_ArrayList;

public class Empleado {
	private String nombre;
	private int edad;
	private double salario;
	
	public Empleado (String nombre,int edad,double salario){
		setNombre(nombre);
		setEdad(edad);
		setSalario(salario);
	}	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString() {
		return nombre+ " "+" "+edad+" "+salario;
	}

}
