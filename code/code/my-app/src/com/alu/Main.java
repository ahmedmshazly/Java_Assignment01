package com.alu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // preparing the input class
        Scanner input = new Scanner(System.in);

        float height;
        float weight;
        float BMI;
        byte choice;
        boolean condition;
        float width;
        float length;
        float s_area;
        float perimeter;

        do {
            System.out.println("Please choose which programme you want to run: ");
            System.out.println("1. BMI Calculator \n2. Rectangle Calculator");

            choice = input.nextByte();

            if (choice == 1 || choice == 2)
                condition = true;

            else condition = false;

            if (condition == false)
                System.out.println("Please input a correct answer between 1 or 2");
        }
        while (condition == false);

        if (choice == 1) {
            System.out.println("Welcome to The BMI Calculator\nPlease Follow the following instructions to calculate your bmi");
            System.out.println("Please input your weight: ");
            weight = input.nextFloat();
            System.out.println("Please input your height: ");
            height = input.nextFloat();

            BMI = (weight / ((int) height^2));
            System.out.printf("Your BMI = %.2f kg/m2", BMI);

        }
        else if (choice == 2)
            System.out.println("Welcome to The Rectangle Programme \n lease Follow the following instructions to calculate the areas");
            System.out.println("Please enter the length in CMs: ");
            length = input.nextFloat();
            System.out.println("Please enter the width in CMs: ");
            width = input.nextFloat();

            s_area = length * width;
            perimeter = (length + width) * 2;

            System.out.printf("The Surface area using short is = %d \nThe Perimeter using short = %d\n", (short) s_area, (short) perimeter );
            System.out.printf("The Surface area using int is = %d \nThe Perimeter using int = %d\n", (int) s_area, (int) perimeter );
            System.out.printf("The Surface area using double is = %.4f \nThe Perimeter using double = %.4f\n", (double) s_area, (double) perimeter );
            System.out.printf("The Surface area using long is = %d \nThe Perimeter using long = %d\n", (long) s_area, (long) perimeter );


    }
}
