/*22.	Define a Clock class that allows you to create clocks. 
The class has two integer (int) attributes: hour and minute. 
The hour attribute can take values from 0 to 23, and the minute attribute can take values from 0 to 59.
The constructor of this class, containing the parameters (int hour, int minute),
allows you to initialize the clock with the given values of hours and minutes.
The class also has an addMinute() method that moves the clock forward one minute. Apply data encapsulation.
For the hour and minute attributes, define access and modification methods. */

package DataEncapsulation;

public class Clock {
    private int hour;
    private int minute;

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    Clock(int hour, int minute){
        this.setHour(hour);
        this.setMinute(minute);
    }

    public void addMinute(){
        if (this.minute == 59 && this.hour == 23){
            this.setMinute(0);
            this.setHour(0);
        }
        else if (this.minute == 59){
            this.setMinute(0);
            this.setHour(this.hour+1);
        }
        else {
            this.setMinute(this.minute+1);
        }
    }

    public static void main(String[] args){
        Clock zegar = new Clock(0, 0);
        zegar.addMinute();
        zegar.addMinute();
        System.out.println(zegar.getMinute());
    }

}
