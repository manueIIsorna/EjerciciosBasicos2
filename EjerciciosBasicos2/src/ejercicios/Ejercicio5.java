package ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que solicite las notas del primer, segundo y tercer
 * trimestre (notas enteras que se solicitarán al usuario). El programa debe
 * mostrar la nota media del curso como se utiliza en el boletín de
 * calificaciones (solo la parte entera) y como se usa en el expediente
 * académico (con decimales).
 */
public class Ejercicio5 {
	public static void main(String[] args) {
		// bloque de variables
		Scanner sc = new Scanner(System.in);
		int notaPrimerTrimestre;
		int notaSegundoTrimestre;
		int notaTercerTrimestre;
		// int notaMediaBoletinCalificaciones;
		// double notaMediaExpedienteAcademico;
		double notaMedia;

		// bloque de instrucciones
		System.out.print("Escriba la notas de cada trimestre separadas por un espacio: ");
		notaPrimerTrimestre = sc.nextInt();
		notaSegundoTrimestre = sc.nextInt();
		notaTercerTrimestre = sc.nextInt();
		// bloque para calculo de notas
		// notaMediaBoletinCalificaciones = (notaPrimerTrimestre + notaSegundoTrimestre
		// + notaTercerTrimestre) / 3;
		// notaMediaExpedienteAcademico = (notaPrimerTrimestre + notaSegundoTrimestre +
		// notaTercerTrimestre) / 3;

		notaMedia = (double) (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre) / 3;
		// Imprimimos el resultado
		System.out.println("La nota media según el Boletín de Calificaciones es de " + (int) notaMedia);
		System.out.printf("La nota media según el Expediente Académico es de %.2f ", notaMedia);
		// cerramos el Scanner
		sc.close();
	}
}
