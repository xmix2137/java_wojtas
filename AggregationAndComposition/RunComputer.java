package AggregationAndComposition;

public class RunComputer {

    public static void main(String[] args){
        Computer komputer = new Computer();

        komputer.turnOn();
        System.out.println(komputer.isOn);
        komputer.turnOff();
        System.out.println(komputer.isOn);
        komputer.procesor.powerOn();
        System.out.println(komputer.procesor.isOn);

    }
    
}
