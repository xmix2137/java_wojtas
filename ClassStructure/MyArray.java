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

    static boolean exist(int number, int[] array){
        boolean exist = false;
        for(int i = 0; i<array.length; i++){
            if (array[i]==number){
                exist = true;
                break;
            }
        }
        return exist;
    }

    static int secondMax(int[] array){
        int max;
        int sec_max;

        if(array[0]>array[1]){
            max = array[0];
            sec_max = array[1];
        }
        else{
            sec_max = array[0];
            max = array[1];
        }

        for (int i = 2; i<array.length; i++){
            if (array[i]>max){
                sec_max = max;
                max = array[i];        
            }
            else if (array[i]<max && array[i]>sec_max){
                sec_max = array[i];
            }
        }

        return sec_max;
    }

    static int lastColumn(int[][] array){
        int suma = 0;
        for (int i = 0; i<array.length; i++){
            suma += array[i][array[i].length-1];
        }
        return suma;
    }

    static String swap(int[][] array){
        int pomoc;

        for(int i = 0; i<array.length; i++){
            pomoc = array[i][0];
            array[i][0] = array[i][array[i].length-1];
            array[i][array[i].length-1] = pomoc;
        }

        String arr = "";

        for(int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                arr += array[i][j];
                arr += " ";
            }
            arr+=",";
        }

        return arr;
        
    }

    static String two2one(int[][] array){

        String nowyArr = "";

        int liczba = array.length*array[0].length;

        int[] nowa = new int[liczba];

        int licznik = 0;

        for(int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                nowa[licznik] = array[i][j];
                licznik++;
            }
        }

        for(int i = 0; i<nowa.length; i++){
            nowyArr += nowa[i];
            nowyArr += ", ";
        }

        return nowyArr;
    }



    public static void main(String[] args){

        int arr[] = {1, 2, 3, 4, 5, 6, 7, -10, 9};
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, -10, 9};
        int arr2[] = {3, 4, 3, 5, 7, 5, 2, 9, 3,};
        int arr3[] = {1, 2, 3, 4};
        int arr4[] = {1, 2, 3, 5};
        int arr5[][] = {{1, 2, 3}, {8, 10, 12}, {2, 0, 9}};

        System.out.println(MyArray.even(arr));
        System.out.println(MyArray.positiveOdd(arr));
        System.out.println(MyArray.reverse(arr));
        System.out.println(MyArray.compare(arr1, arr2));
        System.out.println(MyArray.different(arr3, arr4));
        System.out.println(MyArray.exist(2, arr4));
        System.out.println(MyArray.secondMax(arr2));
        System.out.println(MyArray.lastColumn(arr5));
        System.out.println(MyArray.two2one(arr5));
        System.out.println(MyArray.swap(arr5));
        System.out.println(MyArray.two2one(arr5));
    }
    
}
