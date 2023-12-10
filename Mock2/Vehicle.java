package Mock2;

// create Vehicle class in a separate file
public class Vehicle {
  private int seats;
  Vehicle(){};
  Vehicle(int s){
    seats = s;
    }
  public int getSeats(){
    return seats;
    }
}
