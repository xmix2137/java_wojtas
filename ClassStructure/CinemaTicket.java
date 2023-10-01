/*7.	Define a class CinemaTicket to describe cinema tickets. The ticket attributes are:
 cinema name, film title, row, seat, and price. Since the name of cinema is the same for all tickets,
  use a static field. Then define a method to display ticket data.
   Try to create two tickets and display ticket details. */

/*12.	Modify the class describing cinema tickets. Add a constructor that creates
 a ticket for the specified movie, with row and seat numbers. Assume that in the first two rows the ticket price is PLN 10,
 and in the remaining rows, PLN 25. Then write a program that, in the Morning Star Cinema, creates two tickets for the movie “Gladiator”,
 the first one is in row 2 and the second one in row 7. Print the created tickets. */

package ClassStructure;

public class CinemaTicket {
    static String cinemaName = "Helios";
    String filmTitle = "Gladiator";
    int row;
    int seat = 12;
    int price;

    public CinemaTicket(int rowC){
        row = rowC;
        if (rowC>2){
            price = 25;
        }
        else{
            price = 10;
        }
    }

    public void displayTicket(){
        System.out.println("Dane biletu: ");
        System.out.println("Rząd: "+row);
        System.out.println("Miejsce: "+seat);
        System.out.println("Cena: "+price);
    }

    public static void main (String[] args){

        CinemaTicket bilet1 = new CinemaTicket(2);
        CinemaTicket bilet2 = new CinemaTicket(7);
        bilet1.displayTicket();
        bilet2.displayTicket();

    }
}
