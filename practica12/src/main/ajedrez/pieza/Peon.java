package ajedrez.pieza;
import java.util.List;
import java.util.LinkedList;

 /**
  * Clase Peon que calcula los posibles movimientos de
  * un peon en ajedrez.
  *
  *@author Radilla Maldonado Dylan Emmauel
  *@version 22/10/19
  */

public class Peon extends Pieza {
	public Peon(Color color, Posicion posicion) {
		super(color, posicion);
	}

	/**
	 * Método que devuelve una lista con los posibles
	 * movimientos del Peon.
	 *@return Lista de las posiciones
	 */

	@Override
	public List<Posicion> obtenerJugadasLegales () {
		LinkedList<Posicion> jugadas = new LinkedList<>();
		int fila = obtenerPosicion().obtenerFila(),
			columna = obtenerPosicion().obtenerColumna();

		if (obtenerColor() == Color.BLANCO){
			if (fila == 1){
				jugadas.add(new Posicion(fila +1, columna));
				jugadas.add(new Posicion(fila +2, columna));
			}
			if (fila +1 <= 7){
				jugadas.add(new Posicion(fila +1, columna));
			}
			if (fila +1 <= 7 && columna +1 <= 7){
				jugadas.add(new Posicion(fila +1, columna +1));
			}
			if (fila +1 <= 7 && columna -1 >= 0){
				jugadas.add(new Posicion(fila +1, columna -1));
			}
		}
		if(obtenerColor() == Color.NEGRO){
			if(fila == 6){
				jugadas.add(new Posicion(fila -1, columna));
				jugadas.add(new Posicion(fila -2, columna));
			}
			if (fila -1 <= 0){
				jugadas.add(new Posicion(fila -1, columna));
			}
			if (fila -1 >= 0 && columna -1 >= 0){
				jugadas.add(new Posicion(fila -1, columna -1));
			}
			if (fila -1 >= 0 && columna +1 <= 7){
				jugadas.add(new Posicion(fila -1, columna +1));
			}
		}
		return jugadas;
	}
}