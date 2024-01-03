/*7.	The Cities class includes an attribute in the form of an array with city names.
The initial value of the attribute is passed through a constructor parameter.
The filter(char) method returns an object of the Cities class with those cities whose names start with the given character.
The cities() method returns a string consisting of the city names contained in the object attribute. 
Example:
Cities(["Warszawa","Sopot","Kielce","Szczecin"]).filter('S').cities()  "SopotSzczecin"
 */
package Mock2;
import java.util.ArrayList;

public class Cities {
    ArrayList<String> cities;

    Cities(ArrayList<String> cities){
        this.cities = cities;
    }


    public Cities filter(char litera){
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i<this.cities.size(); i++){
            if (cities.get(i).startsWith(String.valueOf(litera))){
                arr.add(cities.get(i));
            }
        }
        Cities miastaa = new Cities(arr);

        return miastaa;
    }

    public String cities(){
        String miastaString = "";
        for (int i = 0; i<this.cities.size(); i++){
            if (i == this.cities.size()-1){
                miastaString += this.cities.get(i);
            }
            else{
                miastaString += this.cities.get(i)+",";
            }
        }
        return miastaString;
    }

    public static void main(String[] args){
        ArrayList<String> miastaaa = new ArrayList<>();
        miastaaa.add("Warszawa");
        miastaaa.add("Sopot");
        miastaaa.add("Kielce");
        miastaaa.add("Szczecin");

        Cities miasta = new Cities(miastaaa);
        //Cities(miastaaa).filter('S').cities();
        System.out.println(miasta.filter('S').cities());
    }
}
