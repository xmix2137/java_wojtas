
package AggregationAndComposition;

public class Computer {

    Processor procesor = new Processor();
    int ram = 8;
    String graphic = "NVIDIA 1060";
    int HDD = 1000;
    boolean isOn = false;

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }

}
