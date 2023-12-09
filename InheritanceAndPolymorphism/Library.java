/*9.	Add a Library class definition to your project that contains an attribute that stores
any books, ebooks, or audiobooks.
Apply an array. Consider the correct data type for the array.
Then write a program that creates and displays one book, two e-books and two audiobooks.
Save all object in the library. Display the contents of the library. Notice which display() object methods are called. */

package InheritanceAndPolymorphism;

public class Library {

    Books[] library = new Books[5];


   public static void main(String[] args){
        Publisher wydawca = new Publisher("Czarne", "Krakow");
        /*Writer writer1 = new Writer("Aleksander", "Kamiński", "Literatura faktu");
        Writer writer2 = new Writer("Aleksander", "Camus", "Proza");
        Writer writer3 = new Writer("Adam", "Mickiewicz", "Poezja");
        Writer writer4 = new Writer("Adam", "Mickiewicz", "Poezja");
        Writer writer5 = new Writer("Henryk", "Sienkiewicz", "Poexja");*/
        Books book1 = new Books("Kamienie na szaniec", wydawca, 1999, "Aleksander", "Kamiński", "Literatura faktu");
        Books book2 = new Books("Dżuma", wydawca, 2012, "Aleksander", "Camus", "Proza");
        Ebooks ebook1 = new Ebooks("Dziady", "Dziady.txt", wydawca, 2013, "Adam", "Mickiewicz", "Poezja");
        Ebooks ebook2 = new Ebooks("Pan Tadeusz", "PanTadeusz.txt", wydawca, 1998, "Adam", "Mickiewicz", "Poezja");
        Audiobooks audiobook1 = new Audiobooks("Ogniem i mieczem", 180, 40, wydawca, 1893, "Henryk", "Sienkiewicz", "Poexja");
        Library biblioteka = new Library();

        biblioteka.library[0] = book1;
        biblioteka.library[1] = book2;
        biblioteka.library[2] = ebook1;
        biblioteka.library[3] = ebook2;
        biblioteka.library[4] = audiobook1;

        for (int i = 0; i<biblioteka.library.length; i++){
            biblioteka.library[i].display();
        }

    }
}
