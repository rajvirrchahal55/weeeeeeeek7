package week7;
/*14. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/

public class Question14 {
   static int a=125;
   static int b=24;
    public static void main(String[] args) {
        Question14 x=new Question14();

        int add = a + b;
        int subtract = a - b;
        int multiply = a * b;
        int divide = a/b;
        double mod = a%b;
        System.out.println("Expected results :");
        System.out.println("Addition " + a + " + " + b + " = " + add);
        System.out.println("Subtract " + a + " - " + b + " = " + subtract);
        System.out.println("Multiply " + a + " * " + b + " = " + multiply);
        System.out.println("Divide " + a + " / " + b + " = " + divide);
        System.out.println("mod " + a + " % " + b + " = " + mod);

    }

}
