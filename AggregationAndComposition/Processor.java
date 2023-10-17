

package AggregationAndComposition;

public class Processor {

    String nazwa = "Intel core i5";
    int frequence = 1;
    int cache = 2;
    boolean isOn = false;

    public void powerOn(){
        this.isOn = true;
    }

    public void powerOff(){
        this.isOn = false;
    }
    
}