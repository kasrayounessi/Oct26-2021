package com.company.HW2;

import java.util.Scanner;

class Introduction{
    public Introduction(String name, int rollNumber, String interest){
        System.out.println("Hey, my name is " + name + " and my roll number is "+ rollNumber + ". My field of interest is " + interest + ".");
    }
}

//Implemented the solution in form of the object for further practice

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.println("Enter field of interest: ");
        String interest = scanner.next();
        Introduction intro = new Introduction(name, rollNumber, interest);

    }
}
