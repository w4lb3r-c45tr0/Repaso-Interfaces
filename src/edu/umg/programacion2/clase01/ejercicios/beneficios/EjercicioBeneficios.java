package edu.umg.programacion2.clase01.ejercicios.beneficios;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio de práctica 1: empleados con beneficios.
 * <p>
 * Enunciado: una empresa paga bonos distintos según el tipo de empleado.
 * Todos los empleados "saben calcular su bono" (Bonificable), pero cada
 * tipo lo calcula con una fórmula distinta. Completa Vendedor y Gerente,
 * y luego ejecuta este demo para procesar una lista de Bonificable sin
 * saber el tipo real de cada uno (igual que en el laboratorio de pagos).
 * <p>
 * Entrada de ejemplo: Vendedor("Ana", 12), Gerente("Luis", 3)
 * Salida esperada:
 *   Ana -> bono: Q...
 *   Luis -> bono: Q...
 * <p>
 * Criterios de evaluación:
 * - Vendedor y Gerente implementan Bonificable correctamente.
 * - El bucle principal usa List&lt;Bonificable&gt;, no listas de tipos concretos.
 * - No se modifica la interface Bonificable.
 */
public class EjercicioBeneficios {

	public static void ejecutar() {
		System.out.println("=== Ejercicio de práctica: empleados con beneficios ===");

		List<Bonificable> empleados = new ArrayList<>();
		empleados.add(new Vendedor("Ana", 12));
		empleados.add(new Gerente("Luis", 3));
		empleados.add(new Vendedor("Marta", 4));

		double salarioBase = 4000;
		for (Bonificable empleado : empleados) {
			try {
				double bono = empleado.calcularBono(salarioBase);
				System.out.printf("%s -> bono: Q%.2f%n", empleado.getClass().getSimpleName(), bono);
			} catch (UnsupportedOperationException ex) {
				System.out.println("Pendiente: " + ex.getMessage());
			}
		}
	}
}
