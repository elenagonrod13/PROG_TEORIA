package poo_cuentasBancarias_Ejercicio2;
import java.util.*;
public class Principal {
	public static Scanner sc= new Scanner(System.in);
	Cuenta julio;
	Cuenta marta;

	public Principal(){
		int opcion=0;
		Cuenta clave; /*Va a apuntar a la direcci�n de memoria apuntada por marta o por julio*/		
		julio = new Cuenta("Julio","ES9817654","5678");
		marta = new Cuenta("Marta","ES4667654","1234");
		clave=identificarCliente();
		while (opcion!=6){
			menu();
			System.out.println("Meter opci�n");
			opcion=sc.nextInt();
			while (opcion<=0 || opcion>6){
				System.out.println("Opci�n err�nea.Meter clave");
				opcion=sc.nextInt();
			}
			switch(opcion) {

			case 1:
				clave.ingresar();
				break;
			case 2:
				if (clave==marta) { 
					marta.transferir(julio);//clave.transferir(julio);				
				}
				else {
					julio.transferir(marta);// clave.transferir(marta);						
				}				
				break;
			case 3:
				clave=identificarCliente();
				clave.reintegrar();
				break;
			case 4:				
				clave.cambiarClave();
				break;

			case 5:
				System.out.println(clave.getSaldo());			
			}
		}	 
	}
	
	public Cuenta identificarCliente() {

		String clave;		
		System.out.println("Meter clave personal");
		clave=sc.next();
		//Comprobar qui�n es el cliente
		while(!clave.equals(marta.getClave())&&!clave.equals(julio.getClave())){
			System.out.println("Clave err�nea. Meter clave");
			clave=sc.next();
		}
		
		/*Cuando se sale del while, como no sabemos por cu�l de los dos clientes sali�, preguntamos por uno de ellos*/
		 
		if(clave.equals(marta.getClave()))
			return marta; 
		else			
			return julio;
	}


	public static void menu() {

			System.out.println("1. Ingresar dinero");
			System.out.println("2. Realizar una transferencia");
			System.out.println("3. Reintegrar dinero");
			System.out.println("4. Cambiar clave");
			System.out.println("5. Conocer saldo");
			System.out.println("6. Salir");
	}
	
	public static void main(String[] args) {
		
		 Principal interfaz =new Principal();		
	}
}
