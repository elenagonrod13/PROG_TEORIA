package tema4_herencia_afianzar_teoria;
import java.util.*;
public class Principal {
	public static Scanner teclado=new Scanner(System.in);
	 public Principal() {
		 System.out.println("Meter nombre del jefe");
		 String nombre=teclado.nextLine();
		 System.out.println("Meter edad del jefe");
		 int edad=teclado.nextInt();
		 System.out.println("Meter salario del jefe");
		 double salario=teclado.nextDouble();
		 System.out.println("Meter incentivo del jefe");
		 double incentivo=teclado.nextDouble();
		 Jefatura jefe=new Jefatura(nombre,edad,salario,incentivo);
		 System.out.println(jefe.nombre+" de "+jefe.edad+" años cobrará al final de mes "+jefe.cobrarFinMes());
	 }

	 public static void main(String[] args) {

		 Principal interfaz=new Principal();
	 }

}
