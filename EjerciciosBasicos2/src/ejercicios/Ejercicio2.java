package ejercicios;

import java.util.Scanner;

/**
 * Realizar una aplicación que solicite al usuario su edad y le indique si es
 * mayor de edad (mediante un literal booleano: true o false).
 *
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		// bloque de variables
		Scanner sc = new Scanner(System.in);
		int age;

		// bloque de instrucciones
		System.out.print("Introduzca su edad: ");
		age = sc.nextInt();
		// Imprimimos el resultado
		if (age >= 18) {
			System.out.println("Usted es mayor de edad");
		} else {
			System.out.println("Usted no es mayor de edad");
		}
		// cerramos el Scanner
		sc.close();
	}
}
