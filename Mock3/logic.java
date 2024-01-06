/*The Logic class contains an array attribute of logical values. 
The attribute is initialized through a constructor parameter. 
The opposite() method returns the number of array elements for which both adjacent elements have the opposite value. Example: */

package Mock3;

public class logic {
    boolean[] tablica;
    logic(boolean[] tablica){
        this.tablica = tablica;
    }
    public int opposite(){
        int licznik = 0;
        for (int i = 1; i<tablica.length-1; i++){
            if(tablica[i]!=tablica[i+1] && tablica[i]!=tablica[i-1]){
                licznik ++;
            }
        }
        return licznik;
    }

    public static void main(String[] args) {
        boolean[] arr1 = {true,false,false};
        boolean[] arr2 = {true,false,true,false};
        boolean[] arr3 = {true,false,true,true,false,true,false,true,false};
        logic log1 = new logic(arr1);
        logic log2 = new logic(arr2);
        logic log3 = new logic(arr3);
        System.out.println(log1.opposite());
        System.out.println(log2.opposite());
        System.out.println(log3.opposite());

    }
}
