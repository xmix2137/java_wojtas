/*(C5.java) Define a class that contains two attributes: x and y,
of integer type (int), describing the coordinates of a point on the plane.
The class constructor contains two parameters and allows you to initialize the object's attributes.
Create an isX() method in the class that returns true
if the point is on the x-axis and false otherwise. Create an isY()
method in the class that returns true if the point is on the y-axis or false otherwise.
Add a method in the class to represent the object as text that returns the coordinates of the point in the format "P(x,y)".
Do not add some space characters  in this string. Sample result: */

package Mock1;

public class C5 {
    int x;
    int y;

    C5(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isX(){
        if(this.y == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isY(){
        if(this.x == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "P("+this.x+","+this.y+")";
    }
}
