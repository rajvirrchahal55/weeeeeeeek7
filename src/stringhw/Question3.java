package stringhw;
/*3. Write a java program which replace a “I love java” to “we love java” Expected output: We love java
*/
public class Question3 {
    public static void main(String[]args){
        String line="I love java";
        String line2=line.replace("I love","we love");
        System.out.println(line2);

    }
}
