package ClassesAndObjects;

public class Student {
    String name = "Jacek";
    int age = 20;
    String IdCard = "0000";
    boolean Validation = true;
    int Semester = 1;
    float AvgNote = 3;

    public void sayHello(){
        System.out.println("Hello");
    }
    public void displayName(){
        System.out.println("Moje imię to: " + name);
    }
    public void displayAge(){
        System.out.println("Mój wiek to: " + age);
    }
    //(1) display the student’s name, semester number and average grade

    public void information(){
        System.out.println("Imię: "+ name);
        System.out.println("Semestr: "+ Semester);
        System.out.println("Średnia ocena: "+ AvgNote);
    }

    //(2) change the status of student ID card (valid/invalid)

    public void changeValidaton(){
        if (Validation == true){
            Validation = false;
        }
        else {
            Validation = true;
        }
    }

    //(3) display the student’s name, ID card number and whether the ID card is valid

    public void cardDisplay(){

        System.out.println("Imię: "+name);
        System.out.println("ID: "+IdCard);
        System.out.println("Ważność: "+Validation);
    }

    public static void main(String[] args){
        Student jacek = new Student();
        Student tomek = new Student();
        tomek.name = "Tomek";
        tomek.age = 21;
        System.out.println(jacek.name);
        System.out.println(jacek.age);
        System.out.println(tomek.name);
        System.out.println(tomek.age);
        tomek.sayHello();
        tomek.displayAge();
        tomek.displayName();
        tomek.cardDisplay();
        tomek.changeValidaton();
        tomek.cardDisplay();
        tomek.information();
    }
}