package tema5_arrays_objetos;

public class Persona {
	private String nombre;
	private int edad;	
	public Persona(String nomb,int ed){
		nombre=nomb;
		edad=ed;
	}	
	public String getNombre(){
		return nombre;
	}	
	public int getEdad(){
		return edad;
	}
}
