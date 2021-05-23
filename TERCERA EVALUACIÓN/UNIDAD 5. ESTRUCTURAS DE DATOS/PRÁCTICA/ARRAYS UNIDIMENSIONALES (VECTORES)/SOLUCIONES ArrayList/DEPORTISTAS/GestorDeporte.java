package ArrayList_deportes;

import java.util.*;

public class GestorDeporte {
    Scanner tecla=new Scanner(System.in);
	List <Integer> sitio= new ArrayList <Integer>();
	List <Deporte> deportista= new ArrayList<Deporte>();	
	public int  crearDeportistas(){
		String deporte,nombre,resp;
		System.out.println("¿Quiere meter un dato?, fin para terminar");
		resp=tecla.next();
		while(!resp.equalsIgnoreCase("fin")){
		   System.out.println("Meter nombre del deportista");
		   nombre=tecla.next();
		   System.out.println("Deporte que practica");
		   deporte=tecla.next();
		   Deporte aux=new Deporte(nombre,deporte);
		   deportista.add(aux); //deportista.add(new Deporte(nombre,deporte));
		   System.out.println("¿Metemos nuevo dato?, fin para terminar");
		   resp=tecla.next();
		}
		return deportista.size();
	}
	
	public void visualizarDeportistas() {		
		Deporte deport;
		System.out.println("Visualizar deportistas");
		Iterator<Deporte> itt= deportista.iterator();
		while (itt.hasNext()){
			deport=itt.next();
		    System.out.println (" "+deport.getNombre()+" "+deport.getDeporte());
		}
	}
	
	public void crearSitio(int tamano){
		String resp;
		int num;
		Random r=new Random();
		System.out.println("Queremos meter un dato? (Si/NO)");
		resp=tecla.next();
		while(!resp.equalsIgnoreCase("no")){
			num=r.nextInt(tamano+1);//Genera un número aleatorio entre 0 y tamaño excluido el tamaño
			sitio.add(num);
			System.out.println("Queremos meter un dato? (Si/NO)");
			resp=tecla.next();
		}
	}
	
	public void visualizarSitio(){
		System.out.println("Visualizar posiciones donde insertar");
		Iterator <Integer>it= sitio.iterator();
		while (it.hasNext())
			System.out.println (it.next());
	}
	
	public void cargarDatos(){
		
		if(sitio.isEmpty())
			System.out.println("No hay elementos que insertar");
		else {
			int numero;
			String nombre,deporte;
			Iterator it= sitio.iterator();
			while (it.hasNext()){
				numero=(int)it.next();		
				System.out.println("Meter nombre del deportista");
			     nombre=tecla.next();
			     System.out.println("Deporte que practica");
				deporte=tecla.next();	
				deportista.add(numero,new Deporte(nombre,deporte));
				
			} 
		}
	}

	public Deporte[] copiar () {
		Deporte[] vec=new Deporte[deportista.size()];
		 vec=deportista.toArray (vec);
		return vec;
	}
	
	public void visualizarNormal (Deporte [] vectorNormal){
		System.out.println("Vector normal");
		for (Deporte elemento: vectorNormal)			
			System.out.println(elemento.getNombre()+" "+elemento.getDeporte());		
	}
}
