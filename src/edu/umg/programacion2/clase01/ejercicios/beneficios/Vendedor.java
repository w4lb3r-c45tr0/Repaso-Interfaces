package edu.umg.programacion2.clase01.ejercicios.beneficios;

/**
 * TODO (estudiante): completar calcularBono() según las reglas del enunciado.
 * <p>
 * Regla de negocio:
 * - Si numeroVentas es 10 o más -> el bono es 15% del salarioBase.
 * - Si numeroVentas es menor a 10 -> el bono es 5% del salarioBase.
 * <p>
 * Pista: usa un if/else simple, no necesitas nada más complicado.
 */
public class Vendedor implements Bonificable {

	private final String nombre;
	private final int numeroVentas;

	public Vendedor(String nombre, int numeroVentas) {
		this.nombre = nombre;
		this.numeroVentas = numeroVentas;
	}

	@Override
	public double calcularBono(double salarioBase) {
		return (this.numeroVentas >= 10) ? salarioBase*0.15 : salarioBase*0.5;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumeroVentas() {
		return numeroVentas;
	}
}
