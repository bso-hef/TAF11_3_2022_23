package de.bso.java.examples.david;

import java.util.Scanner;

public class DivisionAndInputOutputWithout {
 
   public static void main(String[] args) { 
 
      Scanner input = new Scanner(System.in);
      int number1; 
      int number2; 
 
      System.out.println("Bitte die erste Zahl eingeben:"); 
      number1 = input.nextInt(); 
 
      System.out.println("Bitte die zweite Zahl eingeben:"); 
      number2 = input.nextInt(); 
 
      int result = 0; 

      if(number2 == 0) {
         System.out.println("Fehler. Die Zahl 2 darf nicht 0 sein!"); 
      } else {
         result = number1 / number2;
         System.out.println("Das Ergebnis ist: " + result); 
      } 
   } 
} 
