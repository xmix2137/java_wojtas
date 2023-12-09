/*6.	Create a project where you define a Book class that describes books.
Add book attributes: title and author.
Create a constructor where you assign book attribute values.
Add accessor and mutator methods for all book attributes. Add also a display() method to display information about the book.
Then write a program that creates and displays two books. 

13.	Modify the Book class. Add the book's year of publication attribute,
as well as accessor and mutator methods for this attribute.
Then modify other project classes and display the library contents.*/

package InheritanceAndPolymorphism;

public class Books{
    protected String title;
    protected Publisher publisher;
    protected int year;
    protected Writer writer;

    Books(){

    }

    Books(String title, Publisher publisher, int year, String name, String surname, String genre){
        this.setTitle(title);
        this.setPublisher(publisher);
        this.setYear(year);
        this.setWriter(writer = new Writer(name, surname, genre));
        
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPublisher(Publisher publisher){
        this.publisher = publisher;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setWriter(Writer writer){
        this.writer = writer;
    }

    public String getTitle(){
        return this.title;
    }

    public Publisher getPublisher(){
        return this.publisher;
    }

    public int getYear(){
        return this.year;
    }

    public Writer getWriter(){
        return this.writer;
    }


    public void display(){
        System.out.println("Tytuł: " + getTitle() +" Wydawca: "+ getPublisher().getName()+", "+getPublisher().getCity()+" Year of publication: "+getYear()+" Autor: "+getWriter().getName()+", "+getWriter().getSurname()+", "+getWriter().getGenre());
    }

    /*public static void main(String[] args){
        Publisher wydawca = new Publisher("Czarne", "Krakow");
        Books book1 = new Books("Kamienie na szaniec", "Aleksander Kamiński", wydawca);
        Books book2 = new Books("Dżuma", "Aleksander Camus", wydawca);
        Ebooks ebook1 = new Ebooks("Dziady", "Adam Mickiewicz", "Dziady.txt", wydawca);
        Ebooks ebook2 = new Ebooks("Pan Tadeusz", "Adam Mickiewicz", "PanTadeusz.txt", wydawca);
        Audiobooks audiobook1 = new Audiobooks("Ogniem i mieczem", "Henryk Sienkiewicz", 180, 40, wydawca);

        book1.display();
        book2.display();
        ebook1.display();
        ebook2.display();
        audiobook1.display();
    }*/


}

