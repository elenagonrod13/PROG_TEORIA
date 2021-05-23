package flotaAutomovilistica_Herencia_Ejercicio1;

public class Camion extends Vehiculo {
	static final float GASOLINA=0.02f;
	static final float DIESEL=0.05f;
	private Motor tipo;
	private float peso;

	public Camion (String matricula,int numRuedas,float precio,String color,float peso,Motor tipo) {
		super(matricula,numRuedas,precio,color);
		this.peso=peso;
		this.tipo=tipo;
	}
	
	public Camion() {
		this(null,0,0f,null,0f,null);
	}
	
	@ Override
	
		public float establecer_precio() {

		float precio_final=0.0f;
		if(tipo==Motor.GASOLINA)
			precio_final=super.establecer_precio()+(precio*GASOLINA);
		else
			precio_final=super.establecer_precio()+(precio*DIESEL);
		return precio_final;
	}
	
@Override
	
	public String toString() {

		return super.toString()+" Precio: "+establecer_precio()+" euros "+"Peso: "+peso+" Tn "+"Motor de: "+tipo+" Color: "+getColor();
	}

}
