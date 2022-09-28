package ejercicios;

import java.util.Scanner;

/**
 * Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen
 * aspectos que influirán en esta decisión: solo podremos salir a la calle si no
 * está lloviendo y hemos finalizado nuestras tareas. Existe una opción en la
 * que, indistintamente de lo anterior, podremos salir a la calle: el hecho de
 * tener que ir a la biblioteca. Solicitar al usuario (mediante un booleano) si
 * llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. El
 * algoritmo debe mostrar mediante un booleano (true o false) si es posible que
 * se le otorgue permiso para salir a la calle.
 * 
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		// bloque de variables
		Scanner sc = new Scanner(System.in);
		boolean estaLloviendo;
		boolean haFinalizadoTareas;
		boolean irBiblioteca;
		boolean salirCalle = false;

		// bloque de instrucciones
		System.out.println("Veamos si puedes o no salir a la calle.. [USA LAS PALABRAS \"true\" Y \"false\"");
		System.out.println("¿Está lloviendo?");
		estaLloviendo = sc.nextBoolean();
		System.out.println("¿Has finalizado las tareas?");
		haFinalizadoTareas = sc.nextBoolean();
		System.out.println("¿Tienes que ir a la biblioteca?");
		irBiblioteca = sc.nextBoolean();
		salirCalle = estaLloviendo == false && haFinalizadoTareas == true || irBiblioteca == true;
		// Imprimimos el resultado
		System.out.println("¿Puede o no puede salir? --> " + salirCalle);
		// cerramos el Scanner
		sc.close();
	}
}
