package com.company;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Assignment2 {
    public static void main(String[] args) {
        Stack();
        Queue();
    }

    public static void Stack() {
        Stack<String> Palindrome = new Stack<>();
        Palindrome.push("Mom");
        Palindrome.push("Was it a car or a cat I saw?");
        Palindrome.push("Madam, in Eden, I’m Adam.");
        Palindrome.push("Yo, banana boy!");
        Palindrome.push("Check if Palindrome loop is working.");

        for (String sentence : Palindrome) {
            System.out.format("%n" + sentence);
            if (isPalindrome(sentence)) {
                System.out.format("%nThis sentence is Palindrome%n");
            } else {
                System.out.format("%nThis sentence isn't Palindrome%n");
            }
        }

    }

    public static void Queue() {
        ArrayBlockingQueue<String> Palindrome = new ArrayBlockingQueue<String>(5);
        Palindrome.add("Mom");
        Palindrome.add("Was it a car or a cat I saw?");
        Palindrome.add("Madam, in Eden, I’m Adam.");
        Palindrome.add("Yo, banana boy!");
        Palindrome.add("Check if Palindrome loop is working.");

        for (String sentence : Palindrome) {
            System.out.format("%n" + sentence);
            if (isPalindrome(sentence)) {
                System.out.format("%nThis sentence is Palindrome%n");
            } else {
                System.out.format("%nThis sentence isn't Palindrome%n");
            }
        }
    }

    public static boolean isPalindrome(String sentence) {
        String newSentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int i = 0, j = newSentence.length() - 1;
        while (i < j) {
            if (newSentence.charAt(i) != newSentence.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;

    }


}
