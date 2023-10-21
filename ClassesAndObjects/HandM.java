/*25.	Variables ‘hours’ and ‘minutes’ contain the number of hours and minutes that have passed since midnight.
Write a program that displays the given time
(in the format hh:mm – you can use printf() method)
and calculates and displays the number of minutes and the number of seconds that have passed since midnight.
Sample result:
hours = 14
minutes = 27
time: 14:27
minutes from midnight: …
seconds from midnight: …
 */

package ClassesAndObjects;

public class HandM {

    int hours = 14;
    int minutes = 27;

    public static void main(String[] args){

        HandM zegar = new HandM();

        int min_from_mid = zegar.hours*60+zegar.minutes;
        int sec_from_mid = min_from_mid*60;

        System.out.println("hours = "+zegar.hours);
        System.out.println("minutes = "+zegar.minutes);
        System.out.printf("%2d:%2d", zegar.hours, zegar.minutes);
        System.out.println();
        System.out.println("minutes from midnight: " + min_from_mid);
        System.out.println("seconds from midnight: " + sec_from_mid);


    }
    
}
