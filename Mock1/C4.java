/*(C4.java) Define a class with two static methods: even(int[] array)
that returns the number of even values in the array, and the positiveOdd(int[] array)
that returns the number of positive odd numbers in the array. Sample result: */

package Mock1;

public class C4 {

    static int even(int[] array){
        int liczba = 0;
        for (int i = 0; i<array.length; i++){
            if(array[i]%2 == 0){
                liczba++;
            }
        }
        return liczba;
    }

    static int positiveOdd(int[] array){
        int liczba = 0;
        for (int i = 0; i<array.length; i++){
            if(array[i]%2 != 0 && array[i]>0){
                liczba++;
            }
        }
        return liczba;
    }
    
}
