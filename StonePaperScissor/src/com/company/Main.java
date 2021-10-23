package com.company;
// Just a silly project, was a bit bored, so thought of doing this shit
// Probably have to do exception handling in this later on

import java.util.Random;
import java.util.Scanner;

public class Main {
    static String[] choices = {"Stone", "Paper", "Scissor"};

    public static void main(String[] args) {
        int usr_count = 0, comp_count = 0; // Initializing players score to 0
        System.out.print("How many rounds do you wanna play with computer : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int usr_inp = userChoice() - 1;
            int comp_inp = compChoice();

            if (comp_inp == usr_inp) {
                System.out.println("Its a tie");;
            }
            // All possible cases where user can win, I don't know more optimized way than this one RN
            else if ((usr_inp == 0 && comp_inp == 2) || (usr_inp == 1 && comp_inp == 0) || (usr_inp == 2 && comp_inp == 1)) {
                usr_count++;
                System.out.println("You chose " + choices[usr_inp] + " and Computer chose " + choices[comp_inp] + ", so user won the round");
            } else {
                comp_count++;
                System.out.println("You chose " + choices[usr_inp] + " and Computer chose " + choices[comp_inp] + ", so computer won the round");
            }
        }

        int diff = usr_count > comp_count ? diff = usr_count - comp_count : comp_count - usr_count;
        if (usr_count > comp_count) {
            System.out.println("You beat computer by " + diff + " points");
        } else {
            System.out.println("Computer beat you by " + diff + " points");
        }
    }

    private static int compChoice() {
        Random val = new Random();

        return val.nextInt(choices.length);
    }

    private static int userChoice() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        System.out.println("1. Stone \t 2. Paper \t 3. Scissor");

        return inp.nextInt();
    }
}
