package Testy;

public class C77 {
    static String metoda(String wyraz){
        String koniec = "";
        koniec += wyraz.substring(0, 1);
        for (int i = 1; i<wyraz.length(); i++){
            if (i%2 == 0){
                koniec+="-";
                koniec+=wyraz.substring(i, i+1);
            }
            if (i%2 != 0){
                koniec+="+";
                koniec+=wyraz.substring(i, i+1);
            }
        }
        return koniec;
    }

    public static void main(String[] args){
        System.out.println(C77.metoda("Katamaran"));
    }
}
