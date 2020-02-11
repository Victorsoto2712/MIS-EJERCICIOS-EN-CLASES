
package password;
import java.util.ArrayList;
import java.util.Random;

public class password {

	
	private ArrayList<String> contraseñas;
	private char[] auxiliar;
	/*
	 * corresponde donde se guardaran las contraseñas
	 * char es para ingresar caracteres, no importan si son numeros o letras
	 */
	private int longitud;
	/*
	 * el largo de la contraseña
	 */
	private String contraseña;
	/*
	 *  esta corresponde donde se tomara el dato, el cual se hara 1 sola vez
	 */

	public password() {
		/*
		 * corresponde a un constructor vacio, no tiene muchas influencia en el codigo
		 */
		this.longitud = 8;
	}
	
	public password (int Longitud) {
		this.longitud=Longitud;
		/*
		 * corresponde al constructor, quien nos pedira la longitud de la contraseña
		 * el longitud corresponde a lo definido en private y el Longitud es el que definimos para public
		 */

	}
	public Object getcontra() {
		return contraseña;
		/*
		 * sirve para finalizar cuando uno ingresa la contraseña y vuelve a la opcion
		 */
	}
	public void setContra(String Contraseña) {
		contraseña=Contraseña;
	/*
	 * corresponde al metodo para definir la contraseña
	 */
	}
	/*---------------------------------------------------------------------------
	 * GENERADOR DE CONTRASEÑAS ALEATORIAS src= https://code.sololearn.com/cYbJ69AmaS8S/#java
	 */
	public String generarPassword(int len)
    {
        //System.out.println("Your Password:");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "012345678901234567890123456789";
        String passSymbols = charsCaps + chars + nums;
        Random rnd = new Random();
        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++)
        {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
        }
        contraseña = String.copyValueOf(password);
        return contraseña;
    }
	/*
	 * ---------------------------------------------------------------------------
	 */
	//METODO QUE VERIFICA SEGURIDAD DE LA CONTRASEÑA
	private Boolean esFuerte(String password) {
		boolean respuesta=false;
		int auxInt, contadorInt=0, contadorCharUpp=0, contadorCharLow=0;
		/*
		 * CharUpp, busca palabras en mayusculas
		 * CharLow, busca palabras en minusculas
		 */
		char auxChar;
		String auxString;
			auxiliar = new char[password.length()];
			for(int i=0;i<password.length();i++) {
				auxiliar[i] = password.charAt(i);
			}
			for(int i=0;i<auxiliar.length;i++) {
				auxString = Character.toString(auxiliar[i]);
				try {
					auxInt = Integer.parseInt(auxString);
					contadorInt += 1;
				}
				catch(Exception e){
				}
				try {
					auxChar = auxString.charAt(0);
					if(Character.isUpperCase(auxChar)) {
						contadorCharUpp += 1;
					}
					else if(Character.isLowerCase(auxChar)) {
						contadorCharLow += 1;
					}
				}
				catch(Exception e) {
				}
			}
			if(contadorCharUpp>=2 & contadorCharLow>=1 & contadorInt>=5) {
				respuesta = true;
			}
			else {
				respuesta = false;
			}	
		return respuesta;
	}
	//MUESTRA LA CONTRASEÑA OBTENIDA
		public void Muestra() {
			System.out.println("Your Password:");
			System.out.println(generarPassword(longitud));
			System.out.println(esFuerte(generarPassword(longitud)));
		}
	
	
}
