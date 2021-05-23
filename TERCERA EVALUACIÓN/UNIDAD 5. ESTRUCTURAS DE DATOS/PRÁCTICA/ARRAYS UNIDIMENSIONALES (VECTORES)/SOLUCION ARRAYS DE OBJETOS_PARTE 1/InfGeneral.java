package vectores_objetos_parte1;

public class InfGeneral {
	private String nMatricula;
	private String nombre;
	
	public InfGeneral(String nombre, String matri){
		setNMatricula(matri);
		setNombre(nombre);
	}

	public String getnMatricula() {
		return nMatricula;
	}
	
	public void setNMatricula(String matri) {
		nMatricula = matri;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
