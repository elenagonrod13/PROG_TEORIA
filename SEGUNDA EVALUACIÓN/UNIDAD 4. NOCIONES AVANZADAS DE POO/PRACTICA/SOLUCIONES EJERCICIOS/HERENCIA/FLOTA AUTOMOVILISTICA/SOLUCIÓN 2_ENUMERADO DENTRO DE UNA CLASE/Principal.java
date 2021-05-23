package flotaAutomovilistica_Herencia_Ejercicio2;
import flotaAutomovilistica_Herencia_Ejercicio2.Camion.Motor;
public class Principal {
	Moto scooter;
	Moto normal;
	
	public Principal() {

	scooter=new Moto ("9645HTP",3,3500,"Rojo",true);
	normal=new Moto("5420BST",20000,"Gris",false);
	Camion truck=new Camion("1944JHPT",8,100000,"Azul",200,Motor.GASOLINA);
	System.out.println("Datos de la moto Scooter");
	System.out.println(scooter.toString());
	System.out.println("Datos de la moto Honda");
	System.out.println(normal.toString());
	System.out.println("Datos del camión");
	System.out.println(truck.toString());
}

public static void main(String[] args) {

	Principal interfaz=new Principal();
}
}
