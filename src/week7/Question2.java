package week7;
/*2. Write a Java programme using the following steps.
        2.1 Declare two static variables.
        2.2 Declare one static method.
        2.3 Call both static variables into the static method inside the print statement.
        2.4 Declare the Main method.
        2.5 Call the static method into the Main method and run the programme.
                          answers*/
//2.1
public class Question2 {
    static int a=15;
    static int b=20;
    //2.2
    public static void demo() {
        //2.3
        System.out.println(a);
        System.out.println(b);
    }
   //2.4
   public static void main(String []args){
     // 2.5
       System.out.println(a+b);
     System.out.println(a);
     System.out.println(b);
     demo();
    }
}
