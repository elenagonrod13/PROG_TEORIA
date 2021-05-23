package ArrayList_deportes;
public class Deporte {
	 private String nombre;
	 private String deporte;

	 public Deporte (String nombre, String deporte){
		 setNombre(nombre);
		 setDeporte(deporte);
	 }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDeporte() {
		return deporte;
	}
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	public String toString() {
		return "Nombre: " + nombre + " Deporte: " + deporte;
		
	}
}
