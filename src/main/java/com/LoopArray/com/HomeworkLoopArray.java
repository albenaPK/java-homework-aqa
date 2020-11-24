package com.LoopArray.com;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jdk.nashorn.internal.parser.JSONParser;

public class HomeworkLoopArray {

    public static void main(String[] args) {

        printBigArrayNumber();
        averageValue();
        sumEvenAndOddNumbers();
        printNumbersFrom1ToN(11);
        printNumbersFrom1ToNWhichAreNotDivisibleTo3And7(100);
        printNumbersOfFibonachi(5);

    }
    private static void printBigArrayNumber() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        for (int j : array) {
            int i = j * 5;
            System.out.println("New number of element is " + i);
        }
    }

        private static void averageValue() {
            int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
            double sum = 0;
            double sumb = 0;
            for (int j : numbers) {

                sum+= numbers[j];
                sumb = sum/numbers.length;

            }System.out.println("The average value is " + sumb);

    }

    private static void sumEvenAndOddNumbers() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        double sumOdd = 0;
        double sumEven = 0;
        for (int i = 0; i< numbers.length; i++) {

            if (i % 2 == 1){
                sumOdd += numbers[i];
            }
            if (i % 2 ==0){
                sumEven += numbers[i];
            }
        }
        System.out.println("The SUM of odd numbers is " + sumOdd);
        System.out.println("The SUM of even numbers is " + sumEven);
    }

        private static void printNumbersFrom1ToN(int N) {
            for (int i = 1; i <= N; i++) {
                System.out.println(+ i);
            }
        }
        private static void printNumbersFrom1ToNWhichAreNotDivisibleTo3And7(int N) {
            for (int i = 1; i <= N; i++) {
                if ((i % 3 == 1)&&(i% 7 ==1)) {
                    System.out.println(+i);
                }
            }
        }

        private static void printNumbersOfFibonachi(int N){
            int firstNumber = 0;
            int secondNumber = 1;
            int sum = firstNumber + secondNumber;
            for(int i = 3; i<=N; i++){

                int nextNumber = firstNumber+secondNumber;
                sum+=nextNumber;
                firstNumber=secondNumber;
                secondNumber=nextNumber;
            }
            System.out.println("SUM of Fibonachi is: " + sum);

        }

}
