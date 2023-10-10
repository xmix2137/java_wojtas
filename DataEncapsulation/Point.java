/*19.	Define a Point class that contains two attributes: x and y, of integer type (int),
 describing the coordinates of a point on the plane.
  The class constructor contains two parameters and allows you to initialize the object's attributes.
   Create an isX() method in the class that returns true if the point is on the x-axis and false otherwise.
    Create an isY() method in the class that returns true if the point is on the y-axis or false otherwise.
     Add a method in the class to represent the object as text that returns the coordinates of the point in the format "P(x,y)". 
     Sample result: 
     
    Point(3,0)
    isX() returns false
    isY() returns true
    toString() returns "P(3,0)"
     */

package DataEncapsulation;

public class Point {

    int x;
    int y;

    Point(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public boolean isX(){
        if (this.y == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isY(){
        if (this.x == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "P("+this.getX()+", "+this.getY()+")";
    }

    public static void main(String[] args){
        Point punkt = new Point(3, 0);
        System.out.println(punkt.isX());
        System.out.println(punkt.isY());
        System.out.println(punkt.toString());
    }
}
