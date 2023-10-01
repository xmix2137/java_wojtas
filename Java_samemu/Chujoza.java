package Java_samemu;

public class Chujoza {
    double weight;
    double height;
    double BMI = 0;
    public void calculateBMI(){
        BMI = weight/(height*height); 
    }

    public static void main(String[] args){
        Chujoza ktos = new Chujoza();
        ktos.weight = 89;
        ktos.height = 190;
        ktos.calculateBMI();
        System.out.println(ktos.BMI);
    }
    
}
