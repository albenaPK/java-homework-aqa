package com.HomeworkAK;

import com.sun.org.apache.bcel.internal.generic.ArrayElementValueGen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main homework = new Main();
        //1
        homework.replaceString();

        //2
        System.out.println(homework.areStringsEqual(homework.firstString, homework.secondString));

        //2a???

        //3
        homework.countWords();

        //4
        String firstName = "Albena ";
        String secondName = "Petrova ";
        String lastName = "Kazepova";
        homework.concatStrings(firstName, secondName, lastName);
    }


    //1. Replace the name.
    private void replaceString() {

        String string01 = "This is Test.";
        System.out.println("Initial string: " + string01);
        String string02 = string01.replace("Test", "my dog");
        System.out.println("String after replacement: " + string02);
    }

    //2. Compare the two strings
    String firstString = "I am trying to do my Homework";
    String secondString = "I am trYing to do my Homework";

    private boolean areStringsEqual(String firstString, String secondString) {
        return firstString.equals(secondString);
    }


//    //2a Second method for comparison  - more complicated.
//    private void comparisonOfStrings() {
//        String firstString = "I am trying to do my Homework";
//        String secondString = "I am trYing to do my Homework";
//        System.out.println("String 1: " + firstString);
//        System.out.println("String 2: " + secondString);
//
//
//        int result = firstString.compareTo(secondString);
//
//        if (result < 0) {
//            System.out.println("Both strings are not equal.");
//        } else if (result == 0) {
//
//            System.out.println("Both strings are equal.");
//        } else {
//            System.out.println("Both strings are not equal for sure.");
//        }
//    }


    //3. Counting words in a String.
    private void countWords() {
        String str = "I need to know how many words are in this String.";
        String[] stringParts = str.split(" ");
        System.out.println(stringParts.length);
    }

    //4. Concatenate strings.
    private void concatStrings(String firstName, String secondName, String lastName) {
                System.out.println(firstName.concat(secondName).concat(lastName));
    }
}




