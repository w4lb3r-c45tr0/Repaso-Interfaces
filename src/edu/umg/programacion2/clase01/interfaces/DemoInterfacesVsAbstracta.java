package edu.umg.programacion2.clase01.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demo: diferencia clave entre clase abstracta e interface.
 */
public class DemoInterfacesVsAbstracta {

	public static void ejecutar() {
		System.out.println("=== Clase abstracta vs. interface ===");

		List<CirculoImprimible> circulos = new ArrayList<>();
		circulos.add(new CirculoImprimible(3));
		circulos.add(new CirculoImprimible(1));
		circulos.add(new CirculoImprimible(7));

		// 1. Usamos el contrato Imprimible: no nos importa que por dentro
		// también sea una Figura, solo nos importa que "sabe imprimir".
		System.out.println("--- Imprimiendo fichas (contrato Imprimible) ---");
		for (Imprimible ficha : circulos) {
			ficha.imprimirFicha();
		}

		// 2. Usamos el contrato Comparable: Collections.sort() funciona con
		// CUALQUIER clase que implemente Comparable, sin importar cuál sea.
		System.out.println("--- Ordenando por área (contrato Comparable) ---");
		Collections.sort(circulos);
		for (CirculoImprimible circulo : circulos) {
			circulo.imprimirFicha();
		}

		// 3. Error común — tratar de instanciar una interface directamente.
		// ❌ Esto NO compila, porque una interface no es una clase concreta:
		// Imprimible i = new Imprimible();
		//
		// ✅ Solución correcta: instanciar una clase que la implemente.
		Imprimible i = new CirculoImprimible(10);
		i.imprimirFicha();

		// Cuidado: una variable de tipo Imprimible SOLO puede llamar a los
		// métodos definidos en Imprimible (imprimirFicha), aunque el objeto
		// real también tenga calcularArea(). Para usar calcularArea() habría
		// que declarar la variable como CirculoImprimible o como Figura.
	}
}
