package week7;
/*5. Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.)
                             answers*/

public class Question5 {
    int a = 15;
    int c = 20;
    static int d = 30;
    static int b = 25;

    public static void main(String[] args) {
        Question5 obj = new Question5();
        obj.demo();
        obj.demo1();
        m1();
        m2();
    }


    public static void m1() {
        Question5 obj = new Question5();
        System.out.println("addition of " + obj.a + " and " + b+" : "+(obj.c-d));
        System.out.println("Subtraction of " + obj.a + " and " + b);
        System.out.println("division of " + obj.a + " and " + b);
        System.out.println("multiplication of" + obj.a + "and" + b);
    }

    public static void m2() {
        Question5 obj = new Question5();
        System.out.println("addition of" + obj.c + "and" + d + " : " +( obj.c +b));
        System.out.println("subtraction of" + obj.c + "and" + d);
        System.out.println("multiplication of" + obj.c + "and" + d);
        System.out.println("division of" + obj.c + "and" + d);
    }

    public void demo() {
        Question5 x = new Question5();
        System.out.println("addition of" + a + "and" + d + " : " +(b+c));
        System.out.println("subtraction of" + a + "and" + d);
        System.out.println("multiplication of" + a + "and" + d);
        System.out.println("division of" + a + "and" + d);
    }

    public void demo1() {
        Question5 x1= new Question5();
        System.out.println("addition of" + c + "and" + b + " : " + (a-d));
        System.out.println("multiplication of" + c + "and" +b);
        System.out.println("division of" + c + "and" +b);
        System.out.println("subtraction of" + c + "and" +b);
    }

}
