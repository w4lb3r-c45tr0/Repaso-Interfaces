package edu.umg.programacion2.clase01.pagos;

/**
 * Contrato: "sabe enviar una confirmación". Es un contrato aparte de
 * Pagable a propósito: no todo lo que se puede pagar tiene por qué
 * notificar por correo, y no todo lo que notifica tiene por qué cobrar.
 */
public interface Notificable {

	void enviarConfirmacion(String email);
}
