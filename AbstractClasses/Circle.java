package AbstractClasses;

class Circle extends Shape{
    int r;
    final double p = 3.14;
    Circle(int r){
        this.r = r;
    }
    double area(){
        return r*r*p;
    }

    double perimeter(){
        return 2*p*r;
    }
}
