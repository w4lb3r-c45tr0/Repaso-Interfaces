package edu.umg.programacion2.clase01.pagos;

/**
 * También implementa ambas interfaces, pero con reglas de negocio distintas.
 * Esto es justo lo que se explota en el demo: cada clase cumple el MISMO
 * contrato a su manera.
 */
public class PagoEnEfectivo implements Pagable, Notificable {

	private final double montoRecibido;

	public PagoEnEfectivo(double montoRecibido) {
		this.montoRecibido = montoRecibido;
	}

	@Override
	public boolean procesarPago(double monto) {
		if (montoRecibido < monto) {
			System.out.printf("Pago en efectivo RECHAZADO: recibido Q%.2f, se necesitaba Q%.2f.%n",
					montoRecibido, monto);
			return false;
		}

		double cambio = montoRecibido - monto;
		System.out.printf("Pago en efectivo APROBADO por Q%.2f (cambio: Q%.2f).%n", monto, cambio);
		return true;
	}

	@Override
	public void enviarConfirmacion(String email) {
		System.out.printf("Enviando recibo digital a %s...%n", email);
	}
}
