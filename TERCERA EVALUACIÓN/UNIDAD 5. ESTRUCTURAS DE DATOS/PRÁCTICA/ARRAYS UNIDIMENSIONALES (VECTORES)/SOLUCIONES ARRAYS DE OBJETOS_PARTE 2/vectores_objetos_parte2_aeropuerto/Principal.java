package vectores_objetos_parte2_aeropuerto;
import java.util.*;
public class Principal {
	Scanner tecla=new Scanner(System.in);
	private Aeropuerto miAeropuerto;
	public Principal() {
		String ciudad; int num,opc;
		System.out.println("Meter la ciudad del aeropuerto");
		ciudad=tecla.nextLine();
		System.out.println("Meter números de vuelos que vamos a gestionar");
		num=tecla.nextInt();
		Aeropuerto miAeropuerto=new Aeropuerto(ciudad,num);
		do{
			opc=Menu();
			switch(opc){
			case 1:
				miAeropuerto.añadirVuelo();
				break;
			case 2:
				miAeropuerto.borrarVuelo();
				break;
			case 3:
				miAeropuerto.visualizarDatos();
				break;
			case 4:
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		}while (opc!=4);
	}

		public int Menu() {
			int op;
			System.out.println("1. Añadir vuelo");
			System.out.println("2. Dar de baja un vuelo");
			System.out.println("3. Visualizar todos los vuelos");
			System.out.println("4. Salir");
			System.out.println("Meter opción");
			op=tecla.nextInt();
			return op;
		}
		
		public static void main(String[] args){
			Principal interfaz =new Principal();
		}

}
