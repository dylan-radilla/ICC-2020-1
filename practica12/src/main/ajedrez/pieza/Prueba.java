package ajedrez.pieza;
import java.util.List;
import java.util.Scanner;
/**
 * Clase para prueba de Peon
 * @author Radilla Maldonado Dylan Emmanuel
 */
public class Prueba{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese posición del Peon");
		System.out.print("Fila : ");
		int aux1 = in.nextInt();
		if(aux1<=7 && aux1>=0){
			System.out.print("Columna : ");
			int aux2 = in.nextInt();
			if(aux2<=7 && aux2>=0){
				System.out.println("Si es Blanco ingresa 1, si es Negro ingresa 0 :");
				int col = in.nextInt();
				if(col == 1){
					Peon prueba1 = new Peon(Color.BLANCO,new Posicion(aux1,aux2));

      				List<Posicion> jugadas = prueba1.obtenerJugadasLegales();
      				System.out.print("Movimientos posibles para el peon Blanco en ");
      				System.out.println("(" + aux1 + "," + aux2 + ") :\n");
     				for (Posicion jugada: jugadas) {
        				System.out.println("Fila: " + jugada.obtenerFila() + "\t" +
                    	       "Columna: " + jugada.obtenerColumna() + "\n");
    				}
    			}
    			if(col == 0){
		    		Peon prueba2 = new Peon(Color.NEGRO,new Posicion(aux1,aux2));

      				List<Posicion> jugadas = prueba2.obtenerJugadasLegales();
      				System.out.print("Movimientos posibles para el peon Negro en ");
      				System.out.println("(" + aux1 + "," + aux2 + ") :\n");
     				for (Posicion jugada: jugadas) {
	        			System.out.println("Fila: " + jugada.obtenerFila() + "\t" +
    	                       "Columna: " + jugada.obtenerColumna() + "\n");
    				}
    			}
    			if(col!= 1 && col!= 0){
    			System.out.println("Entrada invalida");
				}
			}else{
			System.out.println("Columna invalida");
				}
		}else{
		System.out.println("Fila invalida");
			}
	}
}