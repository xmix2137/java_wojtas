package ClassesAndObjects;

public class Student {
    String name = "Jacek";
    int age = 20;
    public static void main(String[] args){
        Student jacek = new Student();
        Student tomek = new Student();
        tomek.name = "Tomek";
        tomek.age = 21;
        System.out.println(jacek.name);
        System.out.println(jacek.age);
        System.out.println(tomek.name);
        System.out.println(tomek.age);
    }
}