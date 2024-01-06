package Mock3;

abstract class Food {
    private String name;
    private float price;

    Food(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    abstract void setPrice();

}
