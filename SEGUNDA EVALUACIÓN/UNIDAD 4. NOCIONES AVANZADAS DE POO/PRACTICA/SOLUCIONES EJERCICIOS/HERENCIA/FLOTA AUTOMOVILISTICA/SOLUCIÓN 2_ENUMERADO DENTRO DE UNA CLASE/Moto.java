package flotaAutomovilistica_Herencia_Ejercicio2;

public class Moto extends Vehiculo {
	static final int FAROS=200;
	private boolean antiniebla; //true si tiene faros antiniebla
	
	public Moto (String matricula,int numRuedas,float precio,String color,boolean niebla) {
		
		super(matricula,numRuedas,precio,color);
		antiniebla=niebla;
	}
	
	public Moto (String matricula,float precio,String color,boolean niebla) {

		this(matricula,2,precio,color,niebla);
	}
	
	public Moto() {
		this(null,0,0.0f,null,false);
	}
	
	@Override
	public float establecer_precio() {
		float precio_final=0.0f;

		if(antiniebla)

			precio_final=super.establecer_precio()+FAROS;
		else

			precio_final=super.establecer_precio();

		return precio_final;
	}
	
	public String observar_niebla() {

		String cadena;

		if(antiniebla)

			cadena="tiene antiniebla";
		else

			cadena="no tiene antiniebla";

		return cadena;
	}
	
	@Override
	
	public String toString() {

		return super.toString()+" Precio: "+establecer_precio()+" euros "+observar_niebla()+" Color: "+getColor();
	}
}
