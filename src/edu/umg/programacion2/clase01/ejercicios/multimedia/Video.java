package edu.umg.programacion2.clase01.ejercicios.multimedia;

/**
 * TODO (estudiante): completar reproducir() y detener().
 * <p>
 * Pista para reproducir(): imprime algo como
 * "Reproduciendo video: <titulo> en <resolucion>".
 * Pista para detener(): imprime algo como "Video detenido: <titulo>".
 */
public class Video implements Reproducible {

	private final String titulo;
	private final String resolucion;

	public Video(String titulo, String resolucion) {
		this.titulo = titulo;
		this.resolucion = resolucion;
	}

	@Override
	public void reproducir() {
		// TODO: implementar según la pista de arriba.
		System.out.println("Reproduciendo video: <" + this.titulo + "> en <" + this.resolucion + ">");
		
	}

	@Override
	public void detener() {
		// TODO: implementar según la pista de arriba.
		System.out.println("Video detenido: <" + this.titulo + ">");
	}
}
