package edu.umg.programacion2.clase01.repaso;

/**
 * Clase abstracta: representa "es un tipo de Figura".
 * <p>
 * Una clase abstracta no se puede instanciar directamente (no existe
 * "una figura genérica" en el mundo real, solo círculos, rectángulos, etc.).
 * Lo que SÍ hace es obligar a sus hijas a implementar ciertos métodos,
 * y les regala comportamiento común ya hecho (como describir()).
 */
public abstract class Figura {

	private final String nombre;

	public Figura(String nombre) {
		this.nombre = nombre;
	}

	// 1. Métodos abstractos: no tienen cuerpo. Cada figura hija DEBE
	// implementarlos a su manera, porque el área de un círculo no se
	// calcula igual que la de un rectángulo.
	public abstract double calcularArea();

	public abstract double calcularPerimetro();

	// 2. Método concreto: viene "gratis" para todas las figuras hijas,
	// porque describir() se hace igual sin importar el tipo de figura.
	public void describir() {
		System.out.printf("%s -> área: %.2f, perímetro: %.2f%n",
				nombre, calcularArea(), calcularPerimetro());
	}

	public String getNombre() {
		return nombre;
	}
}
