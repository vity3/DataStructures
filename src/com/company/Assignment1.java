package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment1 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Computer");
        words.add("Plate");
        words.add("Chair");
        words.add("Girl");
        words.add("Boy");
        words.add("Cat");
        words.add("Dog");
        words.add("Shirt");
        words.add("Determination");

        int countStartsWithC = 0;
        int countEndsWithE = 0;
        int countLength5 = 0;
        int countContainsE = 0;
        boolean hasSubString = false;

        for (int eachWord = 0; eachWord < words.size(); eachWord++) {
            if (words.get(eachWord).charAt(0) == 'C')
                countStartsWithC++;
            if (words.get(eachWord).charAt(words.get(eachWord).length() - 1) == 'e')
                countEndsWithE++;
            if (words.get(eachWord).length() == 5)
                countLength5++;
            if (words.get(eachWord).contains("e"))
                countContainsE++;
            if (words.get(eachWord).contains("te"))
                hasSubString = true;
        }

        System.out.format("Array contains %d " + (countStartsWithC == 1 ? "word" : "words") + " that starts with C and %d " + (countEndsWithE == 1 ? "word" : "words") + " that ends with e.", countStartsWithC, countEndsWithE);
        System.out.format("%nArray contains %d " + (countLength5 == 1 ? "word" : "words") + " with length 5.", countLength5);
        System.out.format("%nArray contains %d " + (countContainsE == 1 ? "word" : "words") + " that consist of the character e.", countContainsE);
        System.out.format("%nAre there any words which consists of the subString “te”? Answer: " + hasSubString + "%n");

        System.out.format("%nWord list before sorting:%n" + words + "%n");

        Collections.sort(words);

        System.out.format("%nWord list in alphabetic order:%n" + words);
    }
}