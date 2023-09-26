/*7.	Define a class CinemaTicket to describe cinema tickets. The ticket attributes are:
 cinema name, film title, row, seat, and price. Since the name of cinema is the same for all tickets,
  use a static field. Then define a method to display ticket data.
   Try to create two tickets and display ticket details. */

package ClassStructure;

public class CinemaTicket {
    static String cinemaName = "Helios";
    String filmTitle = "Oppenheimer";
    int row = 10;
    int seat = 12;
    int price = 20;

    public void displayTicket(){
        System.out.println("Dane biletu: ");
        System.out.println("Rząd: "+row);
        System.out.println("Miejsce: "+seat);
        System.out.println("Cena: "+price);
    }

    public static void main (String[] args){

        CinemaTicket bilet1 = new CinemaTicket();
        CinemaTicket bilet2 = new CinemaTicket();
        bilet2.row = 14;
        bilet2.seat = 12;
        bilet1.displayTicket();
        bilet2.displayTicket();

    }
}
