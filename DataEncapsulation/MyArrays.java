/*21.	Define a MyArrays class that contains two static methods: odd(int[] array), 
which returns the number of positive odd values in the array, and above(int[] array), 
which returns the sum of the numbers in the array that are greater than the arithmetic mean of the array elements. Sample result: */

package DataEncapsulation;

public class MyArrays {
    static int odd(int[] array){
        int licznik = 0;
        for(int i = 0; i<array.length;i++){
            if (array[i]>0 && array[i]%2 ==1){
                licznik++;
            }
        }
        return licznik;
    }

    static int above(int[] array){
        double suma = 0;
        for (int i = 0; i<array.length;i++){
            suma+=array[i];
        }

        double srednia = suma/array.length;

        int liczba = 0;

        for (int i = 0; i<array.length;i++){
            if (array[i]>srednia){
                liczba+=array[i];
            }
        }
        return liczba;
    }

    public static void main(String[] args){
        int[] arr = {0, 1, 2, 6, 8, 9, 2, 4};
        System.out.println(MyArrays.odd(arr));
        System.out.println(MyArrays.above(arr));
    }
}
