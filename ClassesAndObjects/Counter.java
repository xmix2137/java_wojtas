//17.	Design a simple counter. The initial value of the counter is 0.
// The counter can be increased or decreased by one, and increased and decreased by 10.
// It is possible to reset the counter to its initial value. Then define a class for counters.
// Create two counters. Set the first counter to 23 and the second one to -47.

package ClassesAndObjects;

public class Counter {
    int counterValue = 0;

    //public Counter(){
        //counterValue = 0;
    //}
    public void addOne(){
        counterValue++;
    }
    public void minusOne(){
        counterValue--;
    }
    public void addTen(){
        counterValue+=10;
    }
    public void minusTen(){
        counterValue-=10;
    }
    public void reset(){
        counterValue = 0;
    }
    public void show(){
        System.out.println(counterValue);
    }

    public static void main(String[] args){
        Counter licznik1 = new Counter();
        Counter licznik2 = new Counter();
        licznik1.addTen();
        licznik1.addTen();
        licznik1.addOne();
        licznik1.addOne();
        licznik1.addOne();
        licznik1.show();
        licznik2.minusTen();
        licznik2.minusTen();
        licznik2.minusTen();
        licznik2.minusTen();
        licznik2.minusOne();
        licznik2.minusOne();
        licznik2.minusOne();
        licznik2.minusOne();
        licznik2.minusOne();
        licznik2.minusOne();
        licznik2.minusOne();
        licznik2.show();

    }
}
