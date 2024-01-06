/*The Product class contains two attributes: name (String) and price (float), initialized by a constructor and all get and set methods. 
Implement a Comparable interface that allows you to sort Product class objects by product price, descending. 
Example:
Product[] arr = 
   {new Product("milk",5), new Product("cheese",2), new Product("ham",9)}
Product[0].getPrice()  5
Product[1].getPrice()  2
Product[2].getPrice()  9
Arrays.sort(arr)
Product[0].getPrice()  9
Product[1].getPrice()  5
Product[2].getPrice()  2
 */

package Mock3;

public class Product implements ProductInterface{
    private String name;
    private float price;

    Product(String name, float price){
        this.setName(name);
        this.setPrice(price);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public float getPrice(){
        return this.price;
    }

    public Product[] sort(Product[] lista){
        for (int i = 0; i<lista.length; i++){
            for (int j = 0; j<lista.length; j++){
                Product pomoc;
                if(lista[i].getPrice()>lista[j].getPrice()){
                    pomoc = lista[i];
                    lista[i]=lista[j];
                    lista[j]=pomoc;
                }
            }
        }
            
        return lista;
    }

    public static void main(String[] args) {
        Product mleko = new Product("mleko", 10);
        Product[] arr = {new Product("milk",5), new Product("cheese",9), new Product("ham",2), new Product("ham",8  )};
        System.out.println(arr[0].getPrice());
        System.out.println(arr[1].getPrice());
        System.out.println(arr[2].getPrice());
        System.out.println(arr[3].getPrice());
        mleko.sort(arr);
        System.out.println();
        System.out.println(arr[0].getPrice());
        System.out.println(arr[1].getPrice());
        System.out.println(arr[2].getPrice());
        System.out.println(arr[3].getPrice());       

    }
}
