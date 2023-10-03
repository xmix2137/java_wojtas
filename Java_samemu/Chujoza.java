package Java_samemu;

public class Chujoza {
    int hour = 20;
    int minute = 20;
    int alarmHour = 20;
    int alarmMinute = 21;

    public void setAlarm(int h, int m){
        this.alarmHour = h;
        this.alarmMinute = m;
    }

    public void runAlarm(){
        if (this.hour==this.alarmHour && this.minute == this.alarmMinute){
        System.out.println("beep-beep-beep-beep !!");
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

    public static void main(String[] args){
        Chujoza ktos = new Chujoza();
        ktos.displayTime();
        ktos.addOneMinute();
        ktos.displayTime();
        
    }
    
}
