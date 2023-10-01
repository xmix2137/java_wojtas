/*13.	Define a class Person for person’s record. The class should contain the attributes: name, weight (kg) and height (cm). 
Add constructors:
a.	Person(name)
b.	Person(name,weight,height)
Then add methods that represents the object's behaviors:
c.	setWeightAndHeight(weight,height)
d.	calculateBMI() – calculates Body Mass Index
e.	displayRecord() – displays full info (name, weight, height, and BMI)
The correct BMI value is 18.5 to 24.9. When displaying a person’s record, if the BMI is too low, 
display the message: "BMI too low". When the index is too high, display the message: "BMI too high". 
Write a program, create three persons and display their records.

 */

package ClassStructure;

public class Person {
    String name;
    double weight;
    double height;
    double BMI;
    Person(String n){
        name = n;
    }
    
    Person(String n, double w, double h){
        name = n;
        weight = w;
        height = h;
    }
    public void setWeightAndHeight(double w, double h){
        weight = w;
        height = h;
    }
    public void calculateBMI(){
        BMI = Math.round((weight/(height*height))); 
    }
    public void displayRecord(){
        System.out.println("Imię: "+name);
        System.out.println("Waga: "+weight);
        System.out.println("Wzrost: "+height);
        System.out.println("BMI: "+BMI);
        if (BMI<18.5){
            System.out.println("BMI jest za małe");
        }
        else if(BMI>24.9){
            System.out.println("BMI jest za wysokie");
        }
    }

    public static void main(String[] args){
        Person Janek = new Person("Janek", 90, 1.6);
        Person Marcin = new Person("Marcin", 72, 1.9);
        Person Michał = new Person("Michał", 85, 1.93);
        Janek.calculateBMI();
        Marcin.calculateBMI();
        Michał.calculateBMI();
        Janek.displayRecord();
        Marcin.displayRecord();
        Michał.displayRecord();
    }
    
}
