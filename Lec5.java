import java.util.*;

public class Lec5 {
    //Make a function to print your name
    public static void printMyName(String name){
        System.out.println("My name is " + name);
        return;
    }

    //Make a function to claclulate the sum of two numbers
    public static int calculateSum(int a, int b){
        return a + b;
    }

    //Make a function to claclulate the product of two numbers
    public static int multiply(int a, int b){
        return a * b;
    }

    //Factorial without recursion
    public static int factorial(int n){
        if(n < 0){
            System.out.println("Factorial of negative number is not possible");
            return -1;
        }
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    //Function to check Prime Numbers
    public static void checkPrime(int n){
        if(n < 2){
            System.out.println(n + " is not a prime number");
            return;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println(n + " is not a prime number");
            } else {
                System.out.println(n + " is a prime number");
            }
        }
    }

    //Function to check even or odd
    public static void checkEvenOdd(int n){
        if(n % 2 == 0){
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }
    }

    //Function to print the table of a given number
    public static void printTable(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n * i);
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Function 1
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        printMyName(name);

        //Function 2
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of a and b is: " + sum);

        //Function 3
        int product = multiply(a, b);
        System.out.println("Product of a and b is: " + product);

        //Function 4
        System.out.println("Enter a number to calculate factorial: ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);

        //Homework Problem 1
        System.out.println("Enter a number to check if it is prime: ");
        int num = sc.nextInt();
        checkPrime(num);

        //Homework Problem 2
        System.out.println("Enter a number to check if it is even or odd: ");
        int num2 = sc.nextInt();
        checkEvenOdd(num2);

        //Homework Problem 3
        System.out.println("Enter a number to print its table: ");
        int num3 = sc.nextInt();
        printTable(num3);
    }
}
