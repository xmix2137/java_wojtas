/*(C3.java) Define a class that contains two statiic methods:
(1) isAlphabet(String t) that returns true if the letters in the text t
are in alphabetical order or false otherwise and 
(2) hideText(String t) that returns the text t in which all 
characters except the first and last characters are converted to an asterisk. Sample result: */

package Mock1;

public class C3 {
    static boolean isAlphabet(String t){
        boolean isAlpha = true;
        for (int i = 0; i<t.length()-1; i++){
            if (t.charAt(i)>t.charAt(i+1)){
                isAlpha = false;
                break;
            }
        }
        return isAlpha;
    }

    static String hideText(String t){
        String nowy = "";
        nowy+=t.substring(0, 1);
        for (int i = 0; i<(t.length()-2); i++){
            nowy+="*";
        }
        nowy+=t.substring(t.length()-1, t.length());

        return nowy;
    }

    public static void main(String[] args){
        System.out.println(C3.hideText("Dupa"));
        System.out.println(C3.isAlphabet("abcdef"));
    }
}
