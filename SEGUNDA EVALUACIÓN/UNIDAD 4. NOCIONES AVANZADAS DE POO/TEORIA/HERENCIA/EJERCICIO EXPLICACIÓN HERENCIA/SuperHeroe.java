package tema4_herencia_explicar_teoria;

public class SuperHeroe extends Persona {
	private String nombreFiccion;	

public SuperHeroe(String nombre,int edad,String ficcion) {
	super(nombre,edad);	
	setNombreFiccion(ficcion);
}

public SuperHeroe() {
	super();
	setNombreFiccion(null);
}

public String getNombreFiccion() {
	return nombreFiccion;
}


public void setNombreFiccion(String nombreFiccion) {
	this.nombreFiccion = nombreFiccion;
}
@Override
public void correr() {
	super.correr();
	System.out.println("Adem�s tengo otros poderes");
}

public void volar() {
	System.out.println("puedo volar");
}
@Override
public String toString() {
	return super.toString()+"\nMi nombre de ficci�n es "+nombreFiccion;
}

}
