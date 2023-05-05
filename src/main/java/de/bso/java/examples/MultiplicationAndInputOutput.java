package de.bso.java.examples;

import java.util.Scanner;

public class MultiplicationAndInputOutput {

    public static void main(String[] args) {

        // Eine Variable für die Eingabe über die Konsole erzeugen
        Scanner input = new Scanner(System.in);

        // Variablen für zwei Dezimalzahlen erzeugen
        double number1;
        double number2;

        // eine Variable für das Ergebnis erzeugen und mit dem Wert 0 initialisieren
        double result = 0;

        System.out.println("Bitte Zahl 1 eingeben:");
        number1 = input.nextDouble();

        System.out.println("Bitte Zahl 2 eingeben:");
        number2 = input.nextDouble();

        // Das Produkt aus number1 und number2 berechnen und der Variable result zuweisen
        result = number1 * number2;

        // Das Ergebnis auf mit Beschreibung ausgeben
        System.out.println("Das Ergebnis ist: " + result);
    }
}
