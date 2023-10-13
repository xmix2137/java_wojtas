/*13.	Competitors are judged by five judges during the competition. Each judge can score 1, 2, 3, 4 or 5 points.
Then, the highest score and the lowest score are thrown out.
The arithmetic mean of the remaining three scores is calculated and this is the competitor's final result that is displayed.
Create a class diagram for the competition scoring system.
Define the class and write a program that calculates the final result for three players. */

package ConceptualModeling;

public class Competitors {

    int grades[];
    
    double finalScore;

    String name;

    Competitors(int grades[], String name){
        this.name = name;
        this.grades = grades;
    }

    public void calculateScore(){
        int max = this.grades[0];
        int min = this.grades[0];
        int suma = 0;

        for (int i = 0; i<this.grades.length; i++){
            if(this.grades[i]>max){
                max = this.grades[i];
            }
        }

        for (int i = 0; i<this.grades.length; i++){
            if(this.grades[i]<min){
                min = this.grades[i];
            }
        }

        for (int i = 0; i<this.grades.length; i++){
            suma+=this.grades[i];
        }

        this.finalScore = (suma-max-min)/(this.grades.length - 2);

    }

    public void displayScore(){
        System.out.println(name+" score: "+this.finalScore);
    }

    public static void main(String[] args){

        int grades1[] = {1, 2, 3, 4, 5};
        int grades2[] = {2, 4, 5, 5, 4};
        int grades3[] = {4, 2, 2, 2, 5};

        Competitors jeden = new Competitors(grades1, "Tomek");
        Competitors dwa = new Competitors(grades2, "Janek");
        Competitors trzy = new Competitors(grades3, "Staszek");
        jeden.calculateScore();
        jeden.displayScore();
        dwa.calculateScore();
        dwa.displayScore();
        trzy.calculateScore();
        trzy.displayScore();


    }
    
}
