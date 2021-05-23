package Polimorfismo_Trabajadores;

public class MozoAlmacen extends Trabajadores {
	static final int DINERO=60;	
	static final int AÑOS=3;
	private int nTrienios;
	public MozoAlmacen(String codigo, String nombre,int trienios) {
		super(codigo, nombre);		
		nTrienios=trienios;
	}
	public MozoAlmacen() {
		this(null,null,0);
	}
	@Override
	public String toString() {
		return super.toString()+" Antigüedad: "+nTrienios;
	}
	@Override
	public double cobrarFinMes() {
		return SUELDO_BASE+nTrienios*DINERO;
	}	
	public int mostrarAñosTrabajados() {
		return nTrienios*AÑOS;
	}
}
