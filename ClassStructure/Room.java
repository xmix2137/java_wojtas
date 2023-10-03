/*22.	Define a class Room that represents a hotel room. The class should contain the attributes:
number, beds, occupied, and guestName. Add constructors: Room(number) (creates a room with two beds) and Room(number,beds).
Next, define methods for room manipulation: checkin(guestName), checkout(), isOccupied(), and displayStatus().
Then write a program in which create three rooms with two beds, two rooms with three beds and one room with one bed.
Store all room objects in an array:
Room[] rooms = new Room[6];
Then follow the steps below:
a.	Display status of a single room (room number, number of beds, occupied, guest name). Display data in a single row.
b.	Display a report with a list of rooms (room number, number of beds, occupied, guest name)
c.	Display a report with a list of rooms, limited to rooms with the specified number of beds
d.	Display a report on how many rooms are vacant and how many are occupied
e.	Display a report on how many vacant beds are available
Create a separate static method for each report. Pass a list of rooms (an array) to the defined static methods.
 */

 /*23.	Modify the Room class. Define toString() method that returns information about the room status.
  Replace the displayStatus() method with the defined toString() method. 
  Tip: find out in the manual how to define and use the toString() method. */

package ClassStructure;

public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;

    Room(int number){
        this.number = number;
        this.beds = 2;
    }

    Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }

    public void checkin(String guest){
        this.guestName = guest;
        this.occupied = true;
    }

    public void checkout(){
        this.guestName = "";
        this.occupied = false;
    }

    public void isOccupied(){
        if(this.occupied == true){
            System.out.println("Yes it is occupied");
        }
        else {
            System.out.println("No it isn't occupied");
        }
    }

    public void displayStatus(){
        System.out.println("Number: " + this.number);
        System.out.println("Is occupied: " + this.occupied);
        System.out.println("Guest name: " + this.guestName);
        System.out.println("Beds: " + beds);
    }

    public String toString(){
        return "Number: "+this.number+ ", "+"Is occupied: " + this.occupied+", "+"Guest name: " + this.guestName+", "+"Beds: " + beds;
    }

    static void statusOfsingleRoom(Room[] rooms, int number){
        System.out.print("Number: " + rooms[number].number + ", ");
        System.out.print("Is occupied: " + rooms[number].occupied + ", ");
        System.out.print("Guest name: " + rooms[number].guestName + ", ");
        System.out.println("Beds: " + rooms[number].beds);
    }

    static void fullRecord(Room[] rooms){
        for(int i = 0; i< rooms.length; i++ ){
            rooms[i].displayStatus();
        }
    }

    static void bedRecord(Room[] rooms, int number){
        for(int i = 0; i< rooms.length; i++ ){
            if (rooms[i].beds == number){
                rooms[i].displayStatus();
            }         
        }
    }

    static void occupiedRecord(Room[] rooms){
        System.out.println("Free rooms: ");
        for(int i = 0; i< rooms.length; i++ ){
            if (rooms[i].occupied == false){
                System.out.println(rooms[i].number);
            }
        }
        System.out.println("Occupied rooms: ");
        for(int i = 0; i< rooms.length; i++ ){
            if (rooms[i].occupied == true){
                System.out.println(rooms[i].number);
            }
        }
    }

    static void freeBedRecord(Room[] rooms){
        int freeBeds = 0;
        for(int i = 0; i< rooms.length; i++ ){
            if (rooms[i].occupied == false){
                freeBeds+=rooms[i].beds;
            }
        }
        System.out.println("Number of free beds: "+ freeBeds);
    }

    public static void main (String[] args){
        Room pokoj0 = new Room(0, 2);
        Room pokoj1 = new Room(1);
        Room pokoj2 = new Room(2);
        Room pokoj3 = new Room(3, 3);
        Room pokoj4 = new Room(4, 3);
        Room pokoj5 = new Room(5, 1);

        Room[] roomz = new Room[6];
        roomz[0] = pokoj0;
        roomz[1] = pokoj1;
        roomz[2] = pokoj2;
        roomz[3] = pokoj3;
        roomz[4] = pokoj4;
        roomz[5] = pokoj5;
        Room.statusOfsingleRoom(roomz, 0);
        Room.fullRecord(roomz);
        Room.bedRecord(roomz, 2);
        Room.occupiedRecord(roomz);
        Room.freeBedRecord(roomz);
        Room pokoik = new Room(20, 4);
        System.out.println(pokoik.toString());

    }

}
