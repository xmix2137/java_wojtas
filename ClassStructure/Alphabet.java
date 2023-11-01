/*14.	Define a class Alphabet that contains a 
static method isAlphabet(String t) that returns true if the letters in the text t are 
in alphabetical order or false otherwise. Sample result:
Alphabet.isAlphabet("abegsw") returns true
Alphabet.isAlphabet("abcmhsw") returns false
 */

package ClassStructure;

public class Alphabet {

    static boolean isAlphabet(String t){

        boolean isAlpha = true;

        for (int i = 0; i < t.length()-1; i++) {
            if (t.charAt(i)>t.charAt(i+1)){
                isAlpha = false;
                break;
            }
        }

        if(t.charAt(t.length()-2)>t.charAt(t.length()-1)){
            isAlpha = false;
        }

        return isAlpha;

    }
    public static void main(String[] args){

        System.out.println(Alphabet.isAlphabet("abegsw"));
        System.out.println(Alphabet.isAlphabet("abcmhsw"));

    }
    
}
