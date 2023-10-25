package week7;
/*13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:

Width = 5.5 Height = 8.5

Expected Output:

Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/
public class Question13 {
   static double a=5.6;
   static double b=8.5;

    public static void main(String[]args){
   System.out.println("area of rectangle where width is=5.5 length is=8.5 : " +(a*b));
   System.out.println("perimeter of rectangle where width is=5.5 lenght is=8.5 : " + (2*(a+b)));
    }

}
