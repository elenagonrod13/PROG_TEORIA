package animales_Herencia;
import java.util.*;
public class Principal {
	Perro chucho;
	Serpiente snake;
	public static Scanner teclado=new Scanner (System.in);
	public Principal() {
		System.out.println ("Meter el peso del perro");
		float pesoAnimal=teclado.nextFloat();
		teclado.nextLine();		
		System.out.println ("Meter raza del perro");
		String razaAnimal=teclado.nextLine();
		chucho=new Perro(pesoAnimal,"perro",razaAnimal);
		snake=new Serpiente();		
		System.out.println ("Meter el peso de la serpiente");
		snake.peso=teclado.nextFloat();		
		snake.tipo="serpiente";
		System.out.println ("Meter si la serpiente es venenosa o no");
		String respuesta=teclado.next();
		if (respuesta.equalsIgnoreCase("si"))
			snake.setEsVenenosa(true);
		else
			snake.setEsVenenosa(false);		
		System.out.print(chucho.toString()+"\n"); 
		chucho.emitirSonido();
		System.out.print(snake.toString()+"\n");
		snake.emitirSonido();
		
	}
		
	public static void main(String[] args) {
		 Principal interfaz=new Principal();
	}

}
