package password;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		//SCANNER
				Scanner l = new Scanner(System.in);
				//CODIGO PRINCIPAL DE EJECUCION
				System.out.println("Indicar largo para contraseña: ");
				password p = new password(l.nextInt());
				/*
				 * aqui se llama al objeto pasword con todas sus funciones
				 */
				p.Muestra();
				//CERRAR SCANNER
				l.close();
		
	}

}
