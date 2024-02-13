/*
 * In this lecture I learnt about if-else conditions and switch case.
 */

import java.util.*;

public class Lec2 {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        // if-else conditions
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();

        if(a == b){
            System.out.println("a is equal to b");
        } else if(a > b){
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less then b");
        }

        // switch case
        System.out.println("Enter the button number :");
        int button = sc.nextInt();

        switch(button){
            case 1:
                System.out.println("Hello !!");
                break;
            case 2:
                System.out.println("Namaste !!");
                break;
            case 3:
                System.out.println("Bonjour !!");
                break;
            default:
                System.out.println("Invalid Input !!");
        }

        //HomeWork Problem 1
        //Calculator
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter a valid operator code(1 : +, 2 : -,3 : *, 4 : /, 5 : %): ");
        int operator = sc.nextInt();

        switch(operator){
            case 1:
                System.out.println("Sum is : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Difference is : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Product is : " + (num1 * num2));
                break;
            case 4:
                System.out.println("Quotient is : " + (num1 / num2));
                break;
            case 5:
                System.out.println("Remainder is : " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid Operator !!!");
        }

        //HomeWork Problem 2
        //Month Conversion from num to text

        System.out.println("Enter the month number :");
        int month = sc.nextInt();

        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Input !!");
        }

    }
}
