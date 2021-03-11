package com.company;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Assignment2 {
    public static void main(String[] args) {
        Stack();
        Queue();
    }

    public static void Stack() {
        String testSentence = "Mom";
//        String testSentence = "Was it a car or a cat I saw?";
//        String testSentence = ("Madam, in Eden, I’m Adam.");
//        String testSentence = "Yo, banana boy!";
//        String testSentence = "Check if Palindrome method is working.";
        String sentence = testSentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
        Stack<Character> Palindrome = new Stack();

        for (int i = 0; i < sentence.length(); i++) {
            Palindrome.push(sentence.charAt(i));
        }

        String reverseSentence = "";

        while (!Palindrome.isEmpty()) {
            reverseSentence = reverseSentence + Palindrome.pop();
        }

        if (sentence.equals(reverseSentence))
            System.out.println("The sentence is a Palindrome.");
        else
            System.out.println("The sentence is not a Palindrome.");

    }

    public static void Queue() {
//        String testSentence = "Mom";
//        String testSentence = "Was it a car or a cat I saw?";
//        String testSentence = "Madam, in Eden, I’m Adam.";
//        String testSentence = "Yo, banana boy!";
        String testSentence = "Check if Palindrome method is working.";
        String sentence = testSentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
        ArrayBlockingQueue<Character> Palindrome = new ArrayBlockingQueue<Character>(sentence.length());

        for (int i = sentence.length() - 1; i >= 0; i--) {
            Palindrome.add(sentence.charAt(i));
        }

        String reverseString = "";

        while (!Palindrome.isEmpty()) {
            reverseString = reverseString + Palindrome.remove();
        }
        if (sentence.equals(reverseString))
            System.out.println("The sentence is a Palindrome.");
        else
            System.out.println("The sentence is not a Palindrome.");

    }

}


