package Mock2;

// create class Product in a separate file
public class Product {
  private String name;
  private int quantity;
  Product(String n, int q){
    name=n;
    quantity=q;
  }
  public String getName(){
    return name;
  }
  public int getQuantity(){
    return quantity;
  }
}
