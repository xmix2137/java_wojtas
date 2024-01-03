package AbstractClasses;

public class Rectangle extends Shape{
    int a;
    int b;

    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    double area(){
        return a*b;
    }

    double perimeter(){
        return a+a+b+b;
    }
}
