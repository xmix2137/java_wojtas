/*3.Utwórz bibliotekę metod statycznych pozwalających na wykonywanie operacji na tabeli ciągów znakowych.
Metody powinny umożliwić znalezienie:
najkrótszego ciągu znaków,
najdłuższego ciągu znaków,
średniej długości ciągu znaków,
konwersję ciągów do dużych liter,
konwersję ciagów do małych liter,
zamiane dowolnego znaku na inny we wszystkich ciągach
Następnie napisz program wykonujący te metody na przykładowej tabeli ciągów
 */

package KodyWojtasa;

public class Znaki {

    static String najkrotszy(String[] tabela){
        String najkrotszy = tabela[0];
        for (int i = 0; i<tabela.length; i++){
            if (tabela[i].length()<najkrotszy.length()){
                najkrotszy = tabela[i];
            }
        }
        return najkrotszy;
    }

    static String najdluzszy(String[] tabela){
        String najdluzszy = tabela[0];
        for (int i = 0; i<tabela.length; i++){
            if (tabela[i].length()>najdluzszy.length()){
                najdluzszy = tabela[i];
            }
        }
        return najdluzszy;
    }

    static double srednia(String[] tabela){
        double iloscLiter = 0.0;
        for (int i = 0; i<tabela.length; i++){
            iloscLiter += tabela[i].length();
        }

        double srednia = iloscLiter/tabela.length;

        return srednia;
    }

    static String[] duze(String[] tabela){
        String[] tabela1 = new String[tabela.length];
        for (int i = 0; i<tabela.length; i++){
            tabela1[i] = tabela[i].toUpperCase();
        }
        return tabela1;
    }

    static void wydruk(String[] tabela){
        for (int i = 0; i<tabela.length; i++){
            System.out.println(tabela[i]);
        }
    }

    static String[] male(String[] tabela){
        String[] tabela1 = new String[tabela.length];
        for (int i = 0; i<tabela.length; i++){
            tabela1[i] = tabela[i].toLowerCase();
        }
        return tabela1;
    }

    static String[] zmiana(String[] tabela, char znak1, char znak2){
        String[] tabela2 = new String[tabela.length];
        for (int i = 0; i<tabela.length; i++){
            tabela[i].replace(znak1, znak2);
            tabela2[i] = tabela[i].replace(znak1, znak2);
        }
        return tabela2;
    }

    public static void main(String[] args){
        String[] tabelka = {"dupa", "as", "madagaskar", "marta", "konstantynopolitaneczka"};
        System.out.println(Znaki.najkrotszy(tabelka));
        System.out.println(Znaki.najdluzszy(tabelka));
        System.out.println(Znaki.srednia(tabelka));
        String[] tabelka2 = Znaki.duze(tabelka);
        Znaki.wydruk(tabelka2);
        String[] tabelka3 = Znaki.male(tabelka2);
        Znaki.wydruk(tabelka3);
        String[] tabelka4 = Znaki.zmiana(tabelka, 'a', 'y');
        Znaki.wydruk(tabelka4);
    }
    

}
