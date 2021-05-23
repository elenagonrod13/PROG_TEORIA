package tema3_poo_afianzar_teoria_ejercicio_coche;

public class Coche {

	final static float IVA=0.21f;
	private String marca;
	private float precio;
	
	public Coche() {
		
		marca=null;
		precio=0.0f;
	}

	public Coche(String marca, float precio){

		setMarca(marca);

		setPrecio(precio);
	}
	
	public String getMarca() {

		return marca;
	}

	public void setMarca(String marca) {

		this.marca = marca;
	}

	public float getPrecio() {

		return precio;
	}

	public void setPrecio(float precio) {

		this.precio = precio;
	}
	
	public String toString() {
		
		return "Marca: "+marca+" Precio: "+precio;
	}

	public static void empezar_conducir() {

		System.out.println("Arrancamos coche\n Meter marcha\n 			Aceleramos ");
	
	}
	
	public float calcularPrecioIva(){

		return (precio+(precio*IVA));
	}
}
