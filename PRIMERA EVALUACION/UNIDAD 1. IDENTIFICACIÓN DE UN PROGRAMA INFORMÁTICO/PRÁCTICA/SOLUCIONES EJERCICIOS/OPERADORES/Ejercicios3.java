package operadores;

public class Ejercicios3 {

	public static void main(String[] args) {
	      int edadJuan = 6, edadPedro = 6, edadJulio=21, contador = 14;
	      float hipotenusa = 206.73f, cateto1 = 13.2f, cateto2 = 5.7f;
	      System.out.println("Es " + ( edadJuan < 18) +  " que Juan es  menor de edad");	     
	      System.out.println("Es "+ (edadJuan == edadPedro)+ " que Juan tiene la misma edad que Pedro");	      
	      System.out.println("Es "+ (edadJulio > edadPedro)+ " que Julio tiene mas edad que Pedro");	      
	      System.out.println("Es "+ (Math.pow (hipotenusa, 2) == cateto1*cateto1+cateto2*cateto2)+ " que la hipotenusa al cuadrado es igual a la suma de sus catetos al cuadrado");	      
	      System.out.println("Es  " + (cateto1 >= cateto2)+ " que cateto1 es mayor que cateto2");	      
	      System.out.println("Es "+ (contador == 8) +" que contador es igual a 8");	      
	      System.out.println("Es "+ (contador != 8)+ " que contador es distinto de 8");
	}
}
