/*7.	Add an Ebook class definition to your project that derives from the Book class (inherits the Book class attributes and methods).
Add an attribute: file name.
Create a constructor where you assign the ebook attribute values
(title, author and file name). Add accessor and mutator methods for all ebook attributes.
Also add a display() method to display information about the ebook.
Then write a program that creates and displays one book and two e-books. */

package InheritanceAndPolymorphism;

public class Ebooks extends Books {
    private String fileName;

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFileName(){
        return this.fileName;
    }

    Ebooks(String title, String fileName, Publisher publisher, int year, String name, String surname, String genre){
        super(title, publisher, year, name, surname, genre);
        this.setFileName(fileName);
    }

    public void display(){
        System.out.println("Tytuł: " + getTitle() + " Plik: "+getFileName()+" Wydawca: "+ getPublisher().getName()+", "+getPublisher().getCity()+" Year of publication: "+getYear()+" Autor: "+getWriter().getName()+", "+getWriter().getSurname()+", "+getWriter().getGenre());
    }

}
