package com.java.palindrome;

import java.util.Scanner;

public class Program {

    public  static  void main (String[] args) {
        System.out.println("Do you want to run the tests or try your own input? \n 1. Run tests\n2. Test with input");
        Scanner scan = new Scanner(System.in);

        int value = scan.nextInt();

        switch (value) {
            case 1 -> {
                Tests tests = new Tests();
                tests.runTests();
                break;

            }
            case 2 -> {
                Palindrome palindrome = new Palindrome();

                System.out.println("Input your text to test whether it is a palindrome"
                        + "\n Press enter after entering the text");


                String input = scan.next();

                System.out.println("Select the data structure you want to use to perform the test"
                        + "1. Stack       2. Queue" + "\n Press enter after selection");

                int selection = scan.nextInt();

                switch (selection) {
                    case 1 -> {
                        if (palindrome.checkWithStack(input)) {
                            System.out.println(input + " is a palindrome");
                        } else {
                            System.out.println("Input is not  palindrome");
                        }
                    }
                    case 2 -> {
                        if (palindrome.checkWithQueue(input)) {
                            System.out.println(input + " is a palindrome");
                        } else {
                            System.out.println("Input is not  palindrome");
                        }
                    }
                    default -> System.out.println("Wrong Selection");
                }
                break;
            }
            default -> System.out.println("Wrong selection");
        }

    }
}
