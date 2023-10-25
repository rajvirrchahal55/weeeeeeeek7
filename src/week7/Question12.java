package week7;
/*12. Write a Java program that takes three numbers as input to calculate and print the
average of the numbers.*/
import java.util.Scanner;
public class Question12 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
System.out.println("Enter first numnber:");
int a = input.nextInt();

System.out.println("Enter second number:");
int b=input.nextInt();


System.out.println("Enter third number:");
int c=input.nextInt();
System.out.println(" average of the entered numbers is:"+(a+b+c)/3);



    }
}
