package tema4_herencia_explicar_teoria;

public class Persona {
	protected String nombre;
	private int edad;
	
	public Persona() {
		this(null,0);
	}
	public Persona(String nombre, int edad) {		
		this.nombre = nombre;
		this.edad = edad;
	}
		
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void correr() {
		System.out.println("Corro como cualquier persona");
	}
	public String toString() {
		return "Mi nombre real es "+nombre;
	}

}
