/*The Numbers class includes an array attribute of integers. 
The initial value of the attribute is passed through a constructor parameter. 
The class implements the interface:
interface Ok { boolean ok() }
The ok() method returns true when the even-indexed array elements contain even values and the odd-indexed array elements contain odd values. 
Otherwise, the method returns false. Example:
int[] arr1 = {6,7,6,1,4}
int[] arr2 = {2,5,2,8,4}
new Numbers(arr1).ok()  true
new Numbers(arr2).ok()  false
 */

package Mock3;

public class Numbers implements Ok{
    int[] tablica;

    Numbers(int[] tablica){
        this.tablica = tablica;
    }

    public boolean ok(){
        boolean prawda = true;
        for(int i = 0; i<tablica.length; i++){
            if(i%2 == 0){
                if(tablica[i]%2 !=0){
                    prawda = false;
                }
            }
            if(i%2 != 0){
                if(tablica[i]%2 ==0){
                    prawda = false;
                }
            }
        }
        if(prawda == true){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {6,7,6,1,4};
        int[] arr2 = {2,5,2,8,4};
        System.out.println(new Numbers(arr1).ok());
        System.out.println(new Numbers(arr2).ok());
    }
}
