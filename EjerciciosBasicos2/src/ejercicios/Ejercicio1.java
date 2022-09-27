package ejercicios;

import java.util.Scanner;

/**
 * Un frutero necesita calcular los beneficios anuales que obtiene de la venta
 * de manzanas y peras. Por este motivo, es necesario diseñar una aplicación que
 * solicite las ventas (en kilos). La aplicación mostrará el importe total
 * sabiendo que el precio del kilo de manzanas está fijado en 2,35€ y el kilo de
 * peras en 1,95€. Utiliza operadores opera y asigna.
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		// bloque de variables
		Scanner sc = new Scanner(System.in);
		final float precioKiloManzanas = 2.35f;
		final float precioKiloPeras = 1.95f;
		double ventasManzanas;
		double ventasPeras;
		double beneficioAnual;

		// bloque de instrucciones
		System.out.println("Introduzca las ventas en Kilos de manzanas: ");
		ventasManzanas = sc.nextDouble();
		beneficioAnual = ventasManzanas * precioKiloManzanas;
		System.out.println("Introduzca las ventas en Kilos de peras: ");
		ventasPeras = sc.nextDouble();
		beneficioAnual += ventasPeras * precioKiloPeras;
		// Imprimimos el resultado
		System.out.printf("El beneficio anual sería un total de %.2f" + "€", beneficioAnual);
		// cerramos el Scanner
		sc.close();
	}
}
