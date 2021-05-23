package tema4_ClasesAbstractas_Instrumentos;

public abstract class Instrumento {
    private String tipo;
    public Instrumento(String tipo) {
	this.tipo=tipo;
    }
    public String toString() {
    	return"Tipo: "+tipo;    	
    }
    public abstract void tocar();

}
