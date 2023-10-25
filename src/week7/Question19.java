package week7;
/*19. Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.*/
public class Question19 {
   // 19.1
    int groupnum=1234;
    //19.2
    static int groupnum1=12345;
  //19.5
  public static void main(String[]args) {
      int d=1;
      Question19 obj=new Question19();
     System.out.println(d+" "+groupnum1+" "+obj.groupnum);
      obj.selenium();
      agile();}
   // 19.3

public void selenium(){
      int b=2;
    Question19 a=new Question19();
   System.out.println(groupnum+" "+groupnum1+" "+b);}
    //19.4
  public static void agile(){
      int c=3;
      Question19 a=new Question19();
      System.out.println(a.groupnum+"  "+groupnum1+" "+c);}

  }


