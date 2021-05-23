package poo_maquinaExpendedora;
import java.util.*;
public class Principal {	
	public static Scanner teclado=new Scanner(System.in);
	public Principal() {		
		System.out.println("Mete la capacidad máxima o existencas que puede tener la máquina");
		int capacidad=teclado.nextInt();
		Maquina m=new Maquina(capacidad);		
		while(true) {			
			m.tragarMoneda();
			m.vender();
			if (m.getMonedero() > 0)
				m.devolverMonedas();			
			System.out.println(m.toString());
			
		}			
}

public static void main(String[] args) {

	Principal interfaz=new Principal();

}

}
