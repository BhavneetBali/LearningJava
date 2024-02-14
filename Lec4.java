/*
 * In this lecture, I learned about the following patterns:
 * 1. Print a rectangle with '*'
 * 2. Print a hollow rectangle with '*'
 * 3. Print half pyramid with '*'
 * 4. Print inverted half pyramid with '*'
 * 5. Print half pyramid on the right side with '*'
 * 6. Print number pyramid
 * 7. Print inverted number pyramid
 * 8. Print Floyd's triangle
 * 9. Print 1 0 Floyd's triangle
 * 
 * I also learned about the following concepts:
 * 1. Nested for loop
 * 2. Using if-else statement to print different characters
 * 3. Using boolean flag to print different characters
 * 4. Using modulo operator to print different characters
 * 5. Using count variable to print different characters
 * 6. Using different conditions to print different characters
 */

import java.util.*;

public class Lec4 {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Print a rectangle with '*' 
        System.out.println("Enter the number of rows :");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int col = sc.nextInt();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print a hollow rectangle with '*'
        System.out.println("Enter the number of rows :");
        row = sc.nextInt();
        System.out.println("Enter the number of columns :");
        col = sc.nextInt();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(i == 0 || j == 0 || i == row - 1 || j == col-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Print half pyramidd with '*'
        System.out.println("Enter the number of rows :");
        row = sc.nextInt();
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print inverted half pyramidd with '*'
        System.out.println("Enter the number of rows :");
        row = sc.nextInt();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < row-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print half pyramid on the right side with '*'
        System.out.println("Enter the number of rows :");
        row = sc.nextInt();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < row; j++){
                if(j < row - i - 1){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // Print number pyramid
        System.out.println("Enter the number of rows :");
        row = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Print inverted number pyramid
        System.out.println("Enter the number of rows :");
        row = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row - i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Print Floyd's triangle
        System.out.println("Enter the number of rows :");
        row = sc.nextInt();
        int count = 1;

        for(int i = 0; i < row; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        // Print 1 0 Floyd's triangle
        System.out.println("Enter the number of rows :");
        row = sc.nextInt();
        boolean flag = true;

        //Solution 1
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                if(i % 2 != 0){
                    if(flag){
                        System.out.print("1 ");
                        flag = false;
                    } else {
                        System.out.print("0 ");
                        flag = true;
                    }
                } else {
                    if(flag){
                        System.out.print("0 ");
                        flag = false;
                    } else {
                        System.out.print("1 ");
                        flag = true;
                    }
                }
            }
            System.out.println();
            flag = true;
        }

        System.out.println();

        //Solution 2
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0){
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    if(j % 2 == 0){
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }

        System.out.println();

        //Solution 3
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
