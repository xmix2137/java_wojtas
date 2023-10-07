/*15.	The Product class describes food products using two attributes:
 the product name and whether the product is vegetarian. Define the class, its attributes,
  and getter and setter methods for all attributes. Then, create a product, set attributes'
   values and display product information. */

package DataEncapsulation;

public class Product {

    private String name;
    private boolean vege;

    public void setName(String name){
        this.name = name;
    }

    public void setVege(boolean vege){
        this.vege = vege;
    }

    public String getName(){
        return name;
    }

    public boolean getVege(){
        return vege;
    }

    Product(String name, boolean vege){
        this.setName(name);
        this.setVege(vege);
    }

    public void display(){
        System.out.println("Name: "+this.getName());
        System.out.println("Vege: "+this.getVege());
    }

    public static void main(String[] args){
        Product mleko = new Product("mleko", false);
        Product pomidor = new Product("Pomidor", true);
        mleko.display();
        pomidor.display();
    }
    
}
