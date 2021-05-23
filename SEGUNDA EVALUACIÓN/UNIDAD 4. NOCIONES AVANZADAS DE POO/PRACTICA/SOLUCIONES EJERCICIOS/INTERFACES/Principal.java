package interfaces_Puertas_Parte2;

public class Principal {
	public Principal(){
		Automatico p1=new PuertaAutomatica(1);
		PuertaManual p2 = new PuertaManual(2);
		Automatico p3 = new PuertaAutomatica(3);	
		Automatico v1=new VentanaAutomatica(4);
		System.out.println("Estado inicial de puertas y ventana");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(v1.toString());
		Temporizador t = new Temporizador();
		System.out.println("Procedemos a bloquear o desbloquear las puertas o ventana");
		for(int cont=1; cont<=5; cont++){
			int num = (int) (Math.random()*4+1);			
			switch (num){
			case 1:
					t.control(p1);				
				    break;
			case 2:
					if (p2.isBloqueada())
						p2.desbloquear();
					else
						p2.bloquear();
				    break;
			case 3:
				   t.control(p3);	
				   break;
			case 4:
				   t.control(v1);	
				   break;

			}
		}
		System.out.println("Estado final de las puertas y ventana");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(v1.toString());
	}
	public static void main(String[] args) {		
		new Principal();
	}
}
