package AbstractClasses;

public class Car extends Vehicle{

    Car(int speedlimit, int seats, int wheels, String brand){
        super(speedlimit, seats, wheels, brand);
    }

    void honk(){
        System.out.println("Honk Honk");
    }
}
