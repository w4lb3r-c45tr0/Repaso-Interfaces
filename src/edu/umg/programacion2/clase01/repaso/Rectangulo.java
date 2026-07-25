package edu.umg.programacion2.clase01.repaso;

/**
 * Rectángulo: "es un tipo de" Figura (herencia de identidad).
 */
public class Rectangulo extends Figura {

	private final double base;
	private final double altura;

	public Rectangulo(double base, double altura) {
		super("Rectángulo");
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * (base + altura);
	}
}
