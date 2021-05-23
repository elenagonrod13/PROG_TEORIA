package enumerado;
import java.util.*;
public class Principal {
	Scanner tecla=new Scanner(System.in);
	public Principal() {		
	      Coche car=new Coche("Audi",TipoSeguro.TODO_RIESGO);
	      System.out.println("La marca del coche es: "+car.getMarca()+" y el tipo seguro "+car.getSeguro());
	      Coche car1=new Coche();
	      System.out.println("Meter marca del coche");
	      String marca=tecla.nextLine();
	      car1.setMarca(marca);	        
		  System.out.println("Meter tipo de seguro:(Terceros,todo_riesgo)");
	      String tipo=tecla.nextLine();	
	      if (tipo.equalsIgnoreCase("terceros"))
	    	  car1.setSeguro(TipoSeguro.TERCEROS);			
	       else
	    	   car1.setSeguro(TipoSeguro.TODO_RIESGO);
		  System.out.println("La marca del coche es: "+car1.getMarca()+" y el tipo de seguro "+car1.getSeguro());	
	}
	public static void main(String[] args) {
		new Principal();
	}

}
