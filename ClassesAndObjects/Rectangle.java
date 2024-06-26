//16.	Define a class for describing rectangles. 
//Then create two objects that represents rectangles with dimensions of 3x4 and 2x7 respectively. 
//Display their dimensions, perimeters and surface areas.

package ClassesAndObjects;

public class Rectangle {

    int wysokosc;
    int dlugosc;
    int pole;

    public Rectangle(int x, int  y){
        this.dlugosc = x;
        this.wysokosc = y;
        //this.pole = this.wysokosc*this.dlugosc;
    }

    public void ustawWysokosc(int x){
        this.wysokosc = x;
    }
    public void ustawDlugosc(int y){
        this.dlugosc = y;
    }
    public void informacje(){
        System.out.println("Wysokosc: "+this.wysokosc);
        System.out.println("Dlugosc: "+this.dlugosc);
        System.out.println("Pole: "+this.pole);
    
    }
    public void obliczPole(){
        pole = wysokosc*dlugosc;
    }
    public static void main(String[] args){

        Rectangle prostokat1 = new Rectangle(2, 7);
        Rectangle prostokat2 = new Rectangle(3, 4);
        prostokat1.ustawDlugosc(4);
        prostokat1.ustawWysokosc(3);
        prostokat2.ustawDlugosc(7);
        prostokat2.ustawWysokosc(2);
        prostokat1.obliczPole();
        prostokat2.obliczPole();
        prostokat1.informacje();
        System.out.println();
        prostokat2.informacje();
    }
}
