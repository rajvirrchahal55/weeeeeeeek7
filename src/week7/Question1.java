package week7;
/*1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme.
                         Answers*/
public class Question1 {
    //1.1
int a=15;
int b=20;

 //1.2
 public void m1(){
System.out.println(a);
    }
//1.3
    public void m2(){
     System.out.println(a);
  System.out.println(b);
    }
//1.4
public static void main (String []args){
//1.5
Question1 obj=new Question1();
obj.m2();
}
}

