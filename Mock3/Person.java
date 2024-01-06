/*The Person class contains two attributes that represent name and surname. 
The initial values of the attributes are passed through the constructor parameters. 
Specify the text representation of the object, consisting of two uppercase letters of the first name and last name. Example:
Person("anna","may")  "AM"
 */

package Mock3;

public class Person {
    String name;
    String surname;
    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        String n = this.name.substring(0, 1);
        String s = this.surname.substring(0, 1);
        String bn = n.toUpperCase();
        String bs = s.toUpperCase();
        String koncowy = bn+bs;
        return koncowy;
    }

    public static void main(String[] args) {
        Person person = new Person("anna", "may");
        System.out.println(person);
    }
}
