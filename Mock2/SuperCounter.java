/*5.	Based on the Counter class, define a derived class SuperCounter.
 Add a constructor with an int parameter to set the initial value of the counter.
  Add the addN(int n) method to increment the counter value by any n value. */

package Mock2;

public class SuperCounter extends Counter {
    SuperCounter(int counter){
        super(counter);
    }

    public void addN(int n){
        for (int i = 0; i<n; i++){
            this.add1();
        }
    }

    public static void main(String[] args){
        SuperCounter counter = new SuperCounter(0);
        counter.addN(5);
        System.out.println(counter.getCounter());
    }
    
}
