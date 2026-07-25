package edu.umg.programacion2.clase01;

import java.util.Scanner;

import edu.umg.programacion2.clase01.ejercicios.beneficios.EjercicioBeneficios;
import edu.umg.programacion2.clase01.ejercicios.multimedia.EjercicioMultimedia;
import edu.umg.programacion2.clase01.interfaces.DemoInterfacesVsAbstracta;
import edu.umg.programacion2.clase01.pagos.DemoSistemaPagos;
import edu.umg.programacion2.clase01.repaso.DemoRepasoOOP;

/**
 * Menú principal - Clase 1: repaso de OOP + interfaces (primer contacto).
 */
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;

		while (!salir) {
			mostrarMenu();
			String opcion = teclado.nextLine().trim();

			switch (opcion) {
			case "1":
				DemoRepasoOOP.ejecutar();
				break;
			case "2":
				DemoInterfacesVsAbstracta.ejecutar();
				break;
			case "3":
				DemoSistemaPagos.ejecutar();
				break;
			case "4":
				EjercicioBeneficios.ejecutar();
				break;
			case "5":
				EjercicioMultimedia.ejecutar();
				break;
			case "0":
				salir = true;
				break;
			default:
				System.out.println("Opción no válida.");
			}
		}

		teclado.close();
		System.out.println("Fin del programa.");
	}

	private static void mostrarMenu() {
		System.out.println();
		System.out.println("=== Clase 1: Repaso OOP + Interfaces ===");
		System.out.println("--- Repaso Prog 1 ---");
		System.out.println("1) Herencia + clase abstracta + polimorfismo (Figura)");
		System.out.println("--- Interfaces: primer contacto ---");
		System.out.println("2) Clase abstracta vs. interface (Comparable + Imprimible)");
		System.out.println("3) Laboratorio: sistema de pagos (Pagable + Notificable)");
		System.out.println("--- Ejercicios de práctica (con TODO) ---");
		System.out.println("4) Empleados con beneficios (Bonificable)");
		System.out.println("5) Reproductor multimedia (Reproducible)");
		System.out.println("0) Salir");
		System.out.print("Opción: ");
	}
}
