/*5.	The class Math contains numerous static methods for performing basic numeric operations such as the elementary exponential,
 logarithm, square root, and trigonometric functions. You can use the methods in your programs.
  Search the Internet for a list of methods that this class contains. Then, using the Math class,
   write a program that calculates and displays:
a.	The larger of two numbers: 34 and 49
b.	PI number
c.	Absolute value of -17
d.	Square root of the expression: nine divided by two
e.	Random number in the range <0.0,1.0)
f.	Integer random number in the range <0,10>
g.	Sine of 90 degrees
 */

package ClassStructure;

public class Mathh {

    public static void main(String[] args){

        double dziew = Math.toRadians(90);
        System.out.println(Math.max(34,49));
        System.out.println(Math.PI);
        System.out.println(Math.abs(-17));
        System.out.println(Math.sqrt(9.00/2.00));
        System.out.println(Math.random());
        System.out.println((int) (Math.random()*11));
        System.out.println(Math.sin(dziew));

    }


    
}
