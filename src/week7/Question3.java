package week7;
/*3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
                         answers*/
public class Question3 {
    //3.1
    int a=15;
 static int b=20;
 //3.2
    public void m(){
     System.out.println(a);
    }
//3.3
    public static void m1(){
        System.out.println(b);
    }
//3.4
  public void m2(){
  Question3 obj=new Question3();
System.out.println(obj.b+a);
  }
public static void m3(){
 Question3 x= new Question3();
 System.out.println(x.a+b);
}
//3.5
    public static void main(String []args) {
//3.6
        Question3 x = new Question3();
        x.m2();
        m1();


    }

}
