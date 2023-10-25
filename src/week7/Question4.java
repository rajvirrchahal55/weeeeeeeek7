package week7;
/*4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
                         answers*/
//4.1
public class Question4 {
    int a=15;
    int b=20;
    static int c=15;
    static int d=20;
    //4.2
    public void m1(){
        System.out.println(a+b);
    }
    //4.3
    public static void m2(){
        System.out.println(c+d);
    }
    //4.4
    public void m4(){
      Question4 obj=new Question4();
      System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
public static void m3(){
    Question4 x= new Question4();
    System.out.println(x.a);
    System.out.println(x.b);
    System.out.println(c);
    System.out.println(d);
}
//4.5
public static void main(String[]args){
 //4.6
    Question4 x= new Question4();
    x.m4();
    m3();
}





}
