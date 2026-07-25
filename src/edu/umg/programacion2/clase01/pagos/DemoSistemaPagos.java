package edu.umg.programacion2.clase01.pagos;

import java.util.ArrayList;
import java.util.List;

/**
 * Laboratorio en clase: sistema de pagos.
 * <p>
 * 1. Pagable define procesarPago().
 * 2. Notificable define enviarConfirmacion().
 * 3. PagoConTarjeta y PagoEnEfectivo implementan ambas.
 * 4. Procesamos una lista de Pagable sin saber el tipo real de cada uno.
 */
public class DemoSistemaPagos {

	public static void ejecutar() {
		System.out.println("=== Laboratorio: sistema de pagos ===");

		// 1. La lista es de tipo Pagable, no de PagoConTarjeta ni PagoEnEfectivo.
		// Esto es la clave del ejercicio: el código que procesa pagos NO
		// necesita conocer las clases concretas, solo el contrato Pagable.
		List<Pagable> pagos = new ArrayList<>();
		pagos.add(new PagoConTarjeta("4111111111111234"));
		pagos.add(new PagoEnEfectivo(500));
		pagos.add(new PagoConTarjeta("5500222233334444"));

		// 2. Procesamos todos los pagos con el MISMO bucle, sin importar el
		// tipo real de cada uno (polimorfismo, igual que con Figura).
		double montoAPagar = 300;
		for (Pagable pago : pagos) {
			boolean aprobado = pago.procesarPago(montoAPagar);

			// Cuidado: la variable "pago" es de tipo Pagable, así que el
			// compilador NO nos deja llamar enviarConfirmacion() directamente
			// aunque el objeto real también sea Notificable.
			// pago.enviarConfirmacion("cliente@correo.com"); // no compila

			// 3. Para notificar necesitamos comprobar si el objeto real
			// también cumple el contrato Notificable.
			if (aprobado && pago instanceof Notificable) {
				Notificable notificacion = (Notificable) pago;
				notificacion.enviarConfirmacion("cliente@correo.com");
			}
			System.out.println();
		}

		// 4. Error común — tratar de instanciar la interface directamente.
		// ❌ Esto NO compila, porque Pagable no es una clase concreta:
		// Pagable p = new Pagable();
		//
		// ✅ Solución correcta — instanciar una clase que la implemente.
		Pagable p = new PagoConTarjeta("4000000000000001");
		p.procesarPago(100);
	}
}
