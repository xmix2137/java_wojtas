/*6.	Based on the Vehicle class, define a derived class Car, containing the maxSpeed attribute,
of type int. Add a constructor with two parameters, in which you initialize the values of the attributes:
seats and maxSpeed. Add an int[] spec() method that returns the car's specification as a two-element array.
The first element of the array contains the number of seats in the car, and the second the maximum speed. */

package Mock2;

public class Car extends Vehicle{
    int maxSpeed;

    Car(int seats, int maxSpeed){
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec(){
        int[] arr = new int[2];
        arr[0] = this.getSeats();
        arr[1] = this.maxSpeed;

        return arr;
    }

    public static void main(String[] args){
        Car car = new Car(4, 120);
        int[] arr = car.spec();

        for (int i = 0; i<2; i++){
            System.out.println(arr[i]);
        }
    }
}
