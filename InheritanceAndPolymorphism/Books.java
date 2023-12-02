/*6.	Create a project where you define a Book class that describes books.
Add book attributes: title and author.
Create a constructor where you assign book attribute values.
Add accessor and mutator methods for all book attributes. Add also a display() method to display information about the book.
Then write a program that creates and displays two books. */

package InheritanceAndPolymorphism;

public class Books{
    protected String title;
    protected String author;

    Books(){

    }

    Books(String title, String author){
        this.setTitle(title);
        this.setAuthor(author);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public void display(){
        System.out.println("Tytuł: " + getTitle() + " Autor: " + getAuthor());
    }

    public static void main(String[] args){
        Books book1 = new Books("Kamienie na szaniec", "Aleksander Kamiński");
        Books book2 = new Books("Dżuma", "Aleksander Camus");
        Ebooks ebook1 = new Ebooks("Dziady", "Adam Mickiewicz", "Dziady.txt");
        Ebooks ebook2 = new Ebooks("Pan Tadeusz", "Adam Mickiewicz", "PanTadeusz.txt");
        Audiobooks audiobook1 = new Audiobooks("Ogniem i mieczem", "Henryk Sienkiewicz", 180, 40);

        book1.display();
        book2.display();
        ebook1.display();
        ebook2.display();
        audiobook1.display();
    }


}

