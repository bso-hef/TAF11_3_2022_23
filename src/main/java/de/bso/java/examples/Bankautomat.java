package de.bso.java.examples;

import java.util.Scanner;

public class Bankautomat {

    public static void println(String ausgabe) {
        System.out.println(ausgabe);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        println("Grüße:");

        println("Bitte Pin eingeben eingeben:");


        String pin = input.nextLine();

        if (pin.equals("1234")) {

            println("Wie viel wollen sie abheben?:");

            int abbuchungsbetrag = input.nextInt();

            int kontostand = 1000;
            if (kontostand >= abbuchungsbetrag) {

                kontostand = kontostand - abbuchungsbetrag;

                println("Ihr Kontostand Beträgt " + kontostand);

            } else {
                println("Kontostand zu gering für die ausgewählte Summe");
            }

        } else {
            println("Pin ist falsch");
        }
    }

}