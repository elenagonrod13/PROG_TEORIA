package vectores_objetos_parte2_aeropuerto;
import java.util.*;
public class Vuelos {
		private String nvuelo;
			private String destino;
			private String compania;
			
			public Vuelos(String nvuelo,String destino,String comp){
				this.nvuelo=nvuelo;
				this.destino=destino;
				compania=comp;
			}
			
			public String getNvuelo(){

				return nvuelo;
			}
			
			public String getDestino(){

				return destino;
			}
			
			public String getCompania(){

				return compania;
			}

}
