package exercise2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int x;
        int y;
        int z;
        int help;

        x = number / 100;
        help = number / 10;
        y = help % 10;
        z = number % 10;
        int sum = x + y + z;
        System.out.println("Sum of digits: " + sum);
        }

    }
