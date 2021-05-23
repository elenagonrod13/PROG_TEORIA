package tipo_datos;

public class Ejercicio1 {
	public static void main(String[] args) {

		final int HABITANTES_ASTURIAS=1042000;	
		final int HABITANTES_MADRID = 6464000;
		final long HABITANTES_MUNDO = 7463370459L;
		int poblacionTotal=0;
		poblacionTotal=HABITANTES_ASTURIAS+HABITANTES_MADRID;

		System.out.println("Habitantes de Asturias y Madrid son: "+poblacionTotal);

		System.out.println("Habitantes en el mundo somos:" + HABITANTES_MUNDO);
	}
}

