import java.util.Scanner;

public class ejercocio1{
	
	    public static double Promedio(int[] arreglo){
	        int suma = 0;
	        double promedio;
	        for(byte i=0;i<10;i++){
	            suma = suma + arreglo[i];
	        }
	        promedio = suma/arreglo.length;
	        return promedio;
	    }
	    public static void main(String[] args){
	        Scanner leer = new Scanner(System.in);
	        int[] arreglo = new int[10];
	        double promedio;
	        System.out.println("Ingresara 10 numemeros: ");
	        for(byte i=0;i<10;i++){
	            System.out.println(Integer.toString(i+1)+") ingrese un numero: ");
	            arreglo[i]=leer.nextInt();
	        }
	        promedio = Promedio(arreglo);
	        System.out.println("El promedio es: "+promedio);
	        if(Double.toString(promedio).endsWith(".0")){
	            int acum=0;
	            for(byte i=0;i<10;i++){
	                if(arreglo[i]==(int)promedio){
	                    System.out.println("El numero "+Integer.toString(arreglo[i])+" en posicion "+Integer.toString(i)+" coincide con el promedio: "+Double.toString(promedio));
	                    acum = acum +1;
	                }
	            }
	            if(acum==0){
	                System.out.println("Ningun elemento coincide con el promedio: "+Double.toString(promedio));
	            }
	        }
	        else{
	            System.out.println("Ningun elemento coincide con el promedio: "+Double.toString(promedio));
	        }
	        leer.close();
	    }
	}