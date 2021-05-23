package poo_generales_Ejercicio1_bis;
import java.util.*;
public class Principal {		
	Empleado e1;
	Empleado e2;
	Scanner sc;
	public Principal() {	
		sc=new Scanner(System.in);
		e1=crearEmpleado();
		e1.incrementarSalario();
		System.out.println(e1.toString());
		e2=new Empleado();
		e2.setNombre("Agustín");
		e2.setApellidos("Alvarado");
		e2.setEdad(60);
		e2.setSalario(1500.0);
		e2.incrementarSalario();
		System.out.println(e2.toString());
		sc.close();
	}

	public Empleado crearEmpleado() {
		String nombre,apellidos;
		int edad; double salario;
		Empleado general;
		System.out.print("Meter nombre: ");
		nombre=sc.nextLine();
		System.out.print("Meter apellidos:  ");
		apellidos=sc.nextLine();
		System.out.print("Meter edad:  ");
		edad=sc.nextInt();
		System.out.print("Meter salario:  ");
		salario=sc.nextDouble();
		general=new Empleado(nombre,apellidos,edad,salario);
		return (general);
	}

	public static void main(String[] args) {		
		@SuppressWarnings("unused") //Lo añadimos para que la variable interfaz de warning

		Principal interfaz=new Principal();
	}


}
