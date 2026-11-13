package UNIT2;

import java.util.Scanner;

public class SelectionAndIteration {

    private SelectionAndIteration(){
        throw new AssertionError("You cannot make a member of this class");
    }

    public static void integerSums(){
        final Scanner in = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++){
            System.out.print("Please enter a number: ");

            int choice = in.nextInt();
            if (choice == 0){break;}
            sum += choice;
        }

        System.out.print("The sum of the numbers is: " + sum);
    }

    public static void guessingGame(){
        final Scanner in = new Scanner(System.in);
        final int CPU_CHOICE = (int)(Math.random() * 100 + 1);

        int guessCount = 0;
        boolean guessed = false;

        while (!guessed){
            System.out.print("Please enter a number: ");
            int guess = in.nextInt();
            guessCount++;

            if (guess == CPU_CHOICE){
                guessed = true;
            } else {
                System.out.println(guess < CPU_CHOICE
                        ? "Too low"
                        : "Too high"
                );
            }
        }
        System.out.println("You got it! Took you " + guessCount + " guesses");
    }



}
