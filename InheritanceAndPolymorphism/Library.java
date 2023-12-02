/*9.	Add a Library class definition to your project that contains an attribute that stores
any books, ebooks, or audiobooks.
Apply an array. Consider the correct data type for the array.
Then write a program that creates and displays one book, two e-books and two audiobooks.
Save all object in the library. Display the contents of the library. Notice which display() object methods are called. */

package InheritanceAndPolymorphism;

public class Library {

    Books[] library = new Books[5];


    public static void main(String[] args){
        Books book1 = new Books("Kamienie na szaniec", "Aleksander Kamiński");
        Books book2 = new Books("Dżuma", "Aleksander Camus");
        Ebooks ebook1 = new Ebooks("Dziady", "Adam Mickiewicz", "Dziady.txt");
        Ebooks ebook2 = new Ebooks("Pan Tadeusz", "Adam Mickiewicz", "PanTadeusz.txt");
        Audiobooks audiobook1 = new Audiobooks("Ogniem i mieczem", "Henryk Sienkiewicz", 180, 40);
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
