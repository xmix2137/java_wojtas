package Mock3;

public class Pizza extends Food implements Extra{

    int size;

    Pizza(String name, int size){
        super(name);
        this.size = size;
    }

    public float discount(){
        if (this.getPrice()>=30){
            return 0.05f;
        }
        else{
            return 0f;
        }
    }

    public float delivery(){
        if (this.size <50){
            return 6f;
        }
        else{
            return 8f;
        }
    }

    public float delivery(int tip){
        if (this.size <50){
            return 6f+tip;
        }
        else{
            return 8f+tip;
        }
    }

    void setPrice(){
        float price = this.size - 10;
        this.setPrice(price);
    }
}
