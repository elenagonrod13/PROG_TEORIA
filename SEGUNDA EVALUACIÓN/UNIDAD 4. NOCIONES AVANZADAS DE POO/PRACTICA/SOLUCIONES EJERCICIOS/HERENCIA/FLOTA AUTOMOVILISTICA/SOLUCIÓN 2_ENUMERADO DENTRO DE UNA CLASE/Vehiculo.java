package flotaAutomovilistica_Herencia_Ejercicio2;

public class Vehiculo {
	static final float IVA=0.21f;
	protected String matricula;
	protected int numRuedas;
	protected float precio;
	private String color; 
	
	public Vehiculo (String matricula,int numRuedas,float precio,String color) {

		this.matricula=matricula;
		this.numRuedas=numRuedas;
		this.precio=precio;
		this.color=color;
	}
	
	public Vehiculo () {

		this(null,0,0.0f,null);
	}
	
	public String getColor() {

		return color;
	}
	
	public float establecer_precio() {

		float precio_base=precio+(precio*IVA);
		return precio_base;
	}
	
	public String toString() {

		return "Matricula: "+matricula+" "+numRuedas+" ruedas";
	}
}
