package de.bso.java.examples.ifelse;

import java.util.Scanner;

public class CarInformationSystem {

    public static void main(String[] args) {

        // creates a variable for console input
        Scanner input = new Scanner(System.in);

        // creates a variable for the amount of fuel in liters
        int fuelAmount;
        // creates a variable for the fuel usage in 100 kilometers
        double fuelUsageIn100km;
        // creates a variable for the planned distance in kilometers
        int distance;

        // asks for the amount of fuel in liters
        System.out.println("Bitte den aktuellen Tankinhalt in Litern angeben");
        fuelAmount = input.nextInt();

        // asks for the fuel usage in 100 kilometers
        System.out.println("Bitte den Verbrauch pro 100 km angeben");
        fuelUsageIn100km = input.nextDouble();

        // asks for the planned distance in kilometers
        System.out.println("Wie viele Kilometer wollen Sie fahren?");
        distance = input.nextInt();

        double fuelUsage = distance * fuelUsageIn100km / 100;
        double resultingFuelAmmount = fuelAmount - fuelUsage;
        if (resultingFuelAmmount < 0) {
            System.out.println("Nicht genügend Treibstoff. Tanken sie bitte!");
        } else {
            System.out.println("Nach der Fahrt sind noch ca. " + resultingFuelAmmount + " Liter im Tank!");
        }
    }
}
