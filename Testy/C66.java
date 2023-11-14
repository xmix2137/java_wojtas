package Testy;

public class C66 {
    String name;
    float price;
    boolean imported;


    public void setName(String name){
        String nowe = "";
        String pierwsza = name.substring(0, 1);
        String upper = pierwsza.toUpperCase();
        String druga = name.substring(1, name.length());
        String lower = druga.toLowerCase();
        nowe+=upper;
        nowe+=lower;
        this.name = nowe;
    }

    public void setPrice(float price){
        if(price>=0){
            this.price = price;
        }
    }

    public void setImported(boolean imported){
        this.imported = imported;
    }

    public String getName(){
        return this.name;
    }

    public float getPrice(){
        return this.price;
    }

    public boolean getImported(){
        return this.imported;
    }

    public static void main(String[] args){
        C66 o = new C66();
        o.setName("duPeCZka");
        System.out.println(o.getName());
    }
    
}

