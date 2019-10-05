package paquete;

import processing.core.PApplet;

public class A extends PApplet {

	public static void main(String[] args) {
		PApplet.main("paquete.A");
	}

	@Override
	public void settings() {
		size(displayWidth, displayHeight);
	}

	@Override
	public void setup() {

	}

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