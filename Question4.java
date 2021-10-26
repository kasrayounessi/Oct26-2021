package com.company;

abstract class Marks{
    abstract void getPercentage();
}

class A extends Marks{
    int mark1;
    int mark2;
    int mark3;

    public A(int mark1, int mark2, int mark3){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    void getPercentage() {
        System.out.println("Subject one: " + mark1 + "%, subject two: "+ mark2 + "%, subject three: " + mark3 + "%");

    }
}

class B extends Marks{
    int mark1;
    int mark2;
    int mark3;
    int mark4;

    public B(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    void getPercentage() {
        System.out.println("Subject one: " + mark1 + "%, subject two: "+ mark2 + "%, subject three: " + mark3 + "%, subject four: " + mark4 + "%");
    }
}

public class Question4 {
    public static void main(String[] args) {
        A studentA = new A(80,75,85);
        B studentB = new B(70, 45, 90, 85);

        studentA.getPercentage();
        studentB.getPercentage();

    }
}
