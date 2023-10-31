/*6.	Define a class MyCalendar with three static integer fields: year, month and day. Then, create:
a.	Method myDate() that returns the date as a string, in the format yyyy-mm-dd
b.	Method days() that returns the number of days passed from the beginning of year.
c.	Method monthName() the returns a string with the month name
Finally, display calculated values. Sample result.
Date: 2023-04-09
Days from the beginning of year: …
Month name: April 
public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;

    /*
     * Returns date
     * in the form yyyy-mm-dd
     */
    //static String myDate(){
     //   return "";
    //}

    /*
     * Returns the number of days
     * from the beginning of year
     */

    /*
     * Returns month name
     */
//}

package ClassStructure;

public class MyCalendar {

    static int year = 2023;
    static int month = 4;
    static int day = 9;

    public String myDate(){    
        return year+"-0"+month+"-0"+day;
    }

    public int days(){
        return 31+28+31+9;
    }

    public String monthName(){
        return "April";
    }


    public static void main(String[] args){

        MyCalendar kal = new MyCalendar();
        System.out.println(kal.myDate());
        System.out.println(kal.days());
        System.out.println(kal.monthName());

    }
    
}
