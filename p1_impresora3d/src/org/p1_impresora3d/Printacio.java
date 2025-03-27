package org.p1_impresora3d;

import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

import org.p1_impresora3d.data.Filamento;
import org.p1_impresora3d.data.PETG;
import org.p1_impresora3d.data.PLA;

public class Printacio {

	private static final String MSG_STOCK_DE_FILAMENTOS = "Stock de Filamentos";
	private static final String MSG_OPCION_NO_VALIDA = "No ha introducio una opción correcta, por favor vuelva a intentarlo";
	private static final String MSG_SALIR = "Hasta pronto. Gracias por utilizar nuestra aplicación";
	private static final String ANADIR_FILAMENTO = "1";
	private static final String MOSTRAR_FILAMENTOS = "2";
	private static final String ENCARGAR_PIEZA = "3";
	private static final String SALIR = "4";

	private static Set<Filamento> stock = new HashSet<Filamento>();

	public static void main(String[] args) {
		boolean continuar = true;

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {

				mostrarMenu();

				String opcion = sc.next();

				switch (opcion) {
				case ANADIR_FILAMENTO: {
					anadirFilamento(sc);
					break;

				}
				case MOSTRAR_FILAMENTOS: {
					mostrarFilamentos();
					break;

				}
				case ENCARGAR_PIEZA: {
					anadirPieza();
					break;

				}
				case SALIR: {
					salir();
					break;

				}
				default:
					opcionNovalida();
				}

			}

		} catch (SalirException se) {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void mostrarMenu() {
		System.out.println("----------- MENU -----------------");
		System.out.println("1. Anadir Filamento");
		System.out.println("2. Mostrar Filamentos");
		System.out.println("3. Encargar pieza");
		System.out.println("4. Salir");
		System.out.println("Elija su opción:");
	}

	private static void anadirFilamento(Scanner sca) {

		System.out.println("------------ ANADIR FILAMENTO ---------------------------");
		System.out.println("Referencia:");
		String referencia = sca.next();

		final Filamento filamentoAux = new Filamento(referencia);

		Optional<Filamento> filamentoStock = stock.stream().filter(f -> f.equals(filamentoAux)).findFirst();

		Filamento filamento = filamentoAux;

		String tipo = null;
		if (!filamentoStock.isPresent()) {
			try {
				while (true) {
					try {
						System.out.println("De qué tipo quiere el filamento(PLA/PETG):");
						tipo = sca.next();
						tipo = tipo.trim().toUpperCase();
						System.out.println("TIPO:/"+tipo+"/");
						switch (tipo) {
						case "PLA":
							System.out.println("cREAMOS FILAMENTO pla");
							filamento = new PLA(referencia);
							break;
						case "PETG":
							System.out.println("cREAMOS FILAMENTO pla");
							filamento = new PETG(referencia);
							break;
						default:
							System.out.println("lanzamos excepcion");
							new TipoFilamentoException();
						}

						stock.add(filamento);
						throw new FilamentoGeneradoException();
						
					} catch (TipoFilamentoException e) {
						System.out.println("La opcion no es correcta, elija por favor uno de los dos tipos");
					}
				}
			} catch (FilamentoGeneradoException fe) {
			}

			String color = null;

			System.out.println("Color:");
			color = sca.next();
			filamento.setColor(color);

		} else {
			filamento = filamentoStock.get();
			System.out.println("Stock del filamento:" + filamento);
		}

		float cantidad = 0.f;
		try {
			while (true) {
				try {
					System.out.println("Cuánto Kilos quiere añadir:");
					cantidad = Float.parseFloat(sca.next());
				} catch (NumberFormatException e) {
					System.out.println(
							"La cantidad introcida no es correcta. Vuelva a intentarlo, acuerdese que los decimales son con puntos");
				}
			}
		} catch (CantidadCorrectaException ce) {
		}
		filamento.setPeso(filamento.getPeso() + cantidad);

	}
	

	private static void mostrarFilamentos() {
		System.out.println(MSG_STOCK_DE_FILAMENTOS);
		for (Filamento filamento : stock) {
			System.out.println(filamento);
		}

	}

	private static void anadirPieza() {
		// TODO Auto-generated method stub

	}

	private static void salir() {
		System.out.println(MSG_SALIR);

	}

	private static void opcionNovalida() {
		System.out.println(MSG_OPCION_NO_VALIDA);

	}

	static class SalirException extends RuntimeException {

	}

	static class CantidadCorrectaException extends RuntimeException {

	}

	static class FilamentoGeneradoException extends RuntimeException {

	}

	static class TipoFilamentoException extends RuntimeException {

	}

}
