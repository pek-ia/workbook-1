package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        double bobSalary = 2000.;
        double garySalary = 3000.;
        double higherSalary;

        higherSalary = Math.max(bobSalary, garySalary);

        System.out.println("The higher salary is " + higherSalary);

        double carPrice = 37000.;
        double truckPrice = 79999.;
        System.out.println("The cheaper vehicle costs " + Math.min(carPrice, truckPrice));


    }


}
