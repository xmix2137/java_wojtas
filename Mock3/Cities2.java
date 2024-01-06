package Mock3;

import java.util.ArrayList;

public class Cities2 {
    String[] cities;

    Cities2(String[] cities){
        this.cities = cities;
    }

    public Cities filter(char n){

        ArrayList<String> lista = new ArrayList<String>();

        int licznik = 0;
        for (int i = 0; i<this.cities.length; i++){
            char poczatek = this.cities[i].charAt(0);
            if (poczatek == n){
                lista.add(this.cities[i]);
                licznik++;
            }
        }
        String arr2[] = new String[licznik];     
        for (int i = 0; i<lista.size(); i++){
            arr2[i] = lista.get(i);
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

        System.out.println(new Cities2(arr).filter('K').cities());
    }
}
