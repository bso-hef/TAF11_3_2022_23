package de.bso.java.examples.florian;

import java.util.Scanner;
 
public class ABNr2 { 
 
    public static void main(String[] args) { 
 
        Scanner input = new Scanner(System.in); 
 
        System.out.println("Player1 bitte eine Zahl zwischen 1 und 100 eingeben:");
        float number1 = input.nextInt();
 
        System.out.println("Player2 bitte eine Zahl zwischen 1 und 100 eingeben:");
        float number2 = input.nextInt();
 
        double randomNumber = (Math.random() * 100);

        // Differenz1 berechnen und in variable speichern
        Math.abs(randomNumber - number1);

        // Differenz2 berechnen und in variable speichern

        //Ausgabe der zweiten Zufallszahl
        System.out.println(randomNumber); 

        // wenn differenz 1 kleiner als differenz 2
            // Ausgabe Spieler 1 hat gewonnen
        // ansonsten
            // Ausgabe Spieler 2 hat gewonnen
    } 
}