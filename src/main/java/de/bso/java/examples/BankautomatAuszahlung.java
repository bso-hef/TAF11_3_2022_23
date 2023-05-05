package de.bso.java.examples;

import java.util.Scanner;

public class BankautomatAuszahlung {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pin;
        double abbuchung = 0;
        double kontostand = 1000;

        System.out.println("Herzlich willkommen!");
        System.out.println("Bitte geben sie Ihren PIN ein:");
        pin = input.nextDouble();
        // Warum geht das hier mit String nicht
        if (pin != 1234) {
            System.out.println("Ihre PIN ist Falsch!");
        } else {
            System.out.println("Wie viel Euro möchten sie Auszahlen?");
            abbuchung = input.nextDouble();

            if (abbuchung >= 1000) {
                System.out.println("Sie können nicht mehr als 1000 Euro Abheben!");
            } else {
                System.out.println("Ihre Auszahlung war erfolgreich.");

                double result = 0;
                result = kontostand - abbuchung;
                System.out.println("Auf Ihrem Konto sind noch: " + result);
            }
        }
    }
}