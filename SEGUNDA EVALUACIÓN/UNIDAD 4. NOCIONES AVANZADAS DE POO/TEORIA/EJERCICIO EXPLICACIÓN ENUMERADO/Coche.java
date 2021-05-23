package enumerado;

public class Coche {
private String marca;
private TipoSeguro seguro;

public Coche() {
	setMarca(null);
	seguro=null;
}
public Coche(String marca, TipoSeguro seguro) {	
	this.marca = marca;
	this.seguro = seguro;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public TipoSeguro getSeguro() {
	return seguro;
}
public void setSeguro(TipoSeguro seguro) {
	this.seguro = seguro;
}
}
