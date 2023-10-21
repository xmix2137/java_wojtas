/*22.	A variable contains your height in cm.
 Write a program that calculates and displays your height both in cm and in feet and inches. Sample result: 
 I am 170cm tall, i.e. 5 feet and 7 inches
 */

package ClassesAndObjects;

public class Tall {

    static double height_in_cm = 191.00;
    static double height_in_feet = 191.00/30.48;

    public static void main(String[] args){

        System.out.println("I am "+height_in_cm+"cm tall, i. e. "+height_in_feet+"feet");

    }


    
}
