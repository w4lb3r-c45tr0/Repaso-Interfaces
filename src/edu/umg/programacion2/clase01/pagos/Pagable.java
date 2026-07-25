package edu.umg.programacion2.clase01.pagos;

/**
 * Contrato: "sabe procesar un pago". No importa si por dentro es una
 * tarjeta, efectivo o, en el futuro, una transferencia o una billetera
 * digital. Cualquier clase que implemente Pagable promete tener este método.
 */
public interface Pagable {

	boolean procesarPago(double monto);
}
