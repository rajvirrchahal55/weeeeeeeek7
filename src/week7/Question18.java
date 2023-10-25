package week7;
/*18. Write a Java Program using below steps.
18.1 Declare your council name as static variables.
18.2 Declare your house number as instance variables.
18.3 Declare one instance method name borough() and call Static variable
18.4 Declare static method name address() and call instance variable
18.5 Call both user defined methods into main method.*/
public class Question18 {
    // 18.1
    static String council="Solono";//static variable
    //18.2
    int housenum=1234;//instance variable
    //18.3
    public void borough(){
       Question18 obj=new Question18();
       System.out.println(council);
    }
    //18.4
    public static void address(){
        Question18 obj=new Question18();
        System.out.println(council+"  "+obj.housenum);
    }
   //18.5
    public static void main(String[]args){
        Question18 obj=new Question18();
        obj.borough();
        address();


    }

}
