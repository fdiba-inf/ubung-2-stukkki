package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int x = n % 2;
        if (x == 0) {
          System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
          }
        

  }      
        }

    
