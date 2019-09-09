import java.util.Date;
import java.util.Scanner;

/** Programa para calcular la edad, en años, de una persona.
 * @author Radiila Maldonado Dylan Emmanuel
 * @date 08/09/2019
 */
public class Tarea2{
    public static void main(String[] pps) {
                   Scanner in = new Scanner(System.in); //Creación de Scanner.

    int dia;					// Declaracion de variables. 
    int mes; 
    int año;
    long edad;
	Date hoy = new Date();
 
	System.out.println("Dame la fecha de tu nacimiento, comenzando por el día:");    // Solicitar la fecha de nacimiento
	dia = in.nextInt();
	//dia = dia.getDay;
	System.out.println("Ahora el mes:");
	mes = in.nextInt();
	mes = mes-1;
	//mes = mes.getMonth;
	System.out.println("Por ultimo el año:");
	año = in.nextInt();
	año = año-1900;
	//año = año.getYear;
	    
	Date cumpleaños = new Date (año , mes, dia);    		// Adaptar la fecha normal al formato de Date

    System.out.println("Hoy es: " + hoy);
    System.out.println("Tu fecha de nacimiento es: " + cumpleaños);        // Mostrar las fechas

	edad = (hoy.getTime() - cumpleaños.getTime());		//Calcular la edad de una persona. 
	edad = edad/31536000000L;    

	System.out.println("Tienes " + edad + " años");    // Mostrar resultados.
    }
}
