/*4.Utwórz klasę zawierająca metody statyczne pozwalajace na następujące operacje na macierzach dwuwymiarowych liczb całkowitych:
obliczenie liczby wierszy
obliczenie liczby kolumn,
obliczenie sumy liczb w poszczególnych kolumnach
obliczenie sumy liczb w poszczególnych wierszach
obliczenie największej wartości i wskazanie wiersza i kolumny w której się znajduje
obliczenie najmniejszej wartości i wskazanie wiersza i kolumny w której się znajduje
utworzenie transpozycji macierzy
wyświetlenie zadanej macierzy\

Następnie wykonaj metody na macierzy:
{[1,13],[8,6],[22,35],[5,9],[6.14],[9,17]]
 */

package KodyWojtasa;

public class Macierze {

    static int iloscWierszy(int[][] macierz){
        return macierz.length;
    }

    static int iloscKolumn(int[][] macierz){
        return macierz[0].length;
    }

    static int sumaWKolumnie(int[][] macierz, int liczba){
        int suma = 0;
        for (int i = 0; i<macierz.length; i++){
            suma+=macierz[i][liczba]; 
        }
        return suma;
    }

    static int sumaWWierszu(int[][] macierz, int liczba){
        int suma = 0;
        for (int i = 0; i<macierz[liczba].length; i++){
            suma+=macierz[liczba][i]; 
        }
        return suma;
    }

    static String maxi(int[][] macierz){
        int maxi = macierz[0][0];
        int wiersz = 0;
        int kolumna = 0;
        String odp = "";

        for (int i = 0; i<macierz.length; i++){
            for (int j = 0; j<macierz[i].length; j++){
                if (macierz[i][j]>maxi){
                    maxi = macierz[i][j];
                    wiersz = i;
                    kolumna = j;
                }
            }
            
        }
        odp = "Max: "+maxi+", wiersz: "+wiersz+", kolumna: "+kolumna;
        return odp;
    }

    static String mini(int[][] macierz){
        int mini = macierz[0][0];
        int wiersz = 0;
        int kolumna = 0;
        String odp = "";

        for (int i = 0; i<macierz.length; i++){
            for (int j = 0; j<macierz[i].length; j++){
                if (macierz[i][j]<mini){
                    mini = macierz[i][j];
                    wiersz = i;
                    kolumna = j;
                }
            }
            
        }
        odp = "Min: "+mini+", wiersz: "+wiersz+", kolumna: "+kolumna;
        return odp;
    }

    static void wyswietl(int[][] macierz){
        for (int i = 0; i<macierz.length; i++){
            for (int j = 0; j<macierz[i].length; j++){
                System.out.print(macierz[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static int[][] transpozycja(int[][] macierz){
        int [][] macierzT = new int[macierz[0].length][macierz.length];
        for (int i = 0; i<macierz[0].length; i++){
            for (int j = 0; j<macierz.length; j++){
                macierzT[i][j] = macierz[j][i];
            }
        }
        return macierzT;
    }

    public static void main(String[] args){
        int[][] macierz = {{1,13}, {8,6}, {22,35}, {5,9}, {6, 14}, {9,17}};
        System.out.println(Macierze.iloscWierszy(macierz));
        System.out.println(Macierze.iloscKolumn(macierz));
        System.out.println(Macierze.sumaWKolumnie(macierz, 0));
        System.out.println(Macierze.sumaWWierszu(macierz, 0));
        System.out.println(Macierze.maxi(macierz));
        System.out.println(Macierze.mini(macierz));
        Macierze.wyswietl(macierz);
        System.out.println();
        int[][] macierzT = Macierze.transpozycja(macierz);
        Macierze.wyswietl(macierzT);
    }
}
