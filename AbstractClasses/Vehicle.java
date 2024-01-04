/*13.	Create a project that describes the different types of vehicles. 
Define an abstract class Vehicle. 
Consider what attributes and methods (including abstract ones) an abstract class should contain. 
Add a constructor in the class to create a vehicle. 
Then, using inheritance, define Car, Bus, Truck classes representing specific types of vehicles. 
Consider what attributes and methods should these classes contain. 
Finally, create one car, bus and truck and display details on them.*/

package AbstractClasses;

abstract class Vehicle {
    int speedlimit;
    int seats;
    int wheels;
    String brand;
    boolean isOn = false;

    Vehicle(int speedlimit, int seats, int wheels, String brand){
        this.speedlimit = speedlimit;
        this.seats = seats;
        this.wheels = wheels;
        this.brand = brand;
    }

    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
    abstract void honk();

    public static void main(String[] args) {
        Car car = new Car(220, 4, 4, "BMW");
        Bus bus = new Bus(120, 32, 8, "Mercedes");
        Truck truck = new Truck(140, 2, 6, "Citroen");

        car.honk();
        bus.honk();
        truck.honk();
    }
}
