/*7.	A TV class describes TV sets. Each TV can be turned on or off. 
Define the class with the appropriate attribute. 
Add a method that displays TV status. 

8.	In the TV class, implement the CanOnOff interface. Define methods by which the TV can be turned on and off. Then write a program that:
a.	Turns on TV
b.	Displays TV status
c.	Turns off TV
d.	Displays TV status

10.	In the TV class, add an attribute that describes the channel number. 
Then implement the CanChangeChannel interface. Define methods in the class for changing the channel. Take into account that:
a.	The allowed channel number is 1 through 99.
b.	The channel can only be changed when the TV is on.
c.	The default channel number after turning on the TV is 1.
d.	TV status displays channel number only when the TV is on.

Then write a program that:
e.	Turns on the TV
f.	Displays TV status (whether TV is on and channel number)
g.	Changes channel number to the next one.
h.	Changes channel number to 7.
i.	Changes channel number to 142.
j.	Displays TV status.
k.	Changes channel number to the previous one.
l.	Displays TV status.
m.	Turns off the TV.
n.	Displays TV status.

12.	In the TV class, add an attribute that describes the volume level. 
Then implement the CanChangeVolume interface. 
Define in the class the methods for adjusting the TV volume level. Take into account that:
a.	The valid range for the volume level is 1 to 10.
b.	The default volume level after turning on the TV is 1.
c.	The volume level can only be adjusted when the TV is on.
Then write a program that:
d.	Turns on the TV.
e.	Displays TV status (whether TV is on, channel number, volume level)
f.	Changes channel number to 15.
g.	Sets the volume level to 7.
h.	Displays TV status.
i.	Turns off the TV.
j.	Displays TV status. 

14.	You can assign the selected TV station to a channel number on each TV set. 
Complete the TV class with the list of TV stations (list of channel names). 
You can use an array with a size equals to the maximum channel number. 
Assign TV station names for the first ten array elements. Then write a program that:
a.	Displays a list of TV stations with their channel numbers.
b.	Displays the TV status along with the name of the TV station (if available).


*/

package Interfaces;

public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume{
    boolean isOn = false;
    int channelNumber = 1;
    int volume = 1;
    String[] tvChannels = new String[100];

    TV(){
        this.tvChannels[0] = "TVP1";
        this.tvChannels[1] = "TVP2";
        this.tvChannels[2] = "TVP3";
        this.tvChannels[3] = "TVP SPORT";
        this.tvChannels[4] = "TVN";
        this.tvChannels[5] = "TVN 7";
        this.tvChannels[6] = "POLSAT";
        this.tvChannels[7] = "SUPER POLSAT";
        this.tvChannels[8] = "PULS";
        this.tvChannels[9] = "PULS 2";
    }

    public void displayChannels(){
        for (int i = 0; i<10; i++){
            System.out.println("Channel "+(i+1)+": "+this.tvChannels[i]);
        }
    }

    public void display(){
        if (this.isOn == true){
            if (this.channelNumber >=1 && this.channelNumber <=10){
                System.out.println("Tv status: ");           
                System.out.println("TV is on");
                System.out.println("Channel "+this.channelNumber+": "+this.tvChannels[this.channelNumber-1]);
                System.out.println("Volume: "+this.volume);
            }
            else{
            System.out.println("Tv status: ");           
            System.out.println("TV is on");
            System.out.println("Channel: "+this.channelNumber);
            System.out.println("Volume: "+this.volume);
            }
        }
    }

    public void on(){
        this.isOn = true;
        this.channelNumber = 1;
    }

    public void off(){
        this.isOn = false;
    }

    public void channelUp(){
        if(this.channelNumber <99 && this.isOn == true){
            this.channelNumber++;
        }
    }

    public void channelDown(){
        if(this.channelNumber > 0 && this.isOn == true){
            this.channelNumber--;
        }
    }

    public void setChannel(int channelNo){
        if (channelNo>=0 && channelNo<=99){
            this.channelNumber = channelNo;
        }
    }

    public void volumeUp(){
        if (this.isOn == true && this.volume <10){
            this.volume ++;
        }
    }

    public void volumeDown(){
        if (this.isOn == true && this.volume >1){
            this.volume --;
        }
    }

    public static void main(String[] args) {
        TV telewizor = new TV();
        telewizor.on();
        telewizor.display();
        telewizor.off();
        telewizor.display();
        System.out.println();
        telewizor.on();
        telewizor.display();
        telewizor.channelUp();
        telewizor.setChannel(7);
        telewizor.setChannel(142);
        telewizor.display();
        telewizor.channelDown();
        telewizor.display();
        telewizor.off();
        telewizor.display();
        System.out.println();
        telewizor.on();
        telewizor.display();
        telewizor.setChannel(15);
        telewizor.volumeUp();
        telewizor.volumeUp();
        telewizor.volumeUp();
        telewizor.volumeUp();
        telewizor.volumeUp();
        telewizor.volumeUp();
        telewizor.display();
        telewizor.off();
        telewizor.display();
        System.out.println();
        telewizor.displayChannels();
    }
}
