package ArrayList_alumnos;
import java.util.*;
public class GestorAlumnos {
		
	List <Alumnos> listaAlumnos= new ArrayList <Alumnos>();	
	
	public void añadir(Alumnos a) {			
		listaAlumnos.add(a); 
	}
	
	public void borrar() {		
		String dni;
		if(listaAlumnos.isEmpty())//if(listaAlumnos.size()==0)
			System.out.println("No hay alumnos");
		else{
			System.out.println("Meter dni para borrar elemento");
			dni=Principal.sc.next();
			Iterator<Alumnos> it=listaAlumnos.iterator();
			boolean salir=true;
			while((it.hasNext())&& (salir)){
				if(it.next().getDni().equals(dni)){
				salir=false;
				it.remove();
				}
			}
				
			if(salir)
				System.out.println("Alumno no existe");
		}

	}			
		
	public void modificar() {		
		String dni, nombreNuevo;		
		Alumnos elemento;
		if(listaAlumnos.isEmpty())//if(listaAlumnos.size()==0)
			System.out.println("No hay alumnos");
		else {
			System.out.println("Meter dni para modificar registro");
			dni=Principal.sc.next();
			Iterator<Alumnos> it=listaAlumnos.iterator();
			boolean salir=true;
			while((it.hasNext())&& (salir)){
				elemento=it.next();
				if(elemento.getDni().equals(dni)){
					salir=false;					
					System.out.println("Meter nuevo nombre");
					nombreNuevo=Principal.sc.next();
					elemento.setNombre(nombreNuevo);			
				}
			}
			if(salir)
				System.out.println("Dni no existe");
		}
	}
	


	public void visualizar() {		
		if(listaAlumnos.size()==0)
			System.out.println("No hay ningún elemento");
		else {	
		  Iterator<Alumnos> it=listaAlumnos.iterator();
		  while(it.hasNext()) {			 
		    System.out.println(it.next());
		  }		
	    }
	}
}
