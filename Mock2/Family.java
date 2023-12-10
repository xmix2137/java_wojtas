/*3.	Define a Family class that describes a group of people that make up a family.
The constructor of the class has one parameter of the Person[] type,
which allows you to pass people to the family at the time of its creation.
Add an adults() method that returns the number of adults in the family (18 or older). 

public class Person {
  private String name;
  private int age;
  Person(String n, int a){name=n; age=a;}
  public int getAge(){return age;}
}
*/

package Mock2;

public class Family {
    Person[] persons = new Person[3];

    Family(Person person1, Person person2, Person person3){
        this.persons[0] = person1;
        this.persons[1] = person2;
        this.persons[2] = person3;
    }

    public int adults(){
        int licznik = 0;
        for (int i = 0; i<this.persons.length; i++){
            if (persons[i].getAge()>=18){
                licznik ++;
            }
        }
        return licznik;
    }

    public static void main(String[] args){
        Person person1 = new Person("Jacek", 12);
        Person person2 = new Person("Marek", 22);
        Person person3 = new Person("Joasia", 32);

        Family family = new Family(person1, person2, person3);

        System.out.println(family.adults());
    }
}
