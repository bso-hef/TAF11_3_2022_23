package de.bso.java.examples;

import java.util.Scanner;

public class AdditionAndInputOutput {

    public static void main(String[] args) {

        // Eine Variable für die Eingabe über die Konsole erzeugen
        Scanner input = new Scanner(System.in);

        // Eine Variable vom Typ int (ganzzahlig) für die erste Zahl erzeugen
        int number1;
        // Eine Variable vom Typ int (ganzzahlig) für die zweite Zahl erzeugen
        int number2;

        // Eine Aufforderung zur Eingabe der ersten Zahl ausgeben
        System.out.println("Bitte Zahl 1 eingeben:");
        // Zahl 1 von Tastatur einlesen
        number1 = input.nextInt();

        // Eine Aufforderung zur Eingabe der zweiten Zahl ausgeben
        System.out.println("Bitte Zahl 2 eingeben:");

        // Zahl2 von Tastatur einlesen
        number2 = input.nextInt();

        // eine Variable fuer das Ergebnis erzeugen und mit dem Wert 0 initialisieren
        int result = 0;

        // Die Werte der beiden Variablen number1 und number2
        // addieren und das Ergebnis der Variablen result zuweisen
        result = number1 + number2;

        // Das Ergebnis ausgeben
        System.out.println("Das Ergebnis ist: " + result);
    }
}
