package ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que pida un número al usuario e indique mediante un
 * literal booleano (true o false) si el número es par.
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		// bloque de variables
		Scanner sc = new Scanner(System.in);
		int num;

		// bloque de instrucciones
		System.out.print("Introduzca un numero entero: ");
		num = sc.nextInt();
		// Imprimimos el resultado
		if (num % 2 == 0) {
			System.out.println("Es un número par");
		} else {
			System.out.println("Es# un número impar");
		}
		// cerramos el Scanner
		sc.close();
	}
}
