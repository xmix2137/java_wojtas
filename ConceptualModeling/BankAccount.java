/*9.	Write a program that performs the following actions for the bank account:
a.	Deposit PLN 500
b.	Display balance
c.	Deposit PLN 200
d.	Display balance
e.	Withdraw PLN 300
f.	Display balance

10.	If your account balance is less than the withdrawal amount, no withdrawal is possible.
 Include this condition in the program. When you try to withdraw, display a message.


11.	In line with the bank's policy, you can withdraw no more than PLN 500 from your account at one time.
Include these limitation in your program. Display a message when trying to withdraw a larger amount.

 */

package ConceptualModeling;

public class BankAccount {

    int accountMoney;

    BankAccount(){
        this.accountMoney = 0;
    }

    public void deposit(int deposit){

        this.accountMoney+=deposit;
    }

    public void withdraw(int withdraw){

        if (this.accountMoney<withdraw){
            System.out.println("Withdrawal is not possible");
        }

        else if (withdraw>500){
            System.out.println("You can only withdrawal 500 PLN in one time");
        }

        else{
            this.accountMoney-=withdraw;
        }
    }

    public void displayBalance(){
        System.out.println("Balance: "+this.accountMoney + " PLN");
    }


    public static void main(String[] args){

        BankAccount konto1 = new BankAccount();
        konto1.deposit(500);
        konto1.displayBalance();
        konto1.deposit(200);
        konto1.displayBalance();
        konto1.withdraw(300);
        konto1.displayBalance();
        konto1.withdraw(1000);
        konto1.deposit(1000);
        konto1.withdraw(600);
    }
}
