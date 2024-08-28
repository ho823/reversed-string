package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("Put a sentence: ");
            userInput = scan.nextLine();

            if(userInput.trim().isEmpty()) {
                System.out.println("Error: You must enter a non-empty string. Please try again.");
            }
        } while (userInput.trim().isEmpty());

        StringToReverse sentenceReverse = new StringToReverse(userInput);
        String reversedString = sentenceReverse.reverse();
        System.out.println("reverse: " + reversedString);
        scan.close();
    }
}