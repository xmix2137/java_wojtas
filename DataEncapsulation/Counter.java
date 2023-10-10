/*18.	Define a class Counter that allows you to create a counter of integer type. The initial value of the counter is 0. 
The class includes an increase() method that increases the value of the counter by 1 and a decrease()
 method that decreases the value of the counter by 1. Also create the overloaded methods increase(int n) and decrease(int n)
  that allow you to increase or decrease the value of the counter by the value of n. Add a value()
   method in the class that returns a counter value. Sample result: */

package DataEncapsulation;

public class Counter {
    private int counterValue = 0;

    public void increase(){
        this.counterValue+=1;
    }

    public void decrease(){
        this.counterValue-=1;
    } 

    public void increase(int n){
        this.counterValue+=n;
    }

    public void decrease(int n){
        this.counterValue-=n;
    } 

    public int value(){
        return this.counterValue;
    }
    public static void main(String[] args){
        Counter c = new Counter();
        System.out.println(c.value());
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        System.out.println(c.value());

    }
}
