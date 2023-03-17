package de.bso.java.examples;

import java.util.Scanner;

public class DivisionAndInputOutputWithout {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double number1;
		double number2;

		System.out.println("Bitte Zahl 1 eingeben:");
		number1 = input.nextDouble();

		System.out.println("Bitte Zahl 2 eingeben:");
		number2 = input.nextDouble();

		// wenn number2 gleich 0
			//Hinweis für Division mit 0 ausgeben
			System.out.println("Fehler. Der Zahl 2 darf nicht 0 sein!");

		// wenn number2 ungleich 0
			// eine Variable fuer das Ergebnis erzeugen und mit dem Wert 0 initialisieren
			double result = 0;

			// Quotienten aus number1 und number2 ermitteln und result zuweisen
			result = number1 / number2;

			// Das Ergebnis ausgeben
			System.out.println("Das Ergebnis ist: " + result);

	}
}