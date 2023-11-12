/*(C1.java) Define a class with two attributes describing a person:
 name (String) and age (int).
Apply data encapsulation.
Define a constructor with the parameters name and adult to assign initial values of object’s attributes.
Define get and set methods for each attribute.
Then, define a method isAdult()
that returns true if a person is an adult (person is at least 18 years old) or false otherwise.
Finally, define a method that returns a string representation of the object (name and age, separated by comma).
Sample result: */

package Mock1;

public class C1 {
    private String name;
    private int age;

    C1(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isAdult(){
        if (this.getAge()>=18){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return this.getName() + "," + this.getAge();
    }

    /*public static void main(String[] args){

        try {
			C1 o = new C1("Anna",21);
			assert o.getAge()==21;
			assert o.isAdult()==true;
			o.setAge(17);
			assert o.isAdult()==false;
			assert o.toString().equals("Anna,17");
			System.out.println(1);
		} catch (Throwable e) {
			System.out.println(0);
		}

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[2]);
          } catch (Exception e) {
            System.out.println("Something went wrong.");
          }
    }*/

}
