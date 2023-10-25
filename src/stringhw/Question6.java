package stringhw;
/*6. Write a java program which replace a “I@love@java” to “we love java” Expected output: We love java
*/
public class Question6 {
    public static void main(String[]args){
        String a="I@love@java";
        String b=a.replace("I@love@java","We love java");
        System.out.println(b);
    }
}
