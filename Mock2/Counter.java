package Mock2;

// create class Counter in a separate file
public class Counter {

  private int counter;

  Counter(){};
  Counter(int c){
    counter=c;
    }
  public void add1(){
    counter++;
    }
  public int getCounter(){
    return counter;
    }
}

