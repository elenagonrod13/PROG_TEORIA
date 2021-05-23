package Polimorfismo_Trabajadores;

public class Trabajadores {
protected String codigo;
protected String nombre;
protected final double SUELDO_BASE=1000;
public Trabajadores(String codigo, String nombre) {
	this.codigo = codigo;
	this.nombre = nombre;	
}
public Trabajadores() {
	this(null,null);
}
public String toString() {
	return "Código empleado: "+codigo+ " Nombre: "+nombre;
}
public double cobrarFinMes() {
	return SUELDO_BASE;
}
}
