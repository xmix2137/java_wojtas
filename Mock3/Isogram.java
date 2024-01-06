/*The Isogram class includes the static isogram(String) method. 
The method returns true if the text parameter is an isogram or false otherwise. 
An isogram is a string where all characters are different. Example:
isogram("red sun")  true
isogram("blue water")  false
isogram("BLUE water")  true
isogram("my blue water")  false
*/

package Mock3;

public class Isogram {

    static boolean isogram(String n){
        boolean sprawdz = true;
        char[] tablica = n.toCharArray();
        for (int i = 0; i<tablica.length; i++){
            for (int j = 0; j<tablica.length; j++){
                if (i!=j){
                    if(tablica[i]==tablica[j]){
                        sprawdz = false;
                        break;
                    }
                }
            }
        }
        if(sprawdz == false){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        String nazwa = "o n t";
        System.out.println(Isogram.isogram(nazwa));

    }
}
