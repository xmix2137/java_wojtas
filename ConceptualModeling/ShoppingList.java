/*15.	Create a class diagram for a shopping list. You can use, for example, an ArrayList as the data structure for storing products. Then, based on the class diagram, define the class. Finally, create an object representing a shopping list and perform the following actions:
a.	Display the list of products (should be empty)
b.	Display information about the number of products to be purchased
c.	Add three products to your shopping list
d.	Display the list of products
e.	Display information about the number of products to be purchased
f.	Add one product to your shopping list
g.	Display the list of products
h.	Display information about the number of products to be purchased
16.	Add to the list of products the ability to enter product names from the keyboard.
 */


package ConceptualModeling;

import java.util.Scanner;

public class ShoppingList{

    String list[];

    ShoppingList(String list[]){
        this.list = list;
    }

    public void displayList(){
        for (int i =0; i<this.list.length; i++){
            System.out.print(this.list[i]+", ");
        }
        System.out.println();
    }

    public void displayNumber(){
        System.out.println(this.list.length);
    }

    public void addProducts(String product){

        String list2[];
        list2 = new String[this.list.length + 1];

        for (int i = 0; i<this.list.length; i++){
            list2[i] = this.list[i];
        }

        list2[this.list.length]=product;
        this.list = list2;
    }

    public void addProducts(){

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter product");
        String product = myObj.nextLine();
        myObj.close();
        
        String list2[];
        list2 = new String[this.list.length + 1];

        for (int i = 0; i<this.list.length; i++){
            list2[i] = this.list[i];
        }

        list2[this.list.length]=product;
        this.list = list2;
    }

    public static void main(String[] args){

        String[] listeczka = {};

        ShoppingList list = new ShoppingList(listeczka);
        list.displayList();
        list.displayNumber();
        list.addProducts("Cytryna");
        list.addProducts("Banan");
        list.addProducts("Mleko");
        list.displayList();
        list.displayNumber();
        list.addProducts("Kakao");
        list.displayList();
        list.displayNumber();
        list.addProducts();
        list.displayList();

    }
}