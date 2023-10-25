package week7;
/*6. Write a program to enter any radius value of the circle and find out the area. (Formula
of Area A=PI*r*r).*/


import java.util.Scanner;

public class Question6 {
    static private double pi = 3.144;


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter any Radius:");
        double r = myObj.nextDouble();
        double area = r*r*pi;
System.out.println("the area of " + r + " is:");
System.out.print(area);

    }
}




