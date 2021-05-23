package tema4_ClasesAbstractas_Instrumentos;

public class Guitarra extends Instrumento {
    public Guitarra(String tipo) {
    	super(tipo);
     }
    public void tocar() {    
	System.out.println("Se toca con los dedos");
    }

}
