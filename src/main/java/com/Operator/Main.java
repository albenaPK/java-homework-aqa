package com.Operator;

public class Main {

    public static void main(String[] args) {

//1. Day of week.
        getDayOfWeek(1);

        //2. Perimeter and array of rectangle.
        getPerimeterOfRectangle(5.0, 6.0);
        System.out.println(getPerimeterOfRectangle(5.0, 6.0));

        getArrayOfRectangle(5.0, 6.0);
        System.out.println(getArrayOfRectangle(5.0, 6.0));

        //3. Positive or negative number.
        positiveOrNegativeNumber(-5);

        //4. Max number

        int a = 25, b = 32, c = 18;

        if( a >= b && a >= c)
            System.out.println(a+" is Max Number.");

        else if (b >= a && b >= c)
            System.out.println(b+" is Max Number.");

        else
            System.out.println(c+" is Max Number.");

    }

    //1. Day of week.
    private static void getDayOfWeek(int day) {

        String weekDay;

        switch (day) {
            case 1:
                day = 1;
                weekDay = "Monday";
                break;
            case 2:
                day = 2;
                weekDay = "Tuesday";
                break;
            case 3:
                day = 3;
                weekDay = "Wednesday";
                break;
            case 4:
                day = 4;
                weekDay = "Thursday";
                break;
            case 5:
                day = 5;
                weekDay = "Friday";
                break;
            case 6:
                day = 6;
                weekDay = "Saturday";
                break;
            case 7:
                day = 7;
                weekDay = "Sunday";
                break;
            default:
                weekDay = "Unknown";
        }

        System.out.println("You entered " + day + ". So week day is " + weekDay + ".");
    }

    //2. Perimeter and array of Rectangle.
    private static double getPerimeterOfRectangle(double length, double height) {

        return (length + height) * 2;
    }

    private static double getArrayOfRectangle(double length, double height) {

        return (length * height);
    }
    //3. Positive or negative number.

    private static void positiveOrNegativeNumber(int number) {

        if (number >= 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }
    }

}





