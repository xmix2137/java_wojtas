/* 13.	Define a MyArray class with some static methods:
a.	even(int[] array) that returns the number of even values in the array
b.	positiveOdd(int[] array) that returns the number of positive odd numbers in the array
c.	reverse(int[] array) that returns the array in reverse order
d.	compare(int[] array1, int[] array2) that returns ‘ture’ if both arrays are identical or ‘false’ otherwise
e.	different(int[] array1, int[] array2) that returns numbers from the first array that do not appear in the second array
f.	exist(int number, int[] array) that returns ‘true’ if the number is present in the array or ‘false’ otherwise
g.	secondMax(int[] array) that returns the second largest number in the array
h.	lastColumn(int[][] array) that returns the sum of values in the last column
i.	swap(int[][] array) that returns the array with the first and last column swapped
j.	two2one(int[][] array) that returns the 2D array converted to 1D array
Then, write a program in which use all defined methods. Display results.
*/

package ClassStructure;

public class MyArray {

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

    static String reverse(int[] array){

        int[] arr = new int[array.length];
        for (int i = array.length; i > 0; i--){
            arr[i-1] = array[array.length - i];
        }

        String arrStrn = "";
        for (int i = 0; i<arr.length;i++){
            arrStrn+=arr[i]+" ";
        }
        return arrStrn;
    }

    static boolean compare(int[] array1, int[] array2){
        boolean rowne = true;
        if (array1.length!=array2.length){
            rowne = false;
            return rowne;
        }
        else{
            for (int i = 0; i<array1.length;){
                if (array1[i]!=array2[i]){
                    break;
                }
                return rowne;
            }
            rowne = false;
            return rowne;
            
        }
    }

    static String different(int[] array1, int[] array2){
        String nima = "";
        for(int i = 0; i<array1.length; i++){
            boolean jest = false;
            for(int j = 0; j<array2.length; j++){
                if (array1[i] == array2[j]){
                    jest = true;
                    break;
                }
            }
            if (jest == false){
                nima+=" ";
                nima+=array1[i];
            }
        }
        return nima;
    }

    public static void main(String[] args){

        int arr[] = {1, 2, 3, 4, 5, 6, 7, -10, 9};
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, -10, 9};
        int arr2[] = {3, 4, 3, 5, 7, 5, 2, 9, 3,};
        int arr3[] = {1, 2, 3, 4};
        int arr4[] = {1, 2, 3, 5};

        System.out.println(MyArray.even(arr));
        System.out.println(MyArray.positiveOdd(arr));
        System.out.println(MyArray.reverse(arr));
        System.out.println(MyArray.compare(arr1, arr2));
        System.out.println(MyArray.different(arr3, arr4));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
}
