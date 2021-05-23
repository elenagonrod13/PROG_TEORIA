package tema5_colecciones_ArrayList;
import java.util.*;
public class Principal {
	public Principal() {
		Empleado emp;
		List <Empleado> listaE=new ArrayList <Empleado>();
		//List listaE=new ArrayList();
		listaE.add(new Empleado ("Ana",45,2500));
		emp=new Empleado("Maria",50,2600);
		listaE.add(emp);
		//listaE.add("Hola");
		//Vamos a insertar en la segunda posición el elemento que figura a continuación.
		listaE.add(1, new Empleado("Carlos",33,3320));
		listar(listaE);
		System.out.println("El array creado, tiene una capacidad de  "+listaE.size());
		//Vamos a visualizar el elemento que está en la posición tercera
		System.out.println("El elemento situado en la tercera posición es: "+listaE.get(2).toString());		
		//Borramos el elemento situado en la segunda posición
		listaE.remove(1);
		listar(listaE);
		//Voy a borrar un elemento determinado si existe
		Empleado borrar=listaE.get(1);
		//Empleado borrar=(Empleado)listaE.get(1);
		listaE.remove(borrar);
		listar(listaE);
		System.out.println("El array creado, tiene una capacidad de  "+listaE.size());
		
	}	
	
	public void listar(List <Empleado>listaE) {		
		Iterator <Empleado >it = listaE.iterator();
        while(it.hasNext()) //retorna true si hay más elementos
              System.out.println(it.next());//Obtiene el elemento y avanza al siguiente
    }

	public static void main(String[] args) {
		Principal interfaz=new Principal();
	}

}
