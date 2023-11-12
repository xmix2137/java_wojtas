/*(C2.java) Define a class that allows you to create a counter of integer type.
The initial value of the counter is 0.
The class includes an increase() method that increases the value of the counter by 1 and a decrease()
method that decreases the value of the counter by 1.
Also, create two overloaded methods: increase(int n) and decrease(int n)
that allow you to increase or decrease the value of the counter by n. 
Add a value() method that returns a counter value. Sample result: */

package Mock1;

public class C2 {
    int value = 0;

    public void increase(){
        this.value ++;
    }

    public void decrease(){
        this.value --;
    }

    public void increase(int n){
        this.value += n;
    }

    public void decrease(int n){
        this.value -= n;
    }

    public int value(){
        return this.value;
    }
}
