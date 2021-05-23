package cadenasCaracteres;

public class Ejercicio4 {
	public Ejercicio4() {
		  StringBuffer cadena=new StringBuffer("Hoal Muuundo");
		  cadena=transformarCadena(cadena);
		  System.out.println(cadena);
		}
		
		public StringBuffer transformarCadena(StringBuffer cadena) {
		  cadena.delete(6,8);
		  cadena.append("!");
		  cadena.insert(0,"¡");
		  cadena.replace(3,5,"la");
		  return cadena;
		}
		
		public static void main(String[] args){	
			Ejercicio4 interfaz=new Ejercicio4();
		}

}
