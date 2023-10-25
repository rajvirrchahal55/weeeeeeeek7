package week7;
/*17. Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.*/
public class Question17 {
  //17.1
  String city="California";//instance variables
    //17.2
    static String city2="CalifornaUSA";//static variables
    //17.3
    public void m1() {
        Question17 obj=new Question17();
        System.out.println(city+" "+city2 );
    }
    //17.4
    public static void m2(){
        Question17 obj=new Question17();
        System.out.println(obj.city+" "+ city2);
    }
    //17.5
    public static void main(String[]args){
        Question17 obj=new Question17();
        obj.m1();
        m2();



    }







}
