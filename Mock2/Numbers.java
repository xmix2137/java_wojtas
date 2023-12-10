/*1.	Define a Numbers class that contains a constructor with five int parameters that allows you to pass 5 integers to the object.
 Add a different() method that returns true if all numbers are different or false otherwise. Example: 
 sample five numbers: 3 4 2 1 6
different()  true
sample five numbers: 9 7 4 3 7
different()  false
*/

package Mock2;

public class Numbers {

    int number1;
    int number2;
    int number3;
    int number4;
    int number5;

    Numbers(int number1, int number2, int number3, int number4, int number5){
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
        this.number5 = number5;
    }

    public boolean different(){
        if(number1 != number2 && number1 != number3 && number1 != number4 && number1 != number5 &&
        number2 != number3 && number2 != number4 && number2 != number5 &&
        number3 != number4 && number3 != number5 &&
        number4!= number5){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args){
        Numbers numbers = new Numbers(3, 4, 2, 1, 6);
        Numbers numbers1 = new Numbers(9, 7, 4, 3, 7);
        System.out.println(numbers.different());
        System.out.println(numbers1.different());
    }
}
