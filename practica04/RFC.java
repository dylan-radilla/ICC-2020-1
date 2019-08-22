import java.util.Scanner;
/**
  * Programa para convertir los datos personales
  * en formato RFC.
  * @author Radilla Maldonado Dylan Emmanuel
  * @version 22/08/19
 */

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Scanner in = new Scanner(System.in);
		String nombreCompleto = new String();
		String nombre, aPaterno, aMaterno;
		System.out.println("Introduce tu nombre completo por favor.");
		nombreCompleto = in.nextLine();
		int p = nombreCompleto.indexOf(" ");
		int q = nombreCompleto.lastIndexOf(" ");
		aPaterno = nombreCompleto.substring(p+1, p+3);
		aMaterno = nombreCompleto.substring(q+1, q+2);
		nombre = nombreCompleto.substring(0, 1);


		String fechaNacimiento = new String();
		String dia, mes, año;
		System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa");
		fechaNacimiento = in.nextLine();
		int d = fechaNacimiento.indexOf("/");
		int m = fechaNacimiento.lastIndexOf("/");
		año = fechaNacimiento.substring(m+3, m+5);
		mes = fechaNacimiento.substring(d+1, d+3);
		dia = fechaNacimiento.substring(0, d);

		String rfc = new String();
		rfc = aPaterno + aMaterno + nombre + año + mes + dia;
		rfc = rfc.toUpperCase();



		System.out.println("El RFC de " + (nombreCompleto) + " es: " + (rfc));


		
	}

}