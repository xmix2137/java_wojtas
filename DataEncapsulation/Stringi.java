/*14.	The class String includes methods for examining individual characters of the sequence,
 for comparing strings, for searching strings, for extracting substrings, and for creating a
  copy of a string with all characters translated to uppercase or to lowercase. You can use the methods in your programs.
   Write a program that, for the text:
"Have a nice day!"
calculates and displays:
a.	The number of characters
b.	The first 9 characters
c.	True if the text ends with the suffix "day!"
d.	True if the text is not empty
e.	Index of the last occurrence of the character ‘e’
f.	The text in which each space character has been replaced with a minus sign
g.	The text converted to upper case
 */

package DataEncapsulation;

public class Stringi {
    
    static int theNumberOfCharacters(String napis){
        return napis.length();
    }

    static String firstNineLetters(String napis){
        return napis.substring(0,9);
    }

    static boolean endsWithDay(String napis){
        return napis.endsWith("day!");
    }

    static boolean isNotEmpty(String name){
        if(name.isEmpty() == false){
            return true;
        }
        else{
            return false;
        }
    }

    static int lastE(String name){
        return name.lastIndexOf("e");
    }

    static String textToMinus(String name){
        return name.replaceAll(" ", "-");
    }

    static String toUpper(String name){
        return name.toUpperCase();
    }


    public static void main(String[] args){
        String napis = "Have a nice day!";
        System.out.println(Stringi.theNumberOfCharacters(napis));
        System.out.println(Stringi.firstNineLetters(napis));
        System.out.println(Stringi.endsWithDay(napis));
        System.out.println(Stringi.isNotEmpty(napis));
        System.out.println(Stringi.lastE(napis));
        System.out.println(Stringi.textToMinus(napis));
        System.out.println(Stringi.toUpper(napis));
    }
}
