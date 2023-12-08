/*9.	Books can be placed on a bookcase. Create a class diagram.
Use the previously defined Book and Writer classes
(created diagram should contain three classes).
Assume that the bookcase can hold any number of books.
When creating a class diagram, pay attention to the relationships between classes,
taking into account that the book can exist independently of the bookcase. Mark the multiplicity in the class diagram.
Then, based on the class diagram, write a program that allows books to be placed in and removed from the bookshelf.
Display the bookcase contents. */

package AggregationAndComposition;

import java.util.ArrayList;

public class BookShelf {
    ArrayList<Books> bookShelf = new ArrayList<Books>();

    public void display(){
        for(int i = 0; i<this.bookShelf.size(); i++){
            System.out.print(this.bookShelf.get(i).getName()+" ");
        }
        System.out.println();
    }

    public void addBook(Books book){
        this.bookShelf.add(book);
    }

    public void removeBook(String book){
        for(int i = 0; i<this.bookShelf.size(); i++){
            if (this.bookShelf.get(i).getName()==book){
                this.bookShelf.remove(i);
            }
        }
    }

    public static void main(String[] args){
        Writer writer1 = new Writer("Aleksander", "Kamiński");
        Writer writer2 = new Writer("Adam", "Mickiewicz");
        Books book1 = new Books("Kamienie na szaniec", writer1);
        Books book2 = new Books("Pan Tadeusz", writer2);
        BookShelf bookShelf1 = new BookShelf();
        bookShelf1.display();
        bookShelf1.addBook(book1);
        bookShelf1.display();
        bookShelf1.addBook(book2);
        bookShelf1.display();
        bookShelf1.removeBook("Pan Tadeusz");
        bookShelf1.display();

    }
}
