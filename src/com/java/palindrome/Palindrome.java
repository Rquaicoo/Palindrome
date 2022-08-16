package com.java.palindrome;

import java.io.Console;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {

    public boolean checkWithStack(String text) {
        Stack stack = new Stack<String>();
        String reverse = "";
        for(int i=0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        for(int i=0; i < text.length(); i++) {
            reverse += stack.pop();
        }

        if ( text.equals(reverse)) {
            return true;
        }

        else {
            return false;
        }
    }

    public boolean checkWithQueue(String text) {
        String reverse = "";

        Queue queue = new LinkedList<String>();

        for(int i=0; i < text.length(); i++) {
            queue.add(text.charAt(i));

        }

        for (int i=0; i < text.length(); i++) {
            reverse = queue.remove() + reverse;
        }

        System.out.println(text + " " + reverse);
        if ( text.equals(reverse)) {
            return true;
        }

        else {
            return false;
        }
    }
}
