package AggregationAndComposition;

import java.util.ArrayList;

public class Books {
    String name;
    Writer author;
    ArrayList<Chapter> chapters = new ArrayList<Chapter>();

    public Books(String name, Writer author){
        this.name = name;
        this.author = author;
    }

    public String getName(){
        return this.name;
    }
}
