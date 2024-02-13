/*
 * In this lecture, I learnt about loops in Java. There are three types of loops in Java:
 * 1. for loop
 * 2. while loop
 * 3. do-while loop
 */

import java.util.*;

public class Lec3 {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        // for loop
        for(int i = 0; i < 11; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // while loop
        int j = 0;
        while(j < 11){
            System.out.print(j + " ");
            j++;
        }

        System.out.println("\n");

        // do-while loop
        int k = 0;
        do{
            System.out.print(k + " ");
            k++;
        } while(k < 11);

        System.out.println("\n");

        //print the sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        //print the table of a number
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        for(int i = 1;  i <= 10; i++){
            System.out.print(num * i + " ");
        }

        System.out.println("\n");

        //Homwork Problem 1
        //print all even numbers till n
        System.out.println("Enter a number: ");
        int m = sc.nextInt();

        for(int i = 1; i <= m; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\n");

        //Homework Problem 2
        //run the following code and observe the output
        
        // for(;;){
        //     System.out.println("Hello");
        // }

        //It is an infinite loop. It will keep on printing "Hello" infinitely.

        //Homwork Problem 3
        
        System.out.println("Enter 1 or 0: ");
        int p = sc.nextInt();
        if(p == 1){
            System.out.println("Enter Marks: ");
            int marks = sc.nextInt();
            do{
                if(marks >= 90){
                    System.out.println("This is Good");
                } else if(marks >= 60){
                    System.out.println("This is also Good");
                } else {
                    System.out.println("This is Good as well");
                }
                
                System.out.println("Enter Marks: ");
                marks = sc.nextInt();
            }
            while(marks != 0);
            
        }

        //Bonus Problem
        //Check for prime number

        System.out.println("Enter a number to check : ");
        int num1 = sc.nextInt();
        boolean isPrime = true;

        for(int i = 2; i < num1; i++){
            if(num1 % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
