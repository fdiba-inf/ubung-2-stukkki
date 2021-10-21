package exercise2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int r=input.nextInt();
        double c=2*Math.PI*r;
        System.out.println("Circumference: "+ c);
        double a=Math.PI*r*r;
        System.out.println("Area: "+ r);
        }

    }
