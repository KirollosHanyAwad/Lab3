package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) throws IOException {
//task 1
        float firstNumber, secondNumber, sum, subtraction, product, quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to the calculator where you can add, subtract, multiply and divide two numbers");
        System.out.println("Choose your first number");
        firstNumber = Float.parseFloat(br.readLine());
        System.out.println("Choose your second number");
        secondNumber = Float.parseFloat(br.readLine());

        sum = firstNumber + secondNumber;
        subtraction = firstNumber - secondNumber;
        product = firstNumber * secondNumber;
        quotient = firstNumber / secondNumber;

        System.out.printf("you entered two numbers, the first was " + "%2.2f", firstNumber);
        System.out.printf(" and the second was " + "%2.2f\n", secondNumber);

        System.out.printf("S5um = " + "%2.2f\n", sum);
        System.out.printf("Subtraction = " + "%2.2f\n", subtraction);
        System.out.printf("Product = " + "%2.2f\n", product);
        System.out.printf("quotient = " + "%2.2f\n\n", quotient);


//task 2
        float height, weight, bmi;

        System.out.println("Welcome to the BMI calculator where we will tell whether you are fat or fit ;)");
        System.out.println("Please enter your height");
        height = Float.parseFloat(br.readLine()) / 100;
        System.out.println("Please enter your weight");
        weight = Float.parseFloat(br.readLine());

        bmi = (float) (weight / (Math.pow(height, 2)));
        System.out.printf("Your BMI is " + "%2.2f\n", bmi);

        if (bmi < 16.00) {
            System.out.println("Starvation\n\n");
        } else if (bmi >= 16.00 && bmi < 16.99) {
            System.out.println("Emaciation\n\n");
        } else if (bmi >= 17.00 && bmi < 18.49) {
            System.out.println("Normal, low range\n\n");
        } else if (bmi >= 18.50 && bmi < 22.99) {
            System.out.println("Normal, high range\n\n");
        } else if (bmi >= 23.00 && bmi < 27.49) {
            System.out.println("Overweight, low range\n\n");
        } else if (bmi >= 27.50 && bmi < 29.99) {
            System.out.println("Overweight, high range\n\n");
        } else if (bmi >= 30.00 && bmi < 34.9) {
            System.out.println("1st degree obesity\n\n");
        } else if (bmi >= 35.00 && bmi < 39.9) {
            System.out.println("2nd degree obesity\n\n");
        } else if (bmi >= 40.00) {
            System.out.println("3rd degree obesity\n\n");
        }


//task 3

        double a, b, c, x1, x2, delta;
        char rootsNo = 0;

        System.out.println("This program calculates the roots of the equation ax^2 + bx +c = 0");
        System.out.println("Please enter value of a");
        a = Double.parseDouble(br.readLine());

        if (a == 0) {
            System.out.println("Invalid value of a");
        } else {
            System.out.println("Please enter value of b");
            b = Double.parseDouble(br.readLine());

            System.out.println("Please enter value of c");
            c = Double.parseDouble(br.readLine());

            delta = pow(b,2)-4*a*c;

            if (delta < 0) rootsNo = 0;
            if (delta == 0) rootsNo = 1;
            if (delta > 0) rootsNo = 2;

            switch (rootsNo){
                case 0: System.out.println("There are no roots\n\n"); break;

                case 1:{
                    x1 = -b/(2*a);
                    System.out.printf("For a = " + "%4.2f,",a);
                    System.out.printf(" b = " + "%4.2f,",b);
                    System.out.printf(" c = " + "%4.2f,",c);
                    System.out.printf("The trinomial has one double root = ");
                    System.out.printf("%4.2f.\n\n",x1);
                    break;
                }

                case 2: {
                    x1 = (-b-sqrt(delta)) / (2*a);
                    x2 = (-b+sqrt(delta)) / (2*a);
                    System.out.printf("For a = " + "%4.2f,",a);
                    System.out.printf(" b = " + "%4.2f,",b);
                    System.out.printf(" c = " + "%4.2f.\n",c);
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f.\n",x1);
                    System.out.print("x2 = ");
                    System.out.printf("%4.2f.\n\n",x2);
                    break;
                }
            }
        }



//task 4
        int total =0;

        for (int i = 0; i < 101; i+=2){
          total+= i;
        }

        System.out.println("The sum of all even numbers from 1 - 100 = " + total + "\n\n" );



//task 5
        int i = 1, rnd, min = 101, max = 0;

        System.out.println("The program draws 10 random numbers from 1 - 100 and finds the smallest and the largest numbers");

        Random r = new Random();
        System.out.print("Numbers drawn: ");

        while (i <= 10){
            rnd = round((r.nextInt(100)+1));
            System.out.print(rnd + ", ");

            if(rnd < min) min = rnd;
            if (rnd > max) max =rnd;

            i++;
        }
        System.out.println("\n" + max + " is the max");
        System.out.println(min + " is the min");
    }

}
