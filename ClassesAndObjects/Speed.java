/*23.	The speed of vehicles on a highway in Poland must be between 40 and 140 km/h.
 Write a program that checks whether the vehicle speed saved in a variable is correct. Sample result:
Vehicle speed: 158
Speed is valid: False
 */

package ClassesAndObjects;

public class Speed {

    static int speed = 158;

    public static void main(String[] args){
            if(speed<140 && speed>40){
                System.out.println("Speed is good");
            }
            else{
                System.out.println("Speed out of range");
            }
    }
    
}
