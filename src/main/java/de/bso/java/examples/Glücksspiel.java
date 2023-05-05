package de.bso.java.examples;

import java.util.Scanner;

public class Glücksspiel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Eingabe & Überprüfung 
        System.out.print("Spieler 1, gib eine Zahl von 0 bis 100 an:");
        float spieler1 = input.nextFloat();

        if (spieler1 < 0 || spieler1 > 100) {
            System.out.print("ZWISCHEN 0 & 100!!");
            System.exit(0);
        }

        System.out.print("Spieler 2, gib eine Zahl von 0 bis 100 an:");
        double spieler2 = input.nextDouble();

        if (spieler2 < 0 || spieler2 > 100) {
            System.out.print("ZWISCHEN 0 & 100!!");
            System.exit(0);
        }

        //Zuffallszahlen 
        double random = Math.random() * 100;


        //Rechnung 
        double ergebniss1 = Math.abs(random - spieler1);
        double ergebniss2 = Math.abs(random - spieler2);

        //if abgleich 

        if (ergebniss1 == ergebniss2) {
            System.out.println("Die Zuffallszahl ist:" + random);
            System.out.println("Unentschieden ):");

        }
        if (ergebniss1 < ergebniss2) {
            System.out.println("Die Zuffallszahl ist:" + random);
            System.out.println("Spieler 1 gewinnt!");
        } else {
            System.out.println("Die Zuffallszahl ist:" + random);
            System.out.println("Spieler 2 gewinnt!");
        }
    }

}