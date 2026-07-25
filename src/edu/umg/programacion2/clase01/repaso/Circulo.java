package edu.umg.programacion2.clase01.repaso;

/**
 * Círculo: "es un tipo de" Figura (herencia de identidad).
 */
public class Circulo extends Figura {

	private final double radio;

	public Circulo(double radio) {
		super("Círculo");
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * radio * radio;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
}
