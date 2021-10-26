package com.company.HW2;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        double length = scanner.nextDouble();
        System.out.println("Enter Width");
        double width = scanner.nextDouble();
        int area = (int)(length*width);
        System.out.println("Area: " + area);
    }

}
