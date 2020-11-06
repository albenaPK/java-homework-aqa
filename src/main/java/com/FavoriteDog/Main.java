package com.FavoriteDog;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanObject = new Scanner(System.in);

        String name = scanObject.nextLine();
        String food = scanObject.nextLine();
        String color = scanObject.nextLine();
        String breed = scanObject.nextLine();
        int age = scanObject.nextInt();

        {
            System.out.println("My dog name is " + name);
            System.out.println("My dog likes eating " + food);
            System.out.println("His color is " + color);
            System.out.println("Dog breed is " + breed);
            System.out.println("His age is " + age);

            if (age > 5) {

                System.out.println("The dog is barking a lot.");
            } else {
                System.out.println("The dog is not barking a lot.");


            }
        }

        printDogData("Gogo", 3);
    }

    private static void printDogData(
            String name, int age) {
        if (age < 5) {
            System.out.println("This dog is bigger then " + name);
        } else {
            System.out.println("This dog is smaller then " + name);
        }
    }
}

