/*
- type: String
- name: String
- address: String
- NIP: String
- mail: String
- phoneNumber: String
- offeringProducts: arr((String), (int))

- displayProducts(): void
- addProduct(): void
- deleteProduct(): void
- displayInformation(): void
- changeProductsList(): void
 */

package ConceptualModeling;

public class Seller {

    String type;
    String name;
    String address;
    String NIP;
    String mail;
    String phoneNumber;
    String offeringProducts[];

    Seller(String type, String name, String address, String NIP, String mail, String phoneNumber, String offeringProducts[]){
        this.type = type;
        this.name = name;
        this.address = address;
        this.NIP = NIP;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.offeringProducts = offeringProducts;
    }

    public void displayProducts(){
        for (int i = 0; i<this.offeringProducts.length; i++){
        System.out.print(this.offeringProducts[i]+", ");
        }
        System.out.println();

    }

    public void addProducts(String product){

        String list2[];
        list2 = new String[this.offeringProducts.length + 1];

        for (int i = 0; i<this.offeringProducts.length; i++){
            list2[i] = this.offeringProducts[i];
        }

        list2[this.offeringProducts.length]=product;
        this.offeringProducts = list2;
    }

    public void deletelastProduct(){
        String list2[];
        list2 = new String[this.offeringProducts.length - 1];

        for (int i = 0; i<this.offeringProducts.length - 1; i++){
            list2[i] = this.offeringProducts[i];
        }

        this.offeringProducts = list2;
    }

    public static void main(String[] args){

        String produkty[] = {"dupa", "fasola"};

        Seller debil = new Seller("Firma", "Idioci", "Kraków", "213742069", "zjeby@gmail.com", "123", produkty);
        debil.displayProducts();
        debil.addProducts("gowno");
        debil.displayProducts();
        debil.deletelastProduct();
        debil.displayProducts();

    }
    
}
