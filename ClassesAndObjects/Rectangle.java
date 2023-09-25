//16.	Define a class for describing rectangles. 
//Then create two objects that represents rectangles with dimensions of 3x4 and 2x7 respectively. 
//Display their dimensions, perimeters and surface areas.

package ClassesAndObjects;

public class Rectangle {

    int wysokosc;
    int dlugosc;
    int pole;

    public Rectangle(){
        int wysokosc = 0;
        int dlugosc = 0;
        int pole = wysokosc*dlugosc;
    }

    public void ustawWysokosc(int x){
        wysokosc = x;
    }
    public void ustawDlugosc(int y){
        dlugosc = y;
    }
    public void informacje(){
        System.out.println("Wysokosc: "+wysokosc);
        System.out.println("Dlugosc: "+dlugosc);
        System.out.println("Pole: "+pole);
    
    }
    public void obliczPole(){
        pole = wysokosc*dlugosc;
    }
    public static void main(String[] args){

        Rectangle prostokat1 = new Rectangle();
        Rectangle prostokat2 = new Rectangle();
        prostokat1.ustawDlugosc(4);
        prostokat1.ustawWysokosc(3);
        prostokat2.ustawDlugosc(7);
        prostokat2.ustawWysokosc(2);
        prostokat1.obliczPole();
        prostokat2.obliczPole();
        prostokat1.informacje();
        prostokat2.informacje();
    }
}
