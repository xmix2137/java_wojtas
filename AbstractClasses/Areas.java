package AbstractClasses;

public class Areas {
    public static void main(String[] args) {
        Rectangle prostokat = new Rectangle(2, 8);
        Triangle trojkat = new Triangle(2, 3, 4, 5);
        Circle kolko = new Circle(4);

        System.out.println(prostokat.area());
        System.out.println(trojkat.area());
        System.out.println(kolko.area());
        System.out.println(prostokat.perimeter());
        System.out.println(trojkat.perimeter());
        System.out.println(kolko.perimeter());
    }
}
