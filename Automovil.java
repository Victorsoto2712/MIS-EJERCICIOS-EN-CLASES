
public class Automovil {
	
	String Modelo;
	int año;
	int kilometros;
	boolean estado = false;
	
	public void encender() {
		if(estado==true) {
			System.out.println("El auto no esta encendido");
		}else { 
			System.out.println("El auto esta encendido");
			estado=true;
		}
	}
	
	public void apagado() {
		if(estado==true) {
			System.out.println("El auto esta apagado");
			estado=false;
		}else {
			System.out.println("El auto se apago");
		}
	}

	
		public void avanzar() {
		if(estado==true) {
			System.out.println("El auto esta avanzando");
		}else { 
			System.out.println("El auto esta detenido");
			}
	}

}
