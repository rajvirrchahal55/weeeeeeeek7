package week7;
/*7. Write a program to insert any temperature value in degree Fahrenheit and convert
to degree Celsius ((F − 32) × 5/9 = 0°C).*/


import java.util.Scanner;
public class Question7 {
    static double x=0.556;
    public static void main(String[]args){
        Scanner myObj=new Scanner(System.in);
        System.out.println("enter any temperture");
        double c=myObj.nextDouble();

        double degree= (c - 32) * x;
        System.out.println("convert Farhrenheit to Celsius " +c+ " and "+degree);

    }

}
