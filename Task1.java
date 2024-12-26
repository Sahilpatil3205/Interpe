// ///Design a number guessing game from given range///

import java.util.*;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Gameplay = "yes";

        while (Gameplay.equalsIgnoreCase("yes")) {
            System.out.println("Enter the Upperbound:");
            int upperbound = sc.nextInt();
            System.out.println("Enter the Lowerbound:");
            int lowerbound = sc.nextInt();
            boolean guessed = false;
            Random rd = new Random();
            int num = rd.nextInt(upperbound - lowerbound + 1) + lowerbound;
            int tries = 0;
            while (guessed == false) {
                System.out.println("Guess the number between " + lowerbound + " to " + upperbound + ":");
                int guess = sc.nextInt();
                tries++;
                if (guess > num) {
                    System.out.println("Guess is too high.");
                }
                else if(guess<num){
                    System.out.println("Guess is too low");
                }
                else{
                    System.out.println("You guessed it.");
                    System.out.println("It took you " + tries + " chances to guess it correct");
                    guessed = true;
                }
            }
            System.out.println("Would you like to play again(Yes/No):");
            Gameplay = sc.next();

        }
        System.out.println("Thank You for playing");
        sc.close();
    }
}