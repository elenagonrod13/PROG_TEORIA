package vectores_objetos_parte2_almacen;

public class ProdOferta extends Producto {
	private float descuento;
	
	public ProdOferta(int id, float precio, String descrip,float descuento){
		super(id,precio,descrip);
		this.descuento=descuento;
	}
		
	@Override
	public float calcularPrecio(){
		return precio-precio*descuento/100;
	}
	@Override
	public String toString(){
		return super.toString()+" Descuento: "+descuento+"%";
	}

}
