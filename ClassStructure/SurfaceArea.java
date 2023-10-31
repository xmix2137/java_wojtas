/*8.	Define a class SurfaceArea that contains static methods to calculate the surface area for:
 circle, rectangle and triangle. Validate the created methods. 
 
 10.	In the class SurfaceArea, add methods to calculate the surface area of 
 the following solids: cuboid, sphere, cone. In the VSCode, display a list with 
 all defined methods (OUTLINE panel). Then, complete the program to calculate and
  display the surface area of solids with sample dimensions.*/

package ClassStructure;

public class SurfaceArea {
    static double pi = 3.14;
    static double pole;

    static double circle(int r){
        pole = pi*r*r;
        return pole;
    }
    static double rectangle(int x, int y){
        pole = x*y;
        return pole;
    }
    static double triangle(int a, int h){
        pole = 0.5*a*h;
        return pole;
    }
    static double cuboid(int a, int b, int c){
        pole = a*b*2 + a*c*2 + b*c*2;
        return pole;
    }
    static double sphere(int r){
        pole = 4*pi*r*r;
        return pole;
    }
    static double cone(int r, int l){
        pole = pi*r*r + pi*r*l;
        return pole;
    }

    public static void main(String[] args){
        System.out.println(SurfaceArea.circle(3));
        System.out.println(SurfaceArea.rectangle(4, 5));
        System.out.println(SurfaceArea.triangle(3, 4));
        System.out.println(SurfaceArea.cuboid(1, 2, 3));
        System.out.println(SurfaceArea.sphere(3));
        System.out.println(SurfaceArea.cone(3, 4));
    }
}
