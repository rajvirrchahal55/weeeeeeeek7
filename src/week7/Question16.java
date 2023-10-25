package week7;
/*16. Write a Java Program to print as below. (All details to be stored in variable)

"+------------------------+"
"| |"
"| CORNER STORE |"
"| |"
"| 2015-03-29 04:38PM |"
"| |"
"| Gallons: 10.870 |"
"| Price/gallon: $ 2.89 |"
"| |"
"| Fuel total: $ 22.71 |"
"| |"
"+------------------------+"*/
public class Question16 {
  public static void main(String[]args){
      String  line="+------------------------+";
      char quote = '"';
      String A= "|";
      String B= "CORNER STORE";
      String C="2015-03-29 04:38PM";
      String D="Gallons: 10.870";
      String E="Price/gallon: $ 2.89";
      String F="Fuel total: $ 22.71";

 System.out.println(quote + line + quote);
      System.out.println(quote + A + "                        "+ A + quote);
      System.out.println(quote + A + " " + B +   "           " + A + quote);
      System.out.println(quote + A + "                        "+ A + quote);
      System.out.println(quote + A + " " + C + "     " + A + quote);
      System.out.println(quote + A + "                        " + A + quote);
      System.out.println(quote + A + " " + D + "        " + A + quote);
      System.out.println(quote + A + " " + E + "   " + A + quote);
      System.out.println(quote + A + "                        " + A + quote);
      System.out.println(quote + A + " " + F + "    " + A + quote);
      System.out.println(quote + A + "                        " + A + quote);
      System.out.println(quote  + line  + quote);

  }










}
