package edu.umg.programacion2.clase01.interfaces;

/**
 * Interface: representa "sabe hacer algo" (contrato de comportamiento).
 * <p>
 * No importa qué tipo de objeto sea, si implementa Imprimible es porque
 * PROMETE tener un método imprimirFicha(). No importa cómo lo haga por dentro.
 */
public interface Imprimible {

	void imprimirFicha();
}
