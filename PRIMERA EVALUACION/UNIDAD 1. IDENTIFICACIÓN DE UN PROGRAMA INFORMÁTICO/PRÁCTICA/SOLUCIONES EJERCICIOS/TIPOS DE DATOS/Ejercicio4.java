package tipo_datos;

public class Ejercicio4 {

	public static void main(String[] args) {
		  final  byte EDAD_JUAN = 20;

		   byte edadPedro = (byte) (EDAD_JUAN + 1);

		   final short SUELDO_JUAN = 1980; 

		   final short SUELDO_PEDRO = 800;

		   short sueldoTotal;

		    System.out.println(" La edad de Juan es: "+EDAD_JUAN+ " y la de Pedro: " +edadPedro);

		     sueldoTotal = (short) (SUELDO_JUAN + SUELDO_PEDRO);

		     System.out.println("Juan y Pedro ganan entre los dos: "+sueldoTotal);

	}

}
