/*The Cities class includes an array attribute with city names. 
The initial value of the attribute is passed through a constructor parameter. 
The filter(char) method returns an object of the Cities class with those cities whose names start with the given character. 
The cities() method returns a string consisting of the city names contained in the object attribute. Example:*/

package Mock3;

public class Cities {
    String[] cities;

    Cities(String[] cities){
        this.cities = cities;
    }

    public Cities filter(char n){
        int licznik = 0;
        String arr1[] = new String[cities.length];
        for (int i = 0; i<this.cities.length; i++){
            char poczatek = this.cities[i].charAt(0);
            if (poczatek == n){
                licznik ++;
                arr1[i] = this.cities[i];
            }
        }
        String arr2[] = new String[licznik];  
        int licznik2 = 0;   
        for (int i = 0; i<arr1.length; i++){
            if (arr1[i] != null){
                arr2[licznik2] = arr1[i];
                licznik2 ++;
            }
        }

        Cities koniec = new Cities(arr2);
        return koniec;
    }

    public String cities(){
        String koniec = "";
        for (int i = 0; i<this.cities.length; i++){
            koniec+=this.cities[i];
        }
        return koniec;
    }

    public static void main(String[] args) {
        String[] arr = {"Warszawa","Sopot","Kielce","Szczecin", "Krakow", "Krzeszowice"};

        System.out.println(new Cities(arr).filter('K').cities());
    }
}
