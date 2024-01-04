package AbstractClasses;

public class Bus extends Vehicle{

    Bus(int speedlimit, int seats, int wheels, String brand){
        super(speedlimit, seats, wheels, brand);
    }

    void honk(){
        System.out.println("HOONK HOONK");
    }
}
