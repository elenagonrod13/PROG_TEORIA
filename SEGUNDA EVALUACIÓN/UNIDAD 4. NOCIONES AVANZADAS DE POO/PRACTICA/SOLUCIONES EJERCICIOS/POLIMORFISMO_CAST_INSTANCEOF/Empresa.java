package Polimorfismo_Trabajadores;

public class Empresa {
	private double total=0;
	public void informacionGeneral(Trabajadores genero) {		
		System.out.println (genero.toString()+" Dinero cobrado mensualmente: "+genero.cobrarFinMes()+" euros");
		if (genero instanceof MozoAlmacen) {
			System.out.println("A�os trabajados: "+((MozoAlmacen)genero).mostrarA�osTrabajados());
		}
		total=total+genero.cobrarFinMes();
	}
	public String toString() {
		return"Total pagado por la empresa: "+total+" euros";
	}
}
