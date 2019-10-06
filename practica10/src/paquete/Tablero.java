package paquete;

import processing.core.PApplet;

/**
 * Programa para dibujar en terminal un tablero de ajedrez.
 * 
 * @author Radilla Maldonado Dylan Emmanuel
 * @version 06/10/2019
 */

public class Tablero extends PApplet {

	/**
	 * Método que invoca a PApplet.main(String)
	 */
	public static void main(String[] args) {
		PApplet.main("paquete.Tablero");
	}

	/**
	 * Método settings() que establece el tamaño de la terminal en función del largo
	 * y ancho de la pantalla en que se use.
	 */
	@Override
	public void settings() {
		size(displayWidth, displayHeight);
	}

	/**
	 * Método setup() se ejecuta al iniciar el programa y su función es definir las
	 * propiedades iniciales del entorno.
	 */
	@Override
	public void setup() {

	}

	/**
	 * Método draw() que se ejecuta frameRate veces y solo se detiene si se llama
	 * noLoop() o se cierra el programa.
	 */
	@Override
	public void draw() {
		for (int i = 0; i < 8; i++) {
			for (int b = 0; b < 8; b++) {
				if ((i + b) % 2 == 1) {
					fill(0xFF666699);
				} else {
					fill(0xFFFFFFE0);
				}
				rect(i * (displayHeight / 8), b * (displayHeight / 8), (displayHeight / 8), (displayHeight / 8));
			}
		}
	}
}