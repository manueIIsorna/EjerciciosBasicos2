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
		System.out.println("El número sería par --> " +(num % 2 == 0) );
		// cerramos el Scanner
		sc.close();
	}
}
