package poo_alquilerCoches_Motor_Creado_En_Constructor;
public class Vehiculo {
	private String matricula;
	private int plazas;
	private boolean reservado;
	private Motor caracteristicasMotor;
	private static int cochesReservados=0;
	
	public Vehiculo() {
		this(null,0,null);
	}
	
	public Vehiculo(String matricula, int plazas, String tipo,String potencia){
		reservado=false;
		setMatricula(matricula);
		setPlazas(plazas);
		caracteristicasMotor=new Motor(tipo,potencia);
	}

	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		if(plazas>0)
			this.plazas = plazas;
	}

	public boolean getReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public Motor getCaracteristicasMotor() {
		return caracteristicasMotor;
	}

	public void setCaracteristicasMotor(Motor caracteristicasMotor) {
		this.caracteristicasMotor = caracteristicasMotor;
	}

	public static int getCochesReservados() {
		return cochesReservados;
	}

	public static void setCochesReservados(int cochesReservados) {
		Vehiculo.cochesReservados = cochesReservados;
	}

	public void alquilarCoche() { 

		if (getReservado()==false) { //Es false si el coche no está reservado 
			reservado=true;
			cochesReservados++;
			System.out.println("Ha alquilado el coche con las características siguientes: "+ toString());
		 }

	   	 else
			System.out.println("Lo sentimos no tenemos coche libre, puede intentar con otro número de plazas");
	}

	
	public void devolverCoche(){		
		if(getReservado()==true) { // if(getReservado()) Es true si el coche está reservado				
			cochesReservados--;	
			reservado=false;
			System.out.println("Ha devuelto el coche con las características siguientes: "+toString());
		 }

		  else
		     System.out.println("Lo sentimos este coche no está alquilado");					
		}

	public String toString() {

		return("\nMatricula: "+matricula+"\nTipo: "+caracteristicasMotor.getTipo()+"\nPotencia: "+caracteristicasMotor.getPotencia());			
	}
}
