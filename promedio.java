package vista2;

public class promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcion();
	}
	
	
	
	public static void Funcion() {
		int c=1, son=0;
		//aca defino que C y Son con variales enteras y ademas que ambas empiezan con un valor
		while (c<100)
		//aca defino a condicion, es que mientras C<100	
		{ System.out.println(c); //ahora puedo escribir el valor de C
		c=c+2;
		//se escribe mas simplificado que en el otro programa, es mas arismetico
		son=son+1;
		} 
		System.out.println("El numero de impares que es:"+son+" \n prueba");	
	}

}
