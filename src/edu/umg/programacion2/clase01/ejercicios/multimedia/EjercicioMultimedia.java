package edu.umg.programacion2.clase01.ejercicios.multimedia;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio de práctica 2: reproductor multimedia.
 * <p>
 * Enunciado: un reproductor debe manejar canciones y videos por igual,
 * sin importarle el tipo real de cada uno. Completa Cancion y Video,
 * y luego ejecuta este demo para reproducir y detener una lista de
 * Reproducible.
 * <p>
 * Entrada de ejemplo: Cancion("Clocks", 180), Video("Tutorial Java", "1080p")
 * Salida esperada (una vez completado el TODO):
 *   Reproduciendo canción: Clocks (180s)
 *   Canción detenida: Clocks
 *   Reproduciendo video: Tutorial Java en 1080p
 *   Video detenido: Tutorial Java
 * <p>
 * Criterios de evaluación:
 * - Cancion y Video implementan Reproducible correctamente.
 * - El bucle principal usa List&lt;Reproducible&gt;, no listas de tipos concretos.
 * - Cada reproducir() va seguido de su propio detener() en el mismo objeto.
 */
public class EjercicioMultimedia {

	public static void ejecutar() {
		System.out.println("=== Ejercicio de práctica: reproductor multimedia ===");

		List<Reproducible> contenidos = new ArrayList<>();
		contenidos.add(new Cancion("Clocks", 180));
		contenidos.add(new Video("Tutorial Java", "1080p"));

		for (Reproducible contenido : contenidos) {
			try {
				contenido.reproducir();
				contenido.detener();
			} catch (UnsupportedOperationException ex) {
				System.out.println("Pendiente: " + ex.getMessage());
			}
		}
	}
}
