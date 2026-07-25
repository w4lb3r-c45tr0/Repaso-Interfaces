package edu.umg.programacion2.clase01.interfaces;

import edu.umg.programacion2.clase01.repaso.Figura;

/**
 * Un mismo objeto puede tener UNA identidad (herencia) y VARIOS contratos
 * (interfaces) al mismo tiempo:
 * <p>
 * - "es un tipo de" Figura -> herencia, solo puede extender UNA clase.
 * - "sabe imprimir su ficha" -> Imprimible.
 * - "sabe compararse con otro círculo" -> Comparable&lt;CirculoImprimible&gt;.
 * <p>
 * IMPORTANTE: esto es exactamente lo que NO se puede hacer solo con
 * clases abstractas, porque Java tiene herencia simple (una sola clase padre).
 * Con interfaces, en cambio, se pueden firmar tantos contratos como se necesite.
 */
public class CirculoImprimible extends Figura implements Imprimible, Comparable<CirculoImprimible> {

	private final double radio;

	public CirculoImprimible(double radio) {
		super("Círculo imprimible");
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

	// 1. Cumplimos el contrato de Imprimible.
	@Override
	public void imprimirFicha() {
		System.out.printf("[Ficha] Círculo de radio %.2f -> área %.2f%n", radio, calcularArea());
	}

	// 2. Cumplimos el contrato de Comparable<CirculoImprimible>: nos comparamos
	// por área, para poder usar Collections.sort() más adelante.
	@Override
	public int compareTo(CirculoImprimible otro) {
		return Double.compare(this.calcularArea(), otro.calcularArea());
	}
}
