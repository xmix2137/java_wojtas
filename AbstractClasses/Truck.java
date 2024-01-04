package AbstractClasses;

public class Truck extends Vehicle{

    Truck(int speedlimit, int seats, int wheels, String brand){
        super(speedlimit, seats, wheels, brand);
    }

    void honk(){
        System.out.println("HOOOOOOOOOONK");
    }
}
