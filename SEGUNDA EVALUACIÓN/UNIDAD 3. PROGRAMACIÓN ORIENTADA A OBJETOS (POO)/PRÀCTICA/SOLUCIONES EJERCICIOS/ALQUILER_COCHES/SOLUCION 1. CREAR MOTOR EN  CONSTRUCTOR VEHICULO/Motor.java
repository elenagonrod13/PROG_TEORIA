package poo_alquilerCoches_Motor_Creado_En_Constructor;
public class Motor {	
		private String tipo;
		private String potencia;
		
		public Motor() {
			this(null,null);
		}

		public Motor(String tipo, String potencia) {
			setTipo(tipo);
			setPotencia(potencia);
		}
		
		public void setTipo(String tipo) {

			this.tipo=tipo;
		}
		
		public void setPotencia(String potencia) {

			this.potencia=potencia;
		}
		
		public String getTipo() {

			return tipo;
		}
		
		public String getPotencia() {

			return potencia;
		}
}
