package vectores_objetos_parte1;
public class Principal {	
	GestionarOpciones gestion=new GestionarOpciones();
	public Principal() {
		InfoGeneralOpcion[] vec;		
		int tamRealVec1;
		vec=gestion.cargar(); //Vamos a cargar el primer vector
		tamRealVec1=gestion.pasar(vec);
		gestion.visualizar(tamRealVec1,vec);
	}
	public static void main(String[] args)  {
		Principal interfaz= new Principal();
	}
}
