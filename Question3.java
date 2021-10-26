package com.company;

import java.util.Scanner;

class Average{
    double num1 = 0.0;
    double num2 = 0.0;
    double num3 = 0.0;
    public Average(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter number two: ");
        num2 = scanner.nextDouble();
        System.out.println("Enter number three: ");
        num3 = scanner.nextDouble();
    }
    public void displayAverage(){
        double average = Math.round(((num1+num2+num3)/3)*100.0)/100.0;
        System.out.println("Average: " + average);
    }

}

public class Question3 {
    public static void main(String[] args) {
        Average avg = new Average();
        avg.displayAverage();



    }
}
