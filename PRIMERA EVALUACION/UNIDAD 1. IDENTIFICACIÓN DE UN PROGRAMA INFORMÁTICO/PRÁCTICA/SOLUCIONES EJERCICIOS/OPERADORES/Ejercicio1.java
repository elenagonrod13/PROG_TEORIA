package operadores;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		 float impuesto= 2.2f*1.0f+5.0f;
		 
		 System.out.println("El impuesto es:  "+impuesto);
		 
		 int impuesto2= 12/2 + (-8); // vale también: -8 + 12/2	
		 
		 System.out.println("El impuesto 2 es:  "+impuesto2);
		     
		  int cociente= 16 / 3;
		     
		  int  resto= 16 % 3;
		     
		  float cociente_decimal=16.0f/3;	    

		  System.out.println("El cociente entero de 16/3 es:  "+ cociente+" El resto: "+resto);
			
		  System.out.printf("El cociente decimal de 16/3 es: %.2f",cociente_decimal);		  
			 
		  int  nueve = 9;
		     
		  int postIncremento = nueve++;
		     
		  System.out.println("\nEl valor de nueve es:  "+nueve+ "  El valor de  postIncremento es:  "+postIncremento);
			
	       int   preIncremento = ++nueve;
	         
	       System.out.println("El valor de nueve es:  "+nueve+ "  El valor de preIncremento es:  "+preIncremento);
			
	       int   postDecremento = nueve--;
	         
	       System.out.println("El valor de nueve es:  "+nueve+ "  El valor de  postDecremento es:  "+postDecremento);
		
	       int   preDecremento = --nueve;
	         
	       System.out.println("El valor de nueve es:  "+nueve+ "  El valor de  preDecremento es:  "+preDecremento);
	
	}


}


