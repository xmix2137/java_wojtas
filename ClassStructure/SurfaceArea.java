/*8.	Define a class SurfaceArea that contains static methods to calculate the surface area for:
 circle, rectangle and triangle. Validate the created methods. */

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
    public static void main(String[] args){
        System.out.println(SurfaceArea.circle(3));
        System.out.println(SurfaceArea.rectangle(4, 5));
        System.out.println(SurfaceArea.triangle(3, 4));
    }
}
