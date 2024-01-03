package AbstractClasses;

public class Triangle extends Shape{
    int a;
    int h;
    int b;
    int c;

    Triangle(int a, int b, int c, int h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    double area(){
        return a*h/2;
    }

    double perimeter(){
        return a+b+c;
    }
}
