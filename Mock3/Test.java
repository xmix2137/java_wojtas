package Mock3;

public class Test {
    String[] cities = {"Warszawa","Sopot","Kielce","Szczecin", "Krakow", "Krzeszowice"};

    public String[] dupa(char n){
        int licznik = 0;
        String arr1[] = new String[cities.length];
        for (int i = 0; i<this.cities.length; i++){
            char poczatek = this.cities[i].charAt(0);
            if (poczatek == n){
                licznik ++;
                arr1[i] = this.cities[i];
            }
        }
        return arr1;
    }

    public int dupa1(char n){
        int licznik = 0;
        String arr1[] = new String[cities.length];
        for (int i = 0; i<this.cities.length; i++){
            char poczatek = this.cities[i].charAt(0);
            if (poczatek == n){
                licznik ++;
                arr1[i] = this.cities[i];
            }
        }
        return licznik;
    }

    public String[] dupa3(){
        int licznik = 3;
        String[] arr1 = {"","","Kielce","", "Krakow", "Krzeszowice"};
        String arr2[] = new String[licznik];  
        int licznik2 = 0;   
        for (int i = 0; i<arr1.length; i++){
            if (arr1[i] != ""){
                arr2[licznik2] = arr1[i];
                licznik2 ++;
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        Test test = new Test();
        String[] test1 = test.dupa('K');
        for (int i = 0; i<test1.length; i++){
            System.out.println(test1[i]);
        }
        System.out.println(test.dupa1('K'));
        System.out.println();
        System.out.println(test.dupa3());
        String[] arr = test.dupa3();
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }


}
