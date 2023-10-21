//15.	Define a class for describing lamps. Then define the following object attributes and behaviors:
//a.	attributes: whether a lamp is on
//b.	behaviors: (1) switch on the lamp, (2) switch off the lamp, (3) display information whether the lamp is on or off
//After that, create two lamps, switch on the first one and switch off the second one. Display information whether the lamps are on or off.

package ClassesAndObjects;

public class Lamps {
    boolean isOn = false;

    public void switchOn(){
        isOn = true;
    }
    public void switchOff(){
        isOn = false;
    }
    public void showStatus(){
        if (isOn == true){
            System.out.println("Lamp is on");
        }
        else{
            System.out.println("Lamp is off");
        }

    
    }

    public void showStatusv2(){
        String status = isOn ? "Lamp is on" : "Lamp is off";
        System.out.println(status);
    }
    public static void main(String[] args){
        Lamps Lamp1 = new Lamps();
        Lamps Lamp2 = new Lamps();

        Lamp1.switchOn();
        Lamp2.switchOff();
        Lamp1.showStatusv2();
        Lamp2.showStatusv2();
        Lamp1.showStatus();
        Lamp2.showStatus();

    }
    
}
