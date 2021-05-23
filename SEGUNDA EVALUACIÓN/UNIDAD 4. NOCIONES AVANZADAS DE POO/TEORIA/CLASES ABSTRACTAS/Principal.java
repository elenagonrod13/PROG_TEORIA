package tema4_ClasesAbstractas_Instrumentos;

public class Principal {
	public Principal() {
	      InstrumentoGeneral obj=new InstrumentoGeneral();
	      Instrumento miGuitarra= new Guitarra("Guitarra");	
	      Instrumento miViolin= new Violin("Violín");
	      System.out.println(miGuitarra.toString());
	      obj.visualizar(miGuitarra);
	      System.out.println(miViolin.toString());
	      obj.visualizar(miViolin);		      
	}
	public static void main(String arg [ ]){
		Principal interfaz=new Principal();
	}

}
