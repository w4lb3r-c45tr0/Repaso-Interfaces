package edu.umg.programacion2.clase01.pagos;

/**
 * Implementa AMBAS interfaces: sabe procesar pago y sabe notificar.
 * Cada interface se cumple de forma distinta según el tipo de pago.
 */
public class PagoConTarjeta implements Pagable, Notificable {

	private final String numeroTarjeta;

	public PagoConTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	@Override
	public boolean procesarPago(double monto) {
		// 1. Simulamos una validación simple: la tarjeta rechaza montos
		// mayores a Q5000 (ej. límite de crédito).
		if (monto > 5000) {
			System.out.printf("Pago con tarjeta %s RECHAZADO: monto Q%.2f excede el límite.%n",
					enmascarar(numeroTarjeta), monto);
			return false;
		}

		System.out.printf("Pago con tarjeta %s APROBADO por Q%.2f.%n",
				enmascarar(numeroTarjeta), monto);
		return true;
	}

	@Override
	public void enviarConfirmacion(String email) {
		System.out.printf("Enviando comprobante de tarjeta a %s...%n", email);
	}

	// Cuidado: nunca imprimas el número de tarjeta completo, ni en clase ni
	// en producción. Aquí lo enmascaramos como buena práctica desde ya.
	private String enmascarar(String numero) {
		return "****" + numero.substring(numero.length() - 4);
	}
}
