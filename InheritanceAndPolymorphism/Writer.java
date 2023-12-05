/*15.	Define a Writer class in your project that describes the writer by his/her first name,
 last name and literary genre.
  Then, in the Book class, use an object of that class to describe the author of the book.
   Modify other project classes and display the library contents. */

package InheritanceAndPolymorphism;

public class Writer {
    String name;
    String surname;
    String genre;

    public Writer(String name, String surname, String genre){
        this.setName(name);
        this.setSurname(surname);
        this.setGenre(genre);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getGenre(){
        return this.genre;
    }

}
