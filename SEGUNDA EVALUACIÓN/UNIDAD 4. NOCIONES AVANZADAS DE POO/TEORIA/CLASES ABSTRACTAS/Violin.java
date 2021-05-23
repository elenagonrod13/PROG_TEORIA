package tema4_ClasesAbstractas_Instrumentos;

public class Violin extends Instrumento{
	public Violin(String tipo) {
		   super(tipo);
	        }
	       public void tocar() {
		   System.out.println("Se toca con el arco");
	       }

}
