/*24.	A bank buys and sells Euro. Write a program that,
 based on the Euro buying and selling rates saved in variables,
  calculates the difference between the buying and selling rates (spread).
   Display result with 4 decimal places (you can use printf() method). Sample result:
Bank buys EUR: 4.5940
Bank sells EUR: 4.6250
Spread: 0.0310
 */

package ClassesAndObjects;

public class Bank {

    double buying_rate = 4.5940;
    double selling_rate = 4.6250;

    public static void main(String[] args){
        Bank bank = new Bank();
        double spread = bank.selling_rate - bank.buying_rate;
        System.out.print("Bank buys EUR: ");
        System.out.printf("%.4f", bank.buying_rate);
        System.out.println();
        System.out.print("Bank sells EUR: ");
        System.out.printf("%.4f", bank.selling_rate);
        System.out.println();
        System.out.print("Spread: ");
        System.out.printf("%.4f", spread);
        System.out.println();
        System.out.printf("%.3f", bank.buying_rate);


    }
    
}
