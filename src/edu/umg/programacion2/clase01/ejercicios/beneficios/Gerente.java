package edu.umg.programacion2.clase01.ejercicios.beneficios;

/**
 * TODO (estudiante): completar calcularBono() según las reglas del enunciado.
 * <p>
 * Regla de negocio:
 * - Bono fijo de Q500, más Q100 adicionales por cada año de servicio.
 * - El parámetro salarioBase NO se usa en esta fórmula (a propósito: no
 *   todas las implementaciones de un contrato usan todos sus parámetros).
 * <p>
 * Pista: bono = 500 + (100 * aniosServicio).
 */
public class Gerente implements Bonificable {

	private final String nombre;
	private final int aniosServicio;

	public Gerente(String nombre, int aniosServicio) {
		this.nombre = nombre;
		this.aniosServicio = aniosServicio;
	}

	@Override
	public double calcularBono(double salarioBase) {
		return 500.0 + (100.0 * aniosServicio);
	}

	public String getNombre() {
		return nombre;
	}
}
