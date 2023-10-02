/*20.	Define a class Clock that represents a digital clock. It has two attributes: 
hour and minute. The hour value ranges from 0 to 23. The minute value ranges from 0 to 59. Next, define the following constructors:
a.	Clock() – initialises clock to 00:00
b.	Clock(hour,minute) – initialises clock to hour:minute
Then, define methods:
c.	setClock(hour,minute)
d.	setClock() - reset clock to 00:00
e.	displayTime()
f.	addOneMinute()
After that, write a program that:
g.	creates a clock with starting time 12:47
h.	displays time
i.	sets a clock to 18:14
j.	displays time
k.	sets a clock to 09:03
l.	displays time
m.	sets a clock to 23:58
n.	displays time
o.	adds one minute
p.	displays time
q.	adds one minute
r.	displays time


21.	Add an alarm function to the clock. Complete the class definition with the attributes:
 alarmHour, alarmMinute. Add methods: setAlarm(hour, minute) and runAlarm(), which displays the "beep-beep-beep-beep !!"
  alarm sound. Turn on the alarm when the alarm time is the same as the clock time(compare times in the addOneMinute() method).
*/


package ClassStructure;

public class Clock {
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;

    Clock(){
        this.hour = 0;
        this.minute = 0;
    }

    Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }


    
    public void setClock(int h, int m){
        this.hour = h;
        this.minute = m;
    }

    public void setClock(){
        this.hour = 0;
        this.minute = 0;
    }

    public void displayTime(){
        if (this.hour<10 && this.minute<10){
            System.out.println("0"+hour+":"+"0"+minute);
        }
        else if (this.hour<10 && this.minute>10){
            System.out.println("0"+hour+":"+minute);
        }
        if (this.hour>10 && this.minute<10){
            System.out.println(hour+":"+"0"+minute);
        }
        if (this.hour>10 && this.minute>10){
            System.out.println(hour+":"+minute);
        }
        
    }
    
    public void addOneMinute(){
        if (this.hour == this.alarmHour && this.minute == this.alarmMinute){
            this.runAlarm();
        }
        else if (this.minute == 59 && this.hour == 23){
            this.minute = 0;
            this.hour = 0;
        }
        else if (this.minute == 59){
            this.minute = 0;
            this.hour +=1;
        }
        else {
            this.minute ++;
        }
    }

    public void setAlarm(int h, int m){
        this.alarmHour = h;
        this.alarmMinute = m;
    }

    public void runAlarm(){
        if (this.hour==this.alarmHour && this.minute == this.alarmMinute){
        System.out.println("beep-beep-beep-beep !!");
    }
    }

    public static void main(String[] args){
        Clock zegar = new Clock(12, 47);
        zegar.displayTime();
        zegar.setClock(18, 14);
        zegar.displayTime();
        zegar.setClock(9, 3);
        zegar.displayTime();
        zegar.setClock(23, 58);
        zegar.displayTime();
        zegar.addOneMinute();
        zegar.displayTime();
        zegar.addOneMinute();
        zegar.displayTime();
        zegar.setAlarm(0, 01);
        zegar.addOneMinute();
        zegar.displayTime();
        zegar.runAlarm();
        
    }
    
}
