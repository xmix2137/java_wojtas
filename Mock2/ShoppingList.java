/*4.	Define a ShoppingList class describing the list of products to be purchased 
according to the structure in the Product class. Add the add(Product product) 
method to add the product to the shopping list.
 The toString() method returns the names of the products in the shopping list, in the order they were added,
  separated by commas, without spaces, as a single string, and the total()
   method returns the total number of products to purchase. Example: 
   two products have been added to the shopping list: milk, 2 and apple, 4
toString()  "milk,apple"
total()  6

   */

package Mock2;

import java.util.ArrayList;

public class ShoppingList {
    ArrayList<Product> list = new ArrayList<Product>();

    public void add(Product product){
        this.list.add(product);
    }

    public String toString(){
        String toString = "";
        for (int i = 0; i<list.size(); i++ ){
            if (i == list.size()-1){
                toString += list.get(i).getName();
            }
            else {
                toString += list.get(i).getName()+",";
            }
        }
        return toString;
    }

    public int total(){
        int liczba = 0;
        for (int i = 0; i<list.size(); i++ ){
            liczba += this.list.get(i).getQuantity();
        }
        return liczba;
    }

    public static void main(String[] args){
        Product produkt = new Product("milk", 2);
        Product produkt1 = new Product("apple", 4);
        ShoppingList lista = new ShoppingList();
        lista.add(produkt);
        lista.add(produkt1);
        System.out.println(lista.toString());
        System.out.println(lista.total());
    }
}
