/*
 * In this program, we will calculate the area of a circle.
 * I learned how to take input from the user and how to use the Scanner class.
 * I learned how to show the output to the user.
 * The function areaOfCircle takes the radius of the circle as input and returns the area of the circle.
 * I was able to write the function because I had prior knowlwedge of programmning in C++ so I was trying and it worked.
 */

import java.util.*;

public class Lec1 {
    public static double areaOfCircle(int r){
        return 3.14*r*r;
    }
    public static void main(String[] args){
        //Input
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius :");
        int r = sc.nextInt();

        //Claclute the sum of Varibales
        double area = areaOfCircle(r);

        //Output
        System.out.println("Area of circle is : " + area);
    }
}
