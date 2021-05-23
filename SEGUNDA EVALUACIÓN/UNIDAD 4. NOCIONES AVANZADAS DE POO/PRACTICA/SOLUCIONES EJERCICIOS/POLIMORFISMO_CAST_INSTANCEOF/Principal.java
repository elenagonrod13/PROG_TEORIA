package Polimorfismo_Trabajadores;

public class Principal {
	public Principal() {
		Empresa obj=new Empresa();
		Trabajadores mozo=new MozoAlmacen("93775","Pepe",3);
		Trabajadores mensajero=new Mensajero("724937","Juana",30);
		obj.informacionGeneral(mozo);
		obj.informacionGeneral(mensajero);
		System.out.println(obj.toString());
	}
	public static void main(String[] args) {
		Principal interfaz=new Principal();

	}

}
