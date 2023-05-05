package de.bso.java.examples.ifelse;

import java.util.Scanner;

public class GameRandomizer {

    public static void main(String[] args) {

        // creates a variable for console input
        Scanner input = new Scanner(System.in);

        // creates a variable for two decimals
        float number1;
        float number2;

        // input player 1
        System.out.println("Spieler 1, ihre Zahl bitte:");
        number1 = input.nextFloat() ;

        // input player 1
        System.out.println("Spieler 2, ihre Zahl bitte");
        number2 = input.nextFloat() ;

        // creates a variable for a random number and assignment a random number
        double randomNumber = (Math.random() * 100);

        // calculates the distance between the players numbers and the random number
        double differenzPlayer1 = Math.abs(randomNumber - number1);
        double differenzPlayer2 = Math.abs(randomNumber - number2);

        // displays the random number
        System.out.println("Zufallszahl: " + randomNumber);

        // displays win of player 1 if
        if(differenzPlayer1 < differenzPlayer2) {
            System.out.println("Player 1 wins.");
        }

        // displays win of player 2 if
        if(differenzPlayer1 > differenzPlayer2) {
            System.out.println("Player 2 wins.");
        }

        // displays draw game
        if(differenzPlayer1 == differenzPlayer2) {
            System.out.println("The bank wins");
        }
    }
}
