/*2.	Define an Arrays class that contains a static method arr(int[] arr1, int[] arr2).
The method returns true if the number of two-digit numbers contained in arr1 and arr2 are the same or false otherwise. Example: 
int[] arr1 = {15,8,2,37,49,117}
int[] arr2 = {9,6,7,12,48,4,6,90,5}
arr(arr1,arr2)  true
*/

package Mock2;

public class Arrays {
    static boolean arr(int[] arr1, int[] arr2){
        int licznik1 = 0;
        int licznik2 = 0;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i]>=10 && arr1[i]<=99){
                licznik1++;
            }
        }
        for (int i = 0; i < arr2.length; i++){
            if (arr2[i]>10 && arr2[i]<=99){
                licznik2++;
            }
        }
        if (licznik1 == licznik2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){

        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};

        System.out.println(Arrays.arr(arr1, arr2));
    }
}
