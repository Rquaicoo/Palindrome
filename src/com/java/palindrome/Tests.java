package com.java.palindrome;

public class Tests {

    public void runTests() {
        String[] array = {"aba", "1234321", "asdfdsa", "baa", "xyzyx", "gduibdj"};

        boolean[] result = {true, true, true, false, true, false};

        int correct = 0;

        Palindrome palindrome = new Palindrome();


        for(int i=0; i < array.length; i++) {
            boolean stackResult = palindrome.checkWithStack(array[i]);
            boolean queueResult = palindrome.checkWithQueue(array[i]);

            String report = array[i] + ": " + "Stack Result: " + stackResult + "\n Queue result: " + queueResult + "\n Expected Result: " + result[i];

            if (stackResult == result[i] && queueResult == result[i])
                {
                    System.out.println("Test passed");
                    System.out.println(report + "\n");
                    correct +=1;

                }
            else {
                System.out.println("Test failed. String '" + array[i] + "' returned a wrong result.");
                System.out.println(report + "\n");
            }
        }
        System.out.println("Correct: " + correct + "/" + array.length);
    }
}
