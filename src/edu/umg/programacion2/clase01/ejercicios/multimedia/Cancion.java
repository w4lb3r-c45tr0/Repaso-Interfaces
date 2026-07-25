package edu.umg.programacion2.clase01.ejercicios.multimedia;

/**
 * TODO (estudiante): completar reproducir() y detener().
 * <p>
 * Pista para reproducir(): imprime algo como
 * "Reproduciendo canción: <titulo> (<duracionSegundos>s)".
 * Pista para detener(): imprime algo como "Canción detenida: <titulo>".
 */
public class Cancion implements Reproducible {

	private final String titulo;
	private final int duracionSegundos;

	public Cancion(String titulo, int duracionSegundos) {
		this.titulo = titulo;
		this.duracionSegundos = duracionSegundos;
	}

	@Override
	public void reproducir() {
		// TODO: implementar según la pista de arriba.
		System.out.println("Reproduciendo canción: " + this.titulo + "(" + this.duracionSegundos + "s)");
		
	}

	@Override
	public void detener() {
		// TODO: implementar según la pista de arriba.
		System.out.println("Canción detenida: <" + this.titulo + ">");
		
	}
}
