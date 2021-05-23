package vectores_objetos_parte1;
public class InfoGeneralOpcion {
	private String matricula;
	private String nombre;
	private char opc;	
	public InfoGeneralOpcion (String nombre,String matri, char opc){
		setMatricula(matri);
		setNombre(nombre);
		setOpcion(opc);
	}

	public char getOpc() {

		return opc;
	}

	public void setOpcion(char opc) {

		this.opc = opc;
	}
	
	public String getMatricula() {

		return matricula;
	}

	public void setMatricula(String matri) {

		matricula = matri;
	}

	public String getNombre() {

		return nombre;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}
}
