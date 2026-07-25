package edu.umg.programacion2.clase01.repaso;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Repaso exprés de Programación 1: herencia, clase abstracta y polimorfismo.
 */
public class DemoRepasoOOP {

	public static void ejecutar() {
		System.out.println("=== Repaso: herencia + clase abstracta + polimorfismo ===");

		// 1. Creamos una lista de Figura (el tipo del arreglo es la CLASE PADRE).
		// Esto es posible porque Circulo y Rectangulo "son un tipo de" Figura.
		List<Figura> figuras = new LinkedList<>();
		//ArrayList<Figura> figuras = new LinkedList<>();
		
		figuras.add(new Circulo(5));
		figuras.add(new Rectangulo(4, 6));
		figuras.add(new Circulo(2.5));

		// 2. Polimorfismo: recorremos la lista SIN saber si cada elemento es
		// un Circulo o un Rectangulo. Java decide en tiempo de ejecución
		// cuál calcularArea() usar, según el tipo REAL del objeto.
		// IMPORTANTE: esto es lo que hace posible agregar una figura nueva
		// (ej. Triangulo) sin tener que tocar este método.
		double areaTotal = 0;
		for (Figura figura : figuras) {
			figura.describir();
			areaTotal += figura.calcularArea();
		}

		System.out.printf("Área total de todas las figuras: %.2f%n", areaTotal);

		// 3. Cuidado: esto NO compila, porque Figura es abstracta.
		// Figura f = new Figura("genérica"); // Error: no se puede instanciar
	}
}
