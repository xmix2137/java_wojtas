/*15.	Create a library of methods for the calculation of basic statistics:
a.	Number of items within the specified range <x,y>
b.	Sum of numbers in the given range  <x,y>
c.	Arithmetic mean of the numbers in the given range  <x,y>
Then create a program that calculates and displays the basic statistics for integers in the range <5,10>
 */

package ClassStructure;

public class Statistics {
    static int Number(int x, int y){
        int odl;
        if (x>y){
            odl = x-y;
        }
        else{
            odl = y-x;
        }
        return odl;
    }
    static int Sum(int x, int y){
        int suma = 0;
        for (int i = x; i<y+1; i++){
            suma += i;
        }
        return suma;
    }
    static double Mean(int x, int y){
        double mean = Statistics.Sum(x, y)/Statistics.Number(x,y);
        return mean;
    }
    
    public static void main(String[] args){
        System.out.println(Statistics.Number(30, 20));
        System.out.println(Statistics.Sum(10, 11));
        System.out.println(Statistics.Mean(0, 10));
    }
}
